// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainBpsDataByLayerResponseBody extends TeaModel {
    @NameInMap("BpsDataInterval")
    public DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataInterval bpsDataInterval;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainBpsDataByLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainBpsDataByLayerResponseBody self = new DescribeDcdnDomainBpsDataByLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainBpsDataByLayerResponseBody setBpsDataInterval(DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataInterval bpsDataInterval) {
        this.bpsDataInterval = bpsDataInterval;
        return this;
    }
    public DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataInterval getBpsDataInterval() {
        return this.bpsDataInterval;
    }

    public DescribeDcdnDomainBpsDataByLayerResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainBpsDataByLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("TrafficValue")
        public String trafficValue;

        @NameInMap("Value")
        public String value;

        public static DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule self = new DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule setTrafficValue(String trafficValue) {
            this.trafficValue = trafficValue;
            return this;
        }
        public String getTrafficValue() {
            return this.trafficValue;
        }

        public DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule> dataModule;

        public static DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataInterval self = new DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataInterval setDataModule(java.util.List<DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
