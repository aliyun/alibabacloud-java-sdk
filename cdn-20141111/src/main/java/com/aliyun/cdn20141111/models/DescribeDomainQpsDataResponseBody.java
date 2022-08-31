// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20141111.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("QpsDataInterval")
    public DescribeDomainQpsDataResponseBodyQpsDataInterval qpsDataInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsDataResponseBody self = new DescribeDomainQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainQpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainQpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainQpsDataResponseBody setQpsDataInterval(DescribeDomainQpsDataResponseBodyQpsDataInterval qpsDataInterval) {
        this.qpsDataInterval = qpsDataInterval;
        return this;
    }
    public DescribeDomainQpsDataResponseBodyQpsDataInterval getQpsDataInterval() {
        return this.qpsDataInterval;
    }

    public DescribeDomainQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainQpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule extends TeaModel {
        @NameInMap("AccDomesticValue")
        public String accDomesticValue;

        @NameInMap("AccOverseasValue")
        public String accOverseasValue;

        @NameInMap("AccValue")
        public String accValue;

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

        public static DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule self = new DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setAccDomesticValue(String accDomesticValue) {
            this.accDomesticValue = accDomesticValue;
            return this;
        }
        public String getAccDomesticValue() {
            return this.accDomesticValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setAccOverseasValue(String accOverseasValue) {
            this.accOverseasValue = accOverseasValue;
            return this;
        }
        public String getAccOverseasValue() {
            return this.accOverseasValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setAccValue(String accValue) {
            this.accValue = accValue;
            return this;
        }
        public String getAccValue() {
            return this.accValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setDomesticValue(String domesticValue) {
            this.domesticValue = domesticValue;
            return this;
        }
        public String getDomesticValue() {
            return this.domesticValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setDynamicDomesticValue(String dynamicDomesticValue) {
            this.dynamicDomesticValue = dynamicDomesticValue;
            return this;
        }
        public String getDynamicDomesticValue() {
            return this.dynamicDomesticValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setDynamicOverseasValue(String dynamicOverseasValue) {
            this.dynamicOverseasValue = dynamicOverseasValue;
            return this;
        }
        public String getDynamicOverseasValue() {
            return this.dynamicOverseasValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setDynamicValue(String dynamicValue) {
            this.dynamicValue = dynamicValue;
            return this;
        }
        public String getDynamicValue() {
            return this.dynamicValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setOverseasValue(String overseasValue) {
            this.overseasValue = overseasValue;
            return this;
        }
        public String getOverseasValue() {
            return this.overseasValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setStaticDomesticValue(String staticDomesticValue) {
            this.staticDomesticValue = staticDomesticValue;
            return this;
        }
        public String getStaticDomesticValue() {
            return this.staticDomesticValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setStaticOverseasValue(String staticOverseasValue) {
            this.staticOverseasValue = staticOverseasValue;
            return this;
        }
        public String getStaticOverseasValue() {
            return this.staticOverseasValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setStaticValue(String staticValue) {
            this.staticValue = staticValue;
            return this;
        }
        public String getStaticValue() {
            return this.staticValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainQpsDataResponseBodyQpsDataInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule> dataModule;

        public static DescribeDomainQpsDataResponseBodyQpsDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainQpsDataResponseBodyQpsDataInterval self = new DescribeDomainQpsDataResponseBodyQpsDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainQpsDataResponseBodyQpsDataInterval setDataModule(java.util.List<DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
