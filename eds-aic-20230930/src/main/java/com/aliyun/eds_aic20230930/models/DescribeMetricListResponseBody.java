// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMetricListResponseBody extends TeaModel {
    /**
     * <p>The number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The instance monitoring data.</p>
     */
    @NameInMap("MetricTotalModel")
    public java.util.List<DescribeMetricListResponseBodyMetricTotalModel> metricTotalModel;

    /**
     * <p>The token for the next query. If not all results are returned, this parameter is not empty. Use the returned token to query the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMetricListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricListResponseBody self = new DescribeMetricListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricListResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeMetricListResponseBody setMetricTotalModel(java.util.List<DescribeMetricListResponseBodyMetricTotalModel> metricTotalModel) {
        this.metricTotalModel = metricTotalModel;
        return this;
    }
    public java.util.List<DescribeMetricListResponseBodyMetricTotalModel> getMetricTotalModel() {
        return this.metricTotalModel;
    }

    public DescribeMetricListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMetricListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMetricListResponseBodyMetricTotalModelMetricModelListDataPoints extends TeaModel {
        /**
         * <p>The average value. Unit: %.</p>
         * <blockquote>
         * <p>The unit is bps when the metric is \<code>bandwidth_package_usage_out\\</code> or \<code>bandwidth_package_usage_in\\</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>99.52</p>
         */
        @NameInMap("Average")
        public Double average;

        /**
         * <p>The GPU ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cpn-1t1bxvp9az2pk****-gpu-0</p>
         */
        @NameInMap("GpuId")
        public String gpuId;

        /**
         * <p>The maximum value. Unit: %.</p>
         * <blockquote>
         * <p>The unit is bps when the metric is \<code>bandwidth_package_usage_out\\</code> or \<code>bandwidth_package_usage_in\\</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Maximum")
        public Double maximum;

        /**
         * <p>The minimum value. Unit: %.</p>
         * <blockquote>
         * <p>The unit is bps when the metric is \<code>bandwidth_package_usage_out\\</code> or \<code>bandwidth_package_usage_in\\</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>93.1</p>
         */
        @NameInMap("Minimum")
        public Double minimum;

        /**
         * <p>The timestamp of the statistics. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1548777660000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The data value. Unit: %.</p>
         * <blockquote>
         * <p>The unit is bps when the metric is \<code>bandwidth_package_usage_out\\</code> or \<code>bandwidth_package_usage_in\\</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tf-testacc-oos-parameter</p>
         */
        @NameInMap("Value")
        public Double value;

        public static DescribeMetricListResponseBodyMetricTotalModelMetricModelListDataPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricListResponseBodyMetricTotalModelMetricModelListDataPoints self = new DescribeMetricListResponseBodyMetricTotalModelMetricModelListDataPoints();
            return TeaModel.build(map, self);
        }

        public DescribeMetricListResponseBodyMetricTotalModelMetricModelListDataPoints setAverage(Double average) {
            this.average = average;
            return this;
        }
        public Double getAverage() {
            return this.average;
        }

        public DescribeMetricListResponseBodyMetricTotalModelMetricModelListDataPoints setGpuId(String gpuId) {
            this.gpuId = gpuId;
            return this;
        }
        public String getGpuId() {
            return this.gpuId;
        }

        public DescribeMetricListResponseBodyMetricTotalModelMetricModelListDataPoints setMaximum(Double maximum) {
            this.maximum = maximum;
            return this;
        }
        public Double getMaximum() {
            return this.maximum;
        }

        public DescribeMetricListResponseBodyMetricTotalModelMetricModelListDataPoints setMinimum(Double minimum) {
            this.minimum = minimum;
            return this;
        }
        public Double getMinimum() {
            return this.minimum;
        }

        public DescribeMetricListResponseBodyMetricTotalModelMetricModelListDataPoints setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeMetricListResponseBodyMetricTotalModelMetricModelListDataPoints setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class DescribeMetricListResponseBodyMetricTotalModelMetricModelList extends TeaModel {
        /**
         * <p>A list of monitoring data points.</p>
         */
        @NameInMap("DataPoints")
        public java.util.List<DescribeMetricListResponseBodyMetricTotalModelMetricModelListDataPoints> dataPoints;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_utilization</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>Required</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        public static DescribeMetricListResponseBodyMetricTotalModelMetricModelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricListResponseBodyMetricTotalModelMetricModelList self = new DescribeMetricListResponseBodyMetricTotalModelMetricModelList();
            return TeaModel.build(map, self);
        }

        public DescribeMetricListResponseBodyMetricTotalModelMetricModelList setDataPoints(java.util.List<DescribeMetricListResponseBodyMetricTotalModelMetricModelListDataPoints> dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }
        public java.util.List<DescribeMetricListResponseBodyMetricTotalModelMetricModelListDataPoints> getDataPoints() {
            return this.dataPoints;
        }

        public DescribeMetricListResponseBodyMetricTotalModelMetricModelList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeMetricListResponseBodyMetricTotalModelMetricModelList setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

    }

    public static class DescribeMetricListResponseBodyMetricTotalModel extends TeaModel {
        /**
         * <p>For instance-level monitoring, the Cloud Phone instance ID is returned.
         * &lt;props=&quot;china&quot;&gt;For matrix-level monitoring, the matrix ID is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-fkuit0cmyru4p****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>np-5hh4a31emkt6u****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The monitoring data for metrics.</p>
         */
        @NameInMap("MetricModelList")
        public java.util.List<DescribeMetricListResponseBodyMetricTotalModelMetricModelList> metricModelList;

        public static DescribeMetricListResponseBodyMetricTotalModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricListResponseBodyMetricTotalModel self = new DescribeMetricListResponseBodyMetricTotalModel();
            return TeaModel.build(map, self);
        }

        public DescribeMetricListResponseBodyMetricTotalModel setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public DescribeMetricListResponseBodyMetricTotalModel setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMetricListResponseBodyMetricTotalModel setMetricModelList(java.util.List<DescribeMetricListResponseBodyMetricTotalModelMetricModelList> metricModelList) {
            this.metricModelList = metricModelList;
            return this;
        }
        public java.util.List<DescribeMetricListResponseBodyMetricTotalModelMetricModelList> getMetricModelList() {
            return this.metricModelList;
        }

    }

}
