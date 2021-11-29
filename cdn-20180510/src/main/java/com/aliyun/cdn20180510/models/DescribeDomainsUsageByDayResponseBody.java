// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainsUsageByDayResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("UsageByDays")
    public DescribeDomainsUsageByDayResponseBodyUsageByDays usageByDays;

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
        @NameInMap("BytesHitRate")
        public String bytesHitRate;

        @NameInMap("MaxBps")
        public String maxBps;

        @NameInMap("MaxBpsTime")
        public String maxBpsTime;

        @NameInMap("MaxSrcBps")
        public String maxSrcBps;

        @NameInMap("MaxSrcBpsTime")
        public String maxSrcBpsTime;

        @NameInMap("Qps")
        public String qps;

        @NameInMap("RequestHitRate")
        public String requestHitRate;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("TotalAccess")
        public String totalAccess;

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
        @NameInMap("BytesHitRate")
        public String bytesHitRate;

        @NameInMap("MaxBps")
        public String maxBps;

        @NameInMap("MaxBpsTime")
        public String maxBpsTime;

        @NameInMap("MaxSrcBps")
        public String maxSrcBps;

        @NameInMap("MaxSrcBpsTime")
        public String maxSrcBpsTime;

        @NameInMap("RequestHitRate")
        public String requestHitRate;

        @NameInMap("TotalAccess")
        public String totalAccess;

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
