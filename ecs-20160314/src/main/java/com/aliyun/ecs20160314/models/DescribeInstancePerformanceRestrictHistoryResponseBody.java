// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstancePerformanceRestrictHistoryResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PerformanceRestrictHistories")
    public PerformanceRestrictHistories performanceRestrictHistories;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstancePerformanceRestrictHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePerformanceRestrictHistoryResponseBody self = new DescribeInstancePerformanceRestrictHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePerformanceRestrictHistoryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancePerformanceRestrictHistoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancePerformanceRestrictHistoryResponseBody setPerformanceRestrictHistories(PerformanceRestrictHistories performanceRestrictHistories) {
        this.performanceRestrictHistories = performanceRestrictHistories;
        return this;
    }
    public PerformanceRestrictHistories getPerformanceRestrictHistories() {
        return this.performanceRestrictHistories;
    }

    public DescribeInstancePerformanceRestrictHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancePerformanceRestrictHistoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class Intervals extends TeaModel {
        @NameInMap("Interval")
        public java.util.List<String> interval;

        public static Intervals build(java.util.Map<String, ?> map) throws Exception {
            Intervals self = new Intervals();
            return TeaModel.build(map, self);
        }

        public Intervals setInterval(java.util.List<String> interval) {
            this.interval = interval;
            return this;
        }
        public java.util.List<String> getInterval() {
            return this.interval;
        }

    }

    public static class PerformanceRestrictHistory extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Intervals")
        public Intervals intervals;

        public static PerformanceRestrictHistory build(java.util.Map<String, ?> map) throws Exception {
            PerformanceRestrictHistory self = new PerformanceRestrictHistory();
            return TeaModel.build(map, self);
        }

        public PerformanceRestrictHistory setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public PerformanceRestrictHistory setIntervals(Intervals intervals) {
            this.intervals = intervals;
            return this;
        }
        public Intervals getIntervals() {
            return this.intervals;
        }

    }

    public static class PerformanceRestrictHistories extends TeaModel {
        @NameInMap("PerformanceRestrictHistory")
        public java.util.List<PerformanceRestrictHistory> performanceRestrictHistory;

        public static PerformanceRestrictHistories build(java.util.Map<String, ?> map) throws Exception {
            PerformanceRestrictHistories self = new PerformanceRestrictHistories();
            return TeaModel.build(map, self);
        }

        public PerformanceRestrictHistories setPerformanceRestrictHistory(java.util.List<PerformanceRestrictHistory> performanceRestrictHistory) {
            this.performanceRestrictHistory = performanceRestrictHistory;
            return this;
        }
        public java.util.List<PerformanceRestrictHistory> getPerformanceRestrictHistory() {
            return this.performanceRestrictHistory;
        }

    }

}
