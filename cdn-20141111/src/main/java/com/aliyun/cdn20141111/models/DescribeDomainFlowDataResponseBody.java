// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20141111.models;

import com.aliyun.tea.*;

public class DescribeDomainFlowDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("FlowDataPerInterval")
    public DescribeDomainFlowDataResponseBodyFlowDataPerInterval flowDataPerInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainFlowDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainFlowDataResponseBody self = new DescribeDomainFlowDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainFlowDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainFlowDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainFlowDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainFlowDataResponseBody setFlowDataPerInterval(DescribeDomainFlowDataResponseBodyFlowDataPerInterval flowDataPerInterval) {
        this.flowDataPerInterval = flowDataPerInterval;
        return this;
    }
    public DescribeDomainFlowDataResponseBodyFlowDataPerInterval getFlowDataPerInterval() {
        return this.flowDataPerInterval;
    }

    public DescribeDomainFlowDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainFlowDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule extends TeaModel {
        @NameInMap("DomesticValue")
        public String domesticValue;

        @NameInMap("DynamicDomesticValue")
        public String dynamicDomesticValue;

        @NameInMap("DynamicOverseasValue")
        public String dynamicOverseasValue;

        @NameInMap("DynamicValue")
        public String dynamicValue;

        @NameInMap("OverseasValue")
        public String overseasValue;

        @NameInMap("StaticDomesticValue")
        public String staticDomesticValue;

        @NameInMap("StaticOverseasValue")
        public String staticOverseasValue;

        @NameInMap("StaticValue")
        public String staticValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Value")
        public String value;

        public static DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule self = new DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule setDomesticValue(String domesticValue) {
            this.domesticValue = domesticValue;
            return this;
        }
        public String getDomesticValue() {
            return this.domesticValue;
        }

        public DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule setDynamicDomesticValue(String dynamicDomesticValue) {
            this.dynamicDomesticValue = dynamicDomesticValue;
            return this;
        }
        public String getDynamicDomesticValue() {
            return this.dynamicDomesticValue;
        }

        public DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule setDynamicOverseasValue(String dynamicOverseasValue) {
            this.dynamicOverseasValue = dynamicOverseasValue;
            return this;
        }
        public String getDynamicOverseasValue() {
            return this.dynamicOverseasValue;
        }

        public DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule setDynamicValue(String dynamicValue) {
            this.dynamicValue = dynamicValue;
            return this;
        }
        public String getDynamicValue() {
            return this.dynamicValue;
        }

        public DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule setOverseasValue(String overseasValue) {
            this.overseasValue = overseasValue;
            return this;
        }
        public String getOverseasValue() {
            return this.overseasValue;
        }

        public DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule setStaticDomesticValue(String staticDomesticValue) {
            this.staticDomesticValue = staticDomesticValue;
            return this;
        }
        public String getStaticDomesticValue() {
            return this.staticDomesticValue;
        }

        public DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule setStaticOverseasValue(String staticOverseasValue) {
            this.staticOverseasValue = staticOverseasValue;
            return this;
        }
        public String getStaticOverseasValue() {
            return this.staticOverseasValue;
        }

        public DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule setStaticValue(String staticValue) {
            this.staticValue = staticValue;
            return this;
        }
        public String getStaticValue() {
            return this.staticValue;
        }

        public DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainFlowDataResponseBodyFlowDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule> dataModule;

        public static DescribeDomainFlowDataResponseBodyFlowDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainFlowDataResponseBodyFlowDataPerInterval self = new DescribeDomainFlowDataResponseBodyFlowDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainFlowDataResponseBodyFlowDataPerInterval setDataModule(java.util.List<DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainFlowDataResponseBodyFlowDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
