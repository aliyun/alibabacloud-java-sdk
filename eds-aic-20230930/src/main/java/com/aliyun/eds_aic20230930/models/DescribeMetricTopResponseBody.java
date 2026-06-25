// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMetricTopResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned.</p>
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
    public java.util.List<DescribeMetricTopResponseBodyMetricTotalModel> metricTotalModel;

    /**
     * <p>The token to retrieve the next page of results. If the results are not fully returned in a single query, this parameter is not empty. You can use this token in a subsequent query to retrieve the next page of results.</p>
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
     * <p>4610632D-D661-5982-B3D7-5D3FD183F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMetricTopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricTopResponseBody self = new DescribeMetricTopResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricTopResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeMetricTopResponseBody setMetricTotalModel(java.util.List<DescribeMetricTopResponseBodyMetricTotalModel> metricTotalModel) {
        this.metricTotalModel = metricTotalModel;
        return this;
    }
    public java.util.List<DescribeMetricTopResponseBodyMetricTotalModel> getMetricTotalModel() {
        return this.metricTotalModel;
    }

    public DescribeMetricTopResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMetricTopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMetricTopResponseBodyMetricTotalModelMetricModelListDataPoints extends TeaModel {
        /**
         * <p>The average value. Unit: %.</p>
         * <blockquote>
         * <p>The unit is bps when the metric is \<code>instance_in_traffic\\</code> or \<code>instance_out_traffic\\</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>99.52</p>
         */
        @NameInMap("Average")
        public Double average;

        /**
         * <p>The ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-fkuit0cmyru4p****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The maximum value. Unit: %.</p>
         * <blockquote>
         * <p>The unit is bps when the metric is \<code>instance_in_traffic\\</code> or \<code>instance_out_traffic\\</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Maximum")
        public Double maximum;

        /**
         * <p>The minimum value.</p>
         * <blockquote>
         * <p>The unit is bps when the metric is \<code>instance_in_traffic\\</code> or \<code>instance_out_traffic\\</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>93.1</p>
         */
        @NameInMap("Minimum")
        public Double minimum;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudPhone-****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The properties.</p>
         * <blockquote>
         * <p>A JSON string that contains the extension properties.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;IP&quot;:&quot;192.168.<em>.</em>**&quot;}</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>The timestamp of the data point. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1548777660000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeMetricTopResponseBodyMetricTotalModelMetricModelListDataPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricTopResponseBodyMetricTotalModelMetricModelListDataPoints self = new DescribeMetricTopResponseBodyMetricTotalModelMetricModelListDataPoints();
            return TeaModel.build(map, self);
        }

        public DescribeMetricTopResponseBodyMetricTotalModelMetricModelListDataPoints setAverage(Double average) {
            this.average = average;
            return this;
        }
        public Double getAverage() {
            return this.average;
        }

        public DescribeMetricTopResponseBodyMetricTotalModelMetricModelListDataPoints setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeMetricTopResponseBodyMetricTotalModelMetricModelListDataPoints setMaximum(Double maximum) {
            this.maximum = maximum;
            return this;
        }
        public Double getMaximum() {
            return this.maximum;
        }

        public DescribeMetricTopResponseBodyMetricTotalModelMetricModelListDataPoints setMinimum(Double minimum) {
            this.minimum = minimum;
            return this;
        }
        public Double getMinimum() {
            return this.minimum;
        }

        public DescribeMetricTopResponseBodyMetricTotalModelMetricModelListDataPoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMetricTopResponseBodyMetricTotalModelMetricModelListDataPoints setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public DescribeMetricTopResponseBodyMetricTotalModelMetricModelListDataPoints setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeMetricTopResponseBodyMetricTotalModelMetricModelList extends TeaModel {
        /**
         * <p>The monitoring data points.</p>
         */
        @NameInMap("DataPoints")
        public java.util.List<DescribeMetricTopResponseBodyMetricTotalModelMetricModelListDataPoints> dataPoints;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_in_traffic</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        public static DescribeMetricTopResponseBodyMetricTotalModelMetricModelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricTopResponseBodyMetricTotalModelMetricModelList self = new DescribeMetricTopResponseBodyMetricTotalModelMetricModelList();
            return TeaModel.build(map, self);
        }

        public DescribeMetricTopResponseBodyMetricTotalModelMetricModelList setDataPoints(java.util.List<DescribeMetricTopResponseBodyMetricTotalModelMetricModelListDataPoints> dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }
        public java.util.List<DescribeMetricTopResponseBodyMetricTotalModelMetricModelListDataPoints> getDataPoints() {
            return this.dataPoints;
        }

        public DescribeMetricTopResponseBodyMetricTotalModelMetricModelList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

    }

    public static class DescribeMetricTopResponseBodyMetricTotalModel extends TeaModel {
        /**
         * <p>For instance-level monitoring, this is the cloud phone instance ID.
         * &lt;props=&quot;china&quot;&gt;For matrix-level monitoring, this is the matrix ID.</p>
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
         * <p>The monitoring data of metrics.</p>
         */
        @NameInMap("MetricModelList")
        public java.util.List<DescribeMetricTopResponseBodyMetricTotalModelMetricModelList> metricModelList;

        public static DescribeMetricTopResponseBodyMetricTotalModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricTopResponseBodyMetricTotalModel self = new DescribeMetricTopResponseBodyMetricTotalModel();
            return TeaModel.build(map, self);
        }

        public DescribeMetricTopResponseBodyMetricTotalModel setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public DescribeMetricTopResponseBodyMetricTotalModel setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMetricTopResponseBodyMetricTotalModel setMetricModelList(java.util.List<DescribeMetricTopResponseBodyMetricTotalModelMetricModelList> metricModelList) {
            this.metricModelList = metricModelList;
            return this;
        }
        public java.util.List<DescribeMetricTopResponseBodyMetricTotalModelMetricModelList> getMetricModelList() {
            return this.metricModelList;
        }

    }

}
