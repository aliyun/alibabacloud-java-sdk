// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsDataByLayerResponseBody extends TeaModel {
    /**
     * <p>The data returned at each time interval.</p>
     */
    @NameInMap("BpsDataInterval")
    public DescribeDomainBpsDataByLayerResponseBodyBpsDataInterval bpsDataInterval;

    /**
     * <p>The time interval between the data entries. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C565B910-BC3B-467B-9046-2A48566EA967</p>
     */
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
        /**
         * <p>The timestamp of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-06T07:10:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The total amount of network traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2838</p>
         */
        @NameInMap("TrafficValue")
        public String trafficValue;

        /**
         * <p>The peak bandwidth value. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>75.68</p>
         */
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
