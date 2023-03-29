// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainHttpCodeDataByLayerResponseBody extends TeaModel {
    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The number of HTTP status codes returned at each time interval.</p>
     */
    @NameInMap("HttpCodeDataInterval")
    public DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval httpCodeDataInterval;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainHttpCodeDataByLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainHttpCodeDataByLayerResponseBody self = new DescribeDomainHttpCodeDataByLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainHttpCodeDataByLayerResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainHttpCodeDataByLayerResponseBody setHttpCodeDataInterval(DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval httpCodeDataInterval) {
        this.httpCodeDataInterval = httpCodeDataInterval;
        return this;
    }
    public DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval getHttpCodeDataInterval() {
        return this.httpCodeDataInterval;
    }

    public DescribeDomainHttpCodeDataByLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule extends TeaModel {
        /**
         * <p>The timestamp of the data returned.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The total number of times that HTTP status codes were returned at each time interval.</p>
         */
        @NameInMap("TotalValue")
        public String totalValue;

        /**
         * <p>The number of times that the HTTP status code was returned.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule self = new DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule setTotalValue(String totalValue) {
            this.totalValue = totalValue;
            return this;
        }
        public String getTotalValue() {
            return this.totalValue;
        }

        public DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule> dataModule;

        public static DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval self = new DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval setDataModule(java.util.List<DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
