// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeSlowQueryTrendResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeSlowQueryTrendResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSlowQueryTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowQueryTrendResponseBody self = new DescribeSlowQueryTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowQueryTrendResponseBody setData(java.util.List<DescribeSlowQueryTrendResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSlowQueryTrendResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSlowQueryTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSlowQueryTrendResponseBodyData extends TeaModel {
        // 平均查询耗时 毫秒
        @NameInMap("AvgDurationMs")
        public Long avgDurationMs;

        // 慢查询数量
        @NameInMap("Count")
        public Integer count;

        // 最大查询耗时 毫秒
        @NameInMap("MaxDurationMs")
        public Long maxDurationMs;

        // 最小查询耗时 毫秒
        @NameInMap("MinDurationMs")
        public Long minDurationMs;

        // 统计时间窗口起点 UTC时间
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeSlowQueryTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowQueryTrendResponseBodyData self = new DescribeSlowQueryTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSlowQueryTrendResponseBodyData setAvgDurationMs(Long avgDurationMs) {
            this.avgDurationMs = avgDurationMs;
            return this;
        }
        public Long getAvgDurationMs() {
            return this.avgDurationMs;
        }

        public DescribeSlowQueryTrendResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeSlowQueryTrendResponseBodyData setMaxDurationMs(Long maxDurationMs) {
            this.maxDurationMs = maxDurationMs;
            return this;
        }
        public Long getMaxDurationMs() {
            return this.maxDurationMs;
        }

        public DescribeSlowQueryTrendResponseBodyData setMinDurationMs(Long minDurationMs) {
            this.minDurationMs = minDurationMs;
            return this;
        }
        public Long getMinDurationMs() {
            return this.minDurationMs;
        }

        public DescribeSlowQueryTrendResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
