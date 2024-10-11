// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeSlowQueryTrendResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeSlowQueryTrendResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>48CBEEBE-FA07-5A06-8BA4-567B92ADD6A0</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("AvgDurationMs")
        public Long avgDurationMs;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("MaxDurationMs")
        public Long maxDurationMs;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MinDurationMs")
        public Long minDurationMs;

        /**
         * <strong>example:</strong>
         * <p>2021-02-02T08:00:00Z</p>
         */
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
