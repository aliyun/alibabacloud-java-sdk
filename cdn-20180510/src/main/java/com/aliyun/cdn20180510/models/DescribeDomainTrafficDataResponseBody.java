// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTrafficDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("TrafficDataPerInterval")
    public DescribeDomainTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval;

    public static DescribeDomainTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTrafficDataResponseBody self = new DescribeDomainTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainTrafficDataResponseBody setTrafficDataPerInterval(DescribeDomainTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval) {
        this.trafficDataPerInterval = trafficDataPerInterval;
        return this;
    }
    public DescribeDomainTrafficDataResponseBodyTrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public static class DescribeDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("HttpsDomesticValue")
        public String httpsDomesticValue;

        @NameInMap("Value")
        public String value;

        @NameInMap("OverseasValue")
        public String overseasValue;

        @NameInMap("HttpsValue")
        public String httpsValue;

        @NameInMap("HttpsOverseasValue")
        public String httpsOverseasValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("DomesticValue")
        public String domesticValue;

        public static DescribeDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule self = new DescribeDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setHttpsDomesticValue(String httpsDomesticValue) {
            this.httpsDomesticValue = httpsDomesticValue;
            return this;
        }
        public String getHttpsDomesticValue() {
            return this.httpsDomesticValue;
        }

        public DescribeDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setOverseasValue(String overseasValue) {
            this.overseasValue = overseasValue;
            return this;
        }
        public String getOverseasValue() {
            return this.overseasValue;
        }

        public DescribeDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setHttpsOverseasValue(String httpsOverseasValue) {
            this.httpsOverseasValue = httpsOverseasValue;
            return this;
        }
        public String getHttpsOverseasValue() {
            return this.httpsOverseasValue;
        }

        public DescribeDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setDomesticValue(String domesticValue) {
            this.domesticValue = domesticValue;
            return this;
        }
        public String getDomesticValue() {
            return this.domesticValue;
        }

    }

    public static class DescribeDomainTrafficDataResponseBodyTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeDomainTrafficDataResponseBodyTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTrafficDataResponseBodyTrafficDataPerInterval self = new DescribeDomainTrafficDataResponseBodyTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTrafficDataResponseBodyTrafficDataPerInterval setDataModule(java.util.List<DescribeDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
