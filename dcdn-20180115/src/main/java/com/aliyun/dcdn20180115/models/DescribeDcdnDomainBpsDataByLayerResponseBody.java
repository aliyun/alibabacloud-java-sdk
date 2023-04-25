// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainBpsDataByLayerResponseBody extends TeaModel {
    /**
     * <p>The bandwidth returned at each time interval.</p>
     */
    @NameInMap("BpsDataInterval")
    public DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataInterval bpsDataInterval;

    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The ID of the request.</p>
     */
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
        @NameInMap("DynamicTrafficValue")
        public String dynamicTrafficValue;

        @NameInMap("DynamicValue")
        public String dynamicValue;

        @NameInMap("StaticTrafficValue")
        public String staticTrafficValue;

        @NameInMap("StaticValue")
        public String staticValue;

        /**
         * <p>The timestamp of the data returned.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The total amount of network traffic. Unit: bytes.</p>
         */
        @NameInMap("TrafficValue")
        public String trafficValue;

        /**
         * <p>The total bandwidth. Unit: bit/s.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule self = new DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule setDynamicTrafficValue(String dynamicTrafficValue) {
            this.dynamicTrafficValue = dynamicTrafficValue;
            return this;
        }
        public String getDynamicTrafficValue() {
            return this.dynamicTrafficValue;
        }

        public DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule setDynamicValue(String dynamicValue) {
            this.dynamicValue = dynamicValue;
            return this;
        }
        public String getDynamicValue() {
            return this.dynamicValue;
        }

        public DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule setStaticTrafficValue(String staticTrafficValue) {
            this.staticTrafficValue = staticTrafficValue;
            return this;
        }
        public String getStaticTrafficValue() {
            return this.staticTrafficValue;
        }

        public DescribeDcdnDomainBpsDataByLayerResponseBodyBpsDataIntervalDataModule setStaticValue(String staticValue) {
            this.staticValue = staticValue;
            return this;
        }
        public String getStaticValue() {
            return this.staticValue;
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
