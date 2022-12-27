// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsDataByLayerResponseBody extends TeaModel {
    // The number of bytes per second collected at each time interval.
    @NameInMap("BpsDataInterval")
    public DescribeDomainBpsDataByLayerResponseBodyBpsDataInterval bpsDataInterval;

    // The time interval between the data entries. Unit: seconds.
    @NameInMap("DataInterval")
    public String dataInterval;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainBpsDataByLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBpsDataByLayerResponseBody self = new DescribeDomainBpsDataByLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBpsDataByLayerResponseBody setBpsDataInterval(DescribeDomainBpsDataByLayerResponseBodyBpsDataInterval bpsDataInterval) {
        this.bpsDataInterval = bpsDataInterval;
        return this;
    }
    public DescribeDomainBpsDataByLayerResponseBodyBpsDataInterval getBpsDataInterval() {
        return this.bpsDataInterval;
    }

    public DescribeDomainBpsDataByLayerResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainBpsDataByLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule extends TeaModel {
        // The timestamp of the data returned.
        @NameInMap("TimeStamp")
        public String timeStamp;

        // The total amount of network traffic. Unit: bytes.
        @NameInMap("TrafficValue")
        public String trafficValue;

        // The peak bandwidth value. Unit: bit/s.
        @NameInMap("Value")
        public String value;

        public static DescribeDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule self = new DescribeDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule setTrafficValue(String trafficValue) {
            this.trafficValue = trafficValue;
            return this;
        }
        public String getTrafficValue() {
            return this.trafficValue;
        }

        public DescribeDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainBpsDataByLayerResponseBodyBpsDataInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule> dataModule;

        public static DescribeDomainBpsDataByLayerResponseBodyBpsDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBpsDataByLayerResponseBodyBpsDataInterval self = new DescribeDomainBpsDataByLayerResponseBodyBpsDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainBpsDataByLayerResponseBodyBpsDataInterval setDataModule(java.util.List<DescribeDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
