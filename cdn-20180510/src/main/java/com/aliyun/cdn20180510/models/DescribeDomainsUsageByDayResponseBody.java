// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainsUsageByDayResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("UsageTotal")
    public DescribeDomainsUsageByDayResponseBodyUsageTotal usageTotal;

    @NameInMap("UsageByDays")
    public DescribeDomainsUsageByDayResponseBodyUsageByDays usageByDays;

    public static DescribeDomainsUsageByDayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsUsageByDayResponseBody self = new DescribeDomainsUsageByDayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsUsageByDayResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainsUsageByDayResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainsUsageByDayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainsUsageByDayResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainsUsageByDayResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainsUsageByDayResponseBody setUsageTotal(DescribeDomainsUsageByDayResponseBodyUsageTotal usageTotal) {
        this.usageTotal = usageTotal;
        return this;
    }
    public DescribeDomainsUsageByDayResponseBodyUsageTotal getUsageTotal() {
        return this.usageTotal;
    }

    public DescribeDomainsUsageByDayResponseBody setUsageByDays(DescribeDomainsUsageByDayResponseBodyUsageByDays usageByDays) {
        this.usageByDays = usageByDays;
        return this;
    }
    public DescribeDomainsUsageByDayResponseBodyUsageByDays getUsageByDays() {
        return this.usageByDays;
    }

    public static class DescribeDomainsUsageByDayResponseBodyUsageTotal extends TeaModel {
        @NameInMap("MaxSrcBpsTime")
        public String maxSrcBpsTime;

        @NameInMap("RequestHitRate")
        public String requestHitRate;

        @NameInMap("MaxBps")
        public String maxBps;

        @NameInMap("TotalAccess")
        public String totalAccess;

        @NameInMap("BytesHitRate")
        public String bytesHitRate;

        @NameInMap("TotalTraffic")
        public String totalTraffic;

        @NameInMap("MaxBpsTime")
        public String maxBpsTime;

        @NameInMap("MaxSrcBps")
        public String maxSrcBps;

        public static DescribeDomainsUsageByDayResponseBodyUsageTotal build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsUsageByDayResponseBodyUsageTotal self = new DescribeDomainsUsageByDayResponseBodyUsageTotal();
            return TeaModel.build(map, self);
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

        public DescribeDomainsUsageByDayResponseBodyUsageTotal setMaxBps(String maxBps) {
            this.maxBps = maxBps;
            return this;
        }
        public String getMaxBps() {
            return this.maxBps;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageTotal setTotalAccess(String totalAccess) {
            this.totalAccess = totalAccess;
            return this;
        }
        public String getTotalAccess() {
            return this.totalAccess;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageTotal setBytesHitRate(String bytesHitRate) {
            this.bytesHitRate = bytesHitRate;
            return this;
        }
        public String getBytesHitRate() {
            return this.bytesHitRate;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageTotal setTotalTraffic(String totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }
        public String getTotalTraffic() {
            return this.totalTraffic;
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

    }

    public static class DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay extends TeaModel {
        @NameInMap("MaxSrcBpsTime")
        public String maxSrcBpsTime;

        @NameInMap("Qps")
        public String qps;

        @NameInMap("RequestHitRate")
        public String requestHitRate;

        @NameInMap("MaxBps")
        public String maxBps;

        @NameInMap("TotalAccess")
        public String totalAccess;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("BytesHitRate")
        public String bytesHitRate;

        @NameInMap("TotalTraffic")
        public String totalTraffic;

        @NameInMap("MaxSrcBps")
        public String maxSrcBps;

        @NameInMap("MaxBpsTime")
        public String maxBpsTime;

        public static DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay self = new DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay();
            return TeaModel.build(map, self);
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

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setMaxBps(String maxBps) {
            this.maxBps = maxBps;
            return this;
        }
        public String getMaxBps() {
            return this.maxBps;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setTotalAccess(String totalAccess) {
            this.totalAccess = totalAccess;
            return this;
        }
        public String getTotalAccess() {
            return this.totalAccess;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setBytesHitRate(String bytesHitRate) {
            this.bytesHitRate = bytesHitRate;
            return this;
        }
        public String getBytesHitRate() {
            return this.bytesHitRate;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setTotalTraffic(String totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }
        public String getTotalTraffic() {
            return this.totalTraffic;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setMaxSrcBps(String maxSrcBps) {
            this.maxSrcBps = maxSrcBps;
            return this;
        }
        public String getMaxSrcBps() {
            return this.maxSrcBps;
        }

        public DescribeDomainsUsageByDayResponseBodyUsageByDaysUsageByDay setMaxBpsTime(String maxBpsTime) {
            this.maxBpsTime = maxBpsTime;
            return this;
        }
        public String getMaxBpsTime() {
            return this.maxBpsTime;
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

}
