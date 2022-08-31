// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20141111.models;

import com.aliyun.tea.*;

public class TestDescribeDomainBpsDataResponseBody extends TeaModel {
    @NameInMap("BpsDataPerInterval")
    public TestDescribeDomainBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("IspName")
    public String ispName;

    @NameInMap("IspNameEn")
    public String ispNameEn;

    @NameInMap("LocationName")
    public String locationName;

    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static TestDescribeDomainBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestDescribeDomainBpsDataResponseBody self = new TestDescribeDomainBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public TestDescribeDomainBpsDataResponseBody setBpsDataPerInterval(TestDescribeDomainBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval) {
        this.bpsDataPerInterval = bpsDataPerInterval;
        return this;
    }
    public TestDescribeDomainBpsDataResponseBodyBpsDataPerInterval getBpsDataPerInterval() {
        return this.bpsDataPerInterval;
    }

    public TestDescribeDomainBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public TestDescribeDomainBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public TestDescribeDomainBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TestDescribeDomainBpsDataResponseBody setIspName(String ispName) {
        this.ispName = ispName;
        return this;
    }
    public String getIspName() {
        return this.ispName;
    }

    public TestDescribeDomainBpsDataResponseBody setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public TestDescribeDomainBpsDataResponseBody setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
    public String getLocationName() {
        return this.locationName;
    }

    public TestDescribeDomainBpsDataResponseBody setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public TestDescribeDomainBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestDescribeDomainBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("DomesticL2Value")
        public String domesticL2Value;

        @NameInMap("DomesticValue")
        public String domesticValue;

        @NameInMap("DynamicDomesticValue")
        public String dynamicDomesticValue;

        @NameInMap("DynamicOverseasValue")
        public String dynamicOverseasValue;

        @NameInMap("DynamicValue")
        public String dynamicValue;

        @NameInMap("L2Value")
        public String l2Value;

        @NameInMap("OverseasL2Value")
        public String overseasL2Value;

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

        public static TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule self = new TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setDomesticL2Value(String domesticL2Value) {
            this.domesticL2Value = domesticL2Value;
            return this;
        }
        public String getDomesticL2Value() {
            return this.domesticL2Value;
        }

        public TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setDomesticValue(String domesticValue) {
            this.domesticValue = domesticValue;
            return this;
        }
        public String getDomesticValue() {
            return this.domesticValue;
        }

        public TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setDynamicDomesticValue(String dynamicDomesticValue) {
            this.dynamicDomesticValue = dynamicDomesticValue;
            return this;
        }
        public String getDynamicDomesticValue() {
            return this.dynamicDomesticValue;
        }

        public TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setDynamicOverseasValue(String dynamicOverseasValue) {
            this.dynamicOverseasValue = dynamicOverseasValue;
            return this;
        }
        public String getDynamicOverseasValue() {
            return this.dynamicOverseasValue;
        }

        public TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setDynamicValue(String dynamicValue) {
            this.dynamicValue = dynamicValue;
            return this;
        }
        public String getDynamicValue() {
            return this.dynamicValue;
        }

        public TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setL2Value(String l2Value) {
            this.l2Value = l2Value;
            return this;
        }
        public String getL2Value() {
            return this.l2Value;
        }

        public TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setOverseasL2Value(String overseasL2Value) {
            this.overseasL2Value = overseasL2Value;
            return this;
        }
        public String getOverseasL2Value() {
            return this.overseasL2Value;
        }

        public TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setOverseasValue(String overseasValue) {
            this.overseasValue = overseasValue;
            return this;
        }
        public String getOverseasValue() {
            return this.overseasValue;
        }

        public TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setStaticDomesticValue(String staticDomesticValue) {
            this.staticDomesticValue = staticDomesticValue;
            return this;
        }
        public String getStaticDomesticValue() {
            return this.staticDomesticValue;
        }

        public TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setStaticOverseasValue(String staticOverseasValue) {
            this.staticOverseasValue = staticOverseasValue;
            return this;
        }
        public String getStaticOverseasValue() {
            return this.staticOverseasValue;
        }

        public TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setStaticValue(String staticValue) {
            this.staticValue = staticValue;
            return this;
        }
        public String getStaticValue() {
            return this.staticValue;
        }

        public TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class TestDescribeDomainBpsDataResponseBodyBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule;

        public static TestDescribeDomainBpsDataResponseBodyBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            TestDescribeDomainBpsDataResponseBodyBpsDataPerInterval self = new TestDescribeDomainBpsDataResponseBodyBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public TestDescribeDomainBpsDataResponseBodyBpsDataPerInterval setDataModule(java.util.List<TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<TestDescribeDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
