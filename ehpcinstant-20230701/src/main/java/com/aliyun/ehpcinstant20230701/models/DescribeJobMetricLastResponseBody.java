// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DescribeJobMetricLastResponseBody extends TeaModel {
    @NameInMap("Metrics")
    public java.util.List<DescribeJobMetricLastResponseBodyMetrics> metrics;

    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeJobMetricLastResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobMetricLastResponseBody self = new DescribeJobMetricLastResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobMetricLastResponseBody setMetrics(java.util.List<DescribeJobMetricLastResponseBodyMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<DescribeJobMetricLastResponseBodyMetrics> getMetrics() {
        return this.metrics;
    }

    public DescribeJobMetricLastResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeJobMetricLastResponseBodyMetrics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ArrayIndex")
        public Integer arrayIndex;

        /**
         * <strong>example:</strong>
         * <p>{&quot;memory_utilization&quot;: 37.42,&quot;cpu_utilization&quot;: 1.008, &quot;disk_utilization&quot;: 3.562}</p>
         */
        @NameInMap("Metric")
        public String metric;

        public static DescribeJobMetricLastResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobMetricLastResponseBodyMetrics self = new DescribeJobMetricLastResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeJobMetricLastResponseBodyMetrics setArrayIndex(Integer arrayIndex) {
            this.arrayIndex = arrayIndex;
            return this;
        }
        public Integer getArrayIndex() {
            return this.arrayIndex;
        }

        public DescribeJobMetricLastResponseBodyMetrics setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

    }

}
