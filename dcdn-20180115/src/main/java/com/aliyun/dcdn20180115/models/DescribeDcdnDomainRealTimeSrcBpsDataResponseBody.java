// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeSrcBpsDataResponseBody extends TeaModel {
    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
     * <p>The time granularity varies with the maximum time range per query. The returned value is 60 (1 minute), 300 (5 minutes), or 3600(1 hour). For more information, see <strong>Usage notes</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
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
     * <p>2015-12-10T20:01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The origin bandwidth data returned at each time interval. Unit: bit/s.</p>
     */
    @NameInMap("RealTimeSrcBpsDataPerInterval")
    public DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval realTimeSrcBpsDataPerInterval;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7CBCD6AD-B016-42E5-AE0B-B3731DE8F755</p>
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

    public static DescribeDcdnDomainRealTimeSrcBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeSrcBpsDataResponseBody self = new DescribeDcdnDomainRealTimeSrcBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeSrcBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainRealTimeSrcBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainRealTimeSrcBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainRealTimeSrcBpsDataResponseBody setRealTimeSrcBpsDataPerInterval(DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval realTimeSrcBpsDataPerInterval) {
        this.realTimeSrcBpsDataPerInterval = realTimeSrcBpsDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval getRealTimeSrcBpsDataPerInterval() {
        return this.realTimeSrcBpsDataPerInterval;
    }

    public DescribeDcdnDomainRealTimeSrcBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainRealTimeSrcBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule extends TeaModel {
        /**
         * <p>The timestamp of the data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T20:01:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The bandwidth value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule self = new DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval self = new DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainRealTimeSrcBpsDataResponseBodyRealTimeSrcBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
