// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainQpsDataByLayerResponseBody extends TeaModel {
    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The accelerated domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The layer at which the data was collected.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Layer")
    public String layer;

    /**
     * <p>The QPS returned at each time interval.</p>
     */
    @NameInMap("QpsDataInterval")
    public DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataInterval qpsDataInterval;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainQpsDataByLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainQpsDataByLayerResponseBody self = new DescribeDcdnDomainQpsDataByLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainQpsDataByLayerResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainQpsDataByLayerResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainQpsDataByLayerResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainQpsDataByLayerResponseBody setLayer(String layer) {
        this.layer = layer;
        return this;
    }
    public String getLayer() {
        return this.layer;
    }

    public DescribeDcdnDomainQpsDataByLayerResponseBody setQpsDataInterval(DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataInterval qpsDataInterval) {
        this.qpsDataInterval = qpsDataInterval;
        return this;
    }
    public DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataInterval getQpsDataInterval() {
        return this.qpsDataInterval;
    }

    public DescribeDcdnDomainQpsDataByLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainQpsDataByLayerResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule extends TeaModel {
        /**
         * <p>The number of requests in the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("AccDomesticValue")
        public String accDomesticValue;

        /**
         * <p>The number of requests outside the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("AccOverseasValue")
        public String accOverseasValue;

        /**
         * <p>The total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("AccValue")
        public String accValue;

        /**
         * <p>The number of queries per second in the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>0.12</p>
         */
        @NameInMap("DomesticValue")
        public String domesticValue;

        /**
         * <p>The number of queries per second outside the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>0.44</p>
         */
        @NameInMap("OverseasValue")
        public String overseasValue;

        /**
         * <p>The timestamp of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T21:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The total number of queries per second.</p>
         * 
         * <strong>example:</strong>
         * <p>0.56</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule self = new DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setAccDomesticValue(String accDomesticValue) {
            this.accDomesticValue = accDomesticValue;
            return this;
        }
        public String getAccDomesticValue() {
            return this.accDomesticValue;
        }

        public DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setAccOverseasValue(String accOverseasValue) {
            this.accOverseasValue = accOverseasValue;
            return this;
        }
        public String getAccOverseasValue() {
            return this.accOverseasValue;
        }

        public DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setAccValue(String accValue) {
            this.accValue = accValue;
            return this;
        }
        public String getAccValue() {
            return this.accValue;
        }

        public DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setDomesticValue(String domesticValue) {
            this.domesticValue = domesticValue;
            return this;
        }
        public String getDomesticValue() {
            return this.domesticValue;
        }

        public DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setOverseasValue(String overseasValue) {
            this.overseasValue = overseasValue;
            return this;
        }
        public String getOverseasValue() {
            return this.overseasValue;
        }

        public DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule> dataModule;

        public static DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataInterval self = new DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataInterval setDataModule(java.util.List<DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
