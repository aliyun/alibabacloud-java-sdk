// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainHitRateDataResponseBody extends TeaModel {
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
     * <p>2019-12-30T08:10:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The byte hit ratio at each time interval. The byte hit ratio is measured in percentage.</p>
     */
    @NameInMap("HitRateInterval")
    public DescribeDomainHitRateDataResponseBodyHitRateInterval hitRateInterval;

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
     * <p>2019-12-30T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainHitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainHitRateDataResponseBody self = new DescribeDomainHitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainHitRateDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainHitRateDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainHitRateDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainHitRateDataResponseBody setHitRateInterval(DescribeDomainHitRateDataResponseBodyHitRateInterval hitRateInterval) {
        this.hitRateInterval = hitRateInterval;
        return this;
    }
    public DescribeDomainHitRateDataResponseBodyHitRateInterval getHitRateInterval() {
        return this.hitRateInterval;
    }

    public DescribeDomainHitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainHitRateDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainHitRateDataResponseBodyHitRateIntervalDataModule extends TeaModel {
        /**
         * <p>The byte hit ratio of HTTPS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>50.0</p>
         */
        @NameInMap("HttpsValue")
        public String httpsValue;

        /**
         * <p>The timestamp of the data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-30T08:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The byte hit ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDomainHitRateDataResponseBodyHitRateIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainHitRateDataResponseBodyHitRateIntervalDataModule self = new DescribeDomainHitRateDataResponseBodyHitRateIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainHitRateDataResponseBodyHitRateIntervalDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeDomainHitRateDataResponseBodyHitRateIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainHitRateDataResponseBodyHitRateIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainHitRateDataResponseBodyHitRateInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainHitRateDataResponseBodyHitRateIntervalDataModule> dataModule;

        public static DescribeDomainHitRateDataResponseBodyHitRateInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainHitRateDataResponseBodyHitRateInterval self = new DescribeDomainHitRateDataResponseBodyHitRateInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainHitRateDataResponseBodyHitRateInterval setDataModule(java.util.List<DescribeDomainHitRateDataResponseBodyHitRateIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainHitRateDataResponseBodyHitRateIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
