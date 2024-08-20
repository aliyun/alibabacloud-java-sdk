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
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
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
        /**
         * <p>The traffic that is used to deliver dynamic content. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DynamicTrafficValue")
        public String dynamicTrafficValue;

        /**
         * <p>The bandwidth that is used to deliver dynamic content. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>0.34</p>
         */
        @NameInMap("DynamicValue")
        public String dynamicValue;

        /**
         * <p>The traffic that is used to deliver static content. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>131</p>
         */
        @NameInMap("StaticTrafficValue")
        public String staticTrafficValue;

        /**
         * <p>The bandwidth that is used to deliver static content. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>0.22</p>
         */
        @NameInMap("StaticValue")
        public String staticValue;

        /**
         * <p>The timestamp of the data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T21:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The total traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>331</p>
         */
        @NameInMap("TrafficValue")
        public String trafficValue;

        /**
         * <p>The total bandwidth. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>0.56</p>
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
