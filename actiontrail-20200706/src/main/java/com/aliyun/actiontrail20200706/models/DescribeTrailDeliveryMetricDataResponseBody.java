// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeTrailDeliveryMetricDataResponseBody extends TeaModel {
    /**
     * <p>A list of data points for the delivery monitoring metric.</p>
     */
    @NameInMap("MetricList")
    public java.util.List<DescribeTrailDeliveryMetricDataResponseBodyMetricList> metricList;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>851038F3-33AB-4C49-97D7-6AB37D35****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTrailDeliveryMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrailDeliveryMetricDataResponseBody self = new DescribeTrailDeliveryMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTrailDeliveryMetricDataResponseBody setMetricList(java.util.List<DescribeTrailDeliveryMetricDataResponseBodyMetricList> metricList) {
        this.metricList = metricList;
        return this;
    }
    public java.util.List<DescribeTrailDeliveryMetricDataResponseBodyMetricList> getMetricList() {
        return this.metricList;
    }

    public DescribeTrailDeliveryMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTrailDeliveryMetricDataResponseBodyMetricList extends TeaModel {
        /**
         * <p>The value of the metric. The meaning of this parameter depends on the value of the <code>MetricName</code> parameter in the request.</p>
         * <p>For example, if <code>MetricName</code> is set to <code>delivery_sls_success_count</code>, <code>Count</code> indicates the number of logs successfully delivered to SLS.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The Unix timestamp, in milliseconds, that marks the start of the time window for this data point.</p>
         * 
         * <strong>example:</strong>
         * <p>1775721600000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeTrailDeliveryMetricDataResponseBodyMetricList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrailDeliveryMetricDataResponseBodyMetricList self = new DescribeTrailDeliveryMetricDataResponseBodyMetricList();
            return TeaModel.build(map, self);
        }

        public DescribeTrailDeliveryMetricDataResponseBodyMetricList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeTrailDeliveryMetricDataResponseBodyMetricList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
