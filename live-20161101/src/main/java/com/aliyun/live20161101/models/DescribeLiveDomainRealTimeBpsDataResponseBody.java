// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealTimeBpsDataResponseBody extends TeaModel {
    /**
     * <p>The interval at which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The streaming domain name or names that was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com,example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range in which data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-11-30T05:40:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RealTimeBpsDataPerInterval")
    public DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval realTimeBpsDataPerInterval;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BC858082-736F-4A25-867B-E5B67C85ACF7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range in which data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-11-30T05:33:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveDomainRealTimeBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealTimeBpsDataResponseBody self = new DescribeLiveDomainRealTimeBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealTimeBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeLiveDomainRealTimeBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainRealTimeBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainRealTimeBpsDataResponseBody setRealTimeBpsDataPerInterval(DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval realTimeBpsDataPerInterval) {
        this.realTimeBpsDataPerInterval = realTimeBpsDataPerInterval;
        return this;
    }
    public DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval getRealTimeBpsDataPerInterval() {
        return this.realTimeBpsDataPerInterval;
    }

    public DescribeLiveDomainRealTimeBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainRealTimeBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Value")
        public String value;

        public static DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule self = new DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule> dataModule;

        public static DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval self = new DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval setDataModule(java.util.List<DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
