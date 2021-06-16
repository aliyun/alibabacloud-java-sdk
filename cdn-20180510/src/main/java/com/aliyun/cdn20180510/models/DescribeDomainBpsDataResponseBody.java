// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IspNameEn")
    public String ispNameEn;

    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("BpsDataPerInterval")
    public DescribeDomainBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval;

    public static DescribeDomainBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBpsDataResponseBody self = new DescribeDomainBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainBpsDataResponseBody setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeDomainBpsDataResponseBody setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDomainBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainBpsDataResponseBody setBpsDataPerInterval(DescribeDomainBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval) {
        this.bpsDataPerInterval = bpsDataPerInterval;
        return this;
    }
    public DescribeDomainBpsDataResponseBodyBpsDataPerInterval getBpsDataPerInterval() {
        return this.bpsDataPerInterval;
    }

    public static class DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule extends TeaModel {
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

        public static DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule self = new DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setHttpsDomesticValue(String httpsDomesticValue) {
            this.httpsDomesticValue = httpsDomesticValue;
            return this;
        }
        public String getHttpsDomesticValue() {
            return this.httpsDomesticValue;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setOverseasValue(String overseasValue) {
            this.overseasValue = overseasValue;
            return this;
        }
        public String getOverseasValue() {
            return this.overseasValue;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setHttpsOverseasValue(String httpsOverseasValue) {
            this.httpsOverseasValue = httpsOverseasValue;
            return this;
        }
        public String getHttpsOverseasValue() {
            return this.httpsOverseasValue;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setDomesticValue(String domesticValue) {
            this.domesticValue = domesticValue;
            return this;
        }
        public String getDomesticValue() {
            return this.domesticValue;
        }

    }

    public static class DescribeDomainBpsDataResponseBodyBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule;

        public static DescribeDomainBpsDataResponseBodyBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBpsDataResponseBodyBpsDataPerInterval self = new DescribeDomainBpsDataResponseBodyBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainBpsDataResponseBodyBpsDataPerInterval setDataModule(java.util.List<DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
