// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsDataByLayerResponseBody extends TeaModel {
    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range that was queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The layer at which the data was collected.</p>
     */
    @NameInMap("Layer")
    public String layer;

    /**
     * <p>The number of queries per second at each time interval.</p>
     */
    @NameInMap("QpsDataInterval")
    public DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval qpsDataInterval;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range that was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainQpsDataByLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsDataByLayerResponseBody self = new DescribeDomainQpsDataByLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsDataByLayerResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainQpsDataByLayerResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainQpsDataByLayerResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainQpsDataByLayerResponseBody setLayer(String layer) {
        this.layer = layer;
        return this;
    }
    public String getLayer() {
        return this.layer;
    }

    public DescribeDomainQpsDataByLayerResponseBody setQpsDataInterval(DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval qpsDataInterval) {
        this.qpsDataInterval = qpsDataInterval;
        return this;
    }
    public DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval getQpsDataInterval() {
        return this.qpsDataInterval;
    }

    public DescribeDomainQpsDataByLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainQpsDataByLayerResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule extends TeaModel {
        /**
         * <p>The number of requests in the Chinese mainland.</p>
         */
        @NameInMap("AccDomesticValue")
        public String accDomesticValue;

        /**
         * <p>The number of requests in the Chinese mainland.</p>
         */
        @NameInMap("AccOverseasValue")
        public String accOverseasValue;

        /**
         * <p>The total number of requests.</p>
         */
        @NameInMap("AccValue")
        public String accValue;

        /**
         * <p>The number of queries per second in the Chinese mainland.</p>
         */
        @NameInMap("DomesticValue")
        public String domesticValue;

        /**
         * <p>The number of queries per second outside the Chinese mainland.</p>
         */
        @NameInMap("OverseasValue")
        public String overseasValue;

        /**
         * <p>The timestamp of the data returned.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The total number of queries per second in all regions.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule self = new DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setAccDomesticValue(String accDomesticValue) {
            this.accDomesticValue = accDomesticValue;
            return this;
        }
        public String getAccDomesticValue() {
            return this.accDomesticValue;
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setAccOverseasValue(String accOverseasValue) {
            this.accOverseasValue = accOverseasValue;
            return this;
        }
        public String getAccOverseasValue() {
            return this.accOverseasValue;
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setAccValue(String accValue) {
            this.accValue = accValue;
            return this;
        }
        public String getAccValue() {
            return this.accValue;
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setDomesticValue(String domesticValue) {
            this.domesticValue = domesticValue;
            return this;
        }
        public String getDomesticValue() {
            return this.domesticValue;
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setOverseasValue(String overseasValue) {
            this.overseasValue = overseasValue;
            return this;
        }
        public String getOverseasValue() {
            return this.overseasValue;
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule> dataModule;

        public static DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval self = new DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainQpsDataByLayerResponseBodyQpsDataInterval setDataModule(java.util.List<DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainQpsDataByLayerResponseBodyQpsDataIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
