// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainsUsageByDayResponseBody extends TeaModel {
    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
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
     * <p>2019-12-23T09:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C88EF8ED-72F0-45EA-9E86-95114E224FC5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-22T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The monitoring data collected at each time interval.</p>
     */
    @NameInMap("UsageByDays")
    public DescribeDomainsUsageByDayResponseBodyUsageByDays usageByDays;

    /**
     * <p>The summarized monitoring data.</p>
     */
    @NameInMap("UsageTotal")
    public DescribeDomainsUsageByDayResponseBodyUsageTotal usageTotal;

    public static DescribeDomainsUsageByDayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsUsageByDayResponseBody self = new DescribeDomainsUsageByDayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsUsageByDayResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainsUsageByDayResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainsUsageByDayResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainsUsageByDayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainsUsageByDayResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainsUsageByDayResponseBody setUsageByDays(DescribeDomainsUsageByDayResponseBodyUsageByDays usageByDays) {
        this.usageByDays = usageByDays;
        return this;
    }
    public DescribeDomainsUsageByDayResponseBodyUsageByDays getUsageByDays() {
        return this.usageByDays;
    }

    public DescribeDomainsUsageByDayResponseBody setUsageTotal(DescribeDomainsUsageByDayResponseBodyUsageTotal usageTotal) {
        this.usageTotal = usageTotal;
        return this;
    }
    public DescribeDomainsUsageByDayResponseBodyUsageTotal getUsageTotal() {
        return this.usageTotal;
    }

    public static class DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay extends TeaModel {
        /**
         * <p>The byte hit ratio. The byte hit ratio is measured in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>97.46250599529726</p>
         */
        @NameInMap("BytesHitRate")
        public String bytesHitRate;

        /**
         * <p>The peak bandwidth value. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>306747.76</p>
         */
        @NameInMap("MaxBps")
        public String maxBps;

        /**
         * <p>The time when the bandwidth reached the peak value.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-23 10:55:00</p>
         */
        @NameInMap("MaxBpsTime")
        public String maxBpsTime;

        /**
         * <p>The peak bandwidth value during back-to-origin routing. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>72584.072</p>
         */
        @NameInMap("MaxSrcBps")
        public String maxSrcBps;

        /**
         * <p>The time when the bandwidth during back-to-origin routing reached the peak value.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-23 11:45:00</p>
         */
        @NameInMap("MaxSrcBpsTime")
        public String maxSrcBpsTime;

        /**
         * <p>The number of queries per second (QPS).</p>
         * 
         * <strong>example:</strong>
         * <p>7.466354166666667</p>
         */
        @NameInMap("Qps")
        public String qps;

        /**
         * <p>The cache hit ratio that is calculated based on requests. The cache hit ratio is measured in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>70.24770071912111</p>
         */
        @NameInMap("RequestHitRate")
        public String requestHitRate;

        /**
         * <p>The timestamp of the data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-22</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The total amount of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>645093</p>
         */
        @NameInMap("TotalAccess")
        public String totalAccess;

        /**
         * <p>The total amount of network traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>564300099309</p>
         */
        @NameInMap("TotalTraffic")
        public String totalTraffic;

        public static DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay self = new DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setBytesHitRate(String bytesHitRate) {
            this.bytesHitRate = bytesHitRate;
            return this;
        }
        public String getBytesHitRate() {
            return this.bytesHitRate;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setMaxBps(String maxBps) {
            this.maxBps = maxBps;
            return this;
        }
        public String getMaxBps() {
            return this.maxBps;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setMaxBpsTime(String maxBpsTime) {
            this.maxBpsTime = maxBpsTime;
            return this;
        }
        public String getMaxBpsTime() {
            return this.maxBpsTime;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setMaxSrcBps(String maxSrcBps) {
            this.maxSrcBps = maxSrcBps;
            return this;
        }
        public String getMaxSrcBps() {
            return this.maxSrcBps;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setMaxSrcBpsTime(String maxSrcBpsTime) {
            this.maxSrcBpsTime = maxSrcBpsTime;
            return this;
        }
        public String getMaxSrcBpsTime() {
            return this.maxSrcBpsTime;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setQps(String qps) {
            this.qps = qps;
            return this;
        }
        public String getQps() {
            return this.qps;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setRequestHitRate(String requestHitRate) {
            this.requestHitRate = requestHitRate;
            return this;
        }
        public String getRequestHitRate() {
            return this.requestHitRate;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setTotalAccess(String totalAccess) {
            this.totalAccess = totalAccess;
            return this;
        }
        public String getTotalAccess() {
            return this.totalAccess;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setTotalTraffic(String totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }
        public String getTotalTraffic() {
            return this.totalTraffic;
        }

    }

    public static class DescribeDomainsUsageByDayResponseBodyUsageByDays extends TeaModel {
        @NameInMap("UsageByDay")
        public java.util.List<DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay> usageByDay;

        public static DescribeDomainsUsageByDayResponseBodyUsageByDays build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsUsageByDayResponseBodyUsageByDays self = new DescribeDomainsUsageByDayResponseBodyUsageByDays();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDays setUsageByDay(java.util.List<DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay> usageByDay) {
            this.usageByDay = usageByDay;
            return this;
        }
        public java.util.List<DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay> getUsageByDay() {
            return this.usageByDay;
        }

    }

    public static class DescribeDomainsUsageByDayResponseBodyUsageTotal extends TeaModel {
        /**
         * <p>The byte hit ratio. The byte hit ratio is measured in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>97.03110726801242</p>
         */
        @NameInMap("BytesHitRate")
        public String bytesHitRate;

        /**
         * <p>The peak bandwidth value. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0747912780000001E8</p>
         */
        @NameInMap("MaxBps")
        public String maxBps;

        /**
         * <p>The time when the bandwidth reached the peak value.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-23 10:55:00</p>
         */
        @NameInMap("MaxBpsTime")
        public String maxBpsTime;

        /**
         * <p>The peak bandwidth value during back-to-origin routing. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>72584.072</p>
         */
        @NameInMap("MaxSrcBps")
        public String maxSrcBps;

        /**
         * <p>The time when the bandwidth during back-to-origin routing reached the peak value.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-23 11:45:00</p>
         */
        @NameInMap("MaxSrcBpsTime")
        public String maxSrcBpsTime;

        /**
         * <p>The cache hit ratio that is calculated based on requests. The cache hit ratio is measured in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>69.92610837438424</p>
         */
        @NameInMap("RequestHitRate")
        public String requestHitRate;

        /**
         * <p>The total amount of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>1319500</p>
         */
        @NameInMap("TotalAccess")
        public String totalAccess;

        /**
         * <p>The total amount of network traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1117711832100</p>
         */
        @NameInMap("TotalTraffic")
        public String totalTraffic;

        public static DescribeDomainsUsageByDayResponseBodyUsageTotal build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsUsageByDayResponseBodyUsageTotal self = new DescribeDomainsUsageByDayResponseBodyUsageTotal();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsUsageByDayResponseBodyUsageTotal setBytesHitRate(String bytesHitRate) {
            this.bytesHitRate = bytesHitRate;
            return this;
        }
        public String getBytesHitRate() {
            return this.bytesHitRate;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageTotal setMaxBps(String maxBps) {
            this.maxBps = maxBps;
            return this;
        }
        public String getMaxBps() {
            return this.maxBps;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageTotal setMaxBpsTime(String maxBpsTime) {
            this.maxBpsTime = maxBpsTime;
            return this;
        }
        public String getMaxBpsTime() {
            return this.maxBpsTime;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageTotal setMaxSrcBps(String maxSrcBps) {
            this.maxSrcBps = maxSrcBps;
            return this;
        }
        public String getMaxSrcBps() {
            return this.maxSrcBps;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageTotal setMaxSrcBpsTime(String maxSrcBpsTime) {
            this.maxSrcBpsTime = maxSrcBpsTime;
            return this;
        }
        public String getMaxSrcBpsTime() {
            return this.maxSrcBpsTime;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageTotal setRequestHitRate(String requestHitRate) {
            this.requestHitRate = requestHitRate;
            return this;
        }
        public String getRequestHitRate() {
            return this.requestHitRate;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageTotal setTotalAccess(String totalAccess) {
            this.totalAccess = totalAccess;
            return this;
        }
        public String getTotalAccess() {
            return this.totalAccess;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageTotal setTotalTraffic(String totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }
        public String getTotalTraffic() {
            return this.totalTraffic;
        }

    }

}
