// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainReqHitRateDataResponseBody extends TeaModel {
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
     * <p>2017-12-22T08:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The request hit ratio data at each time interval. The hit ratio is measured in percentage.</p>
     */
    @NameInMap("ReqHitRateInterval")
    public DescribeDomainReqHitRateDataResponseBodyReqHitRateInterval reqHitRateInterval;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-21T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainReqHitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainReqHitRateDataResponseBody self = new DescribeDomainReqHitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainReqHitRateDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainReqHitRateDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainReqHitRateDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainReqHitRateDataResponseBody setReqHitRateInterval(DescribeDomainReqHitRateDataResponseBodyReqHitRateInterval reqHitRateInterval) {
        this.reqHitRateInterval = reqHitRateInterval;
        return this;
    }
    public DescribeDomainReqHitRateDataResponseBodyReqHitRateInterval getReqHitRateInterval() {
        return this.reqHitRateInterval;
    }

    public DescribeDomainReqHitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainReqHitRateDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainReqHitRateDataResponseBodyReqHitRateIntervalDataModule extends TeaModel {
        /**
         * <p>The hit ratio of HTTPS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>50.0</p>
         */
        @NameInMap("HttpsValue")
        public String httpsValue;

        /**
         * <p>The timestamp of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-22T08:00:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The request hit ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDomainReqHitRateDataResponseBodyReqHitRateIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainReqHitRateDataResponseBodyReqHitRateIntervalDataModule self = new DescribeDomainReqHitRateDataResponseBodyReqHitRateIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainReqHitRateDataResponseBodyReqHitRateIntervalDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeDomainReqHitRateDataResponseBodyReqHitRateIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainReqHitRateDataResponseBodyReqHitRateIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainReqHitRateDataResponseBodyReqHitRateInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainReqHitRateDataResponseBodyReqHitRateIntervalDataModule> dataModule;

        public static DescribeDomainReqHitRateDataResponseBodyReqHitRateInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainReqHitRateDataResponseBodyReqHitRateInterval self = new DescribeDomainReqHitRateDataResponseBodyReqHitRateInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainReqHitRateDataResponseBodyReqHitRateInterval setDataModule(java.util.List<DescribeDomainReqHitRateDataResponseBodyReqHitRateIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainReqHitRateDataResponseBodyReqHitRateIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
