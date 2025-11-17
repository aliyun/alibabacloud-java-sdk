// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMetricListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    @NameInMap("MetricTotalModel")
    public java.util.List<DescribeMetricListResponseBodyMetricTotalModel> metricTotalModel;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
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
         * <strong>example:</strong>
         * <p>99.52</p>
         */
        @NameInMap("Average")
        public Double average;

        /**
         * <strong>example:</strong>
         * <p>cpn-1t1bxvp9az2pk****-gpu-0</p>
         */
        @NameInMap("GpuId")
        public String gpuId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Maximum")
        public Double maximum;

        /**
         * <strong>example:</strong>
         * <p>93.1</p>
         */
        @NameInMap("Minimum")
        public Double minimum;

        /**
         * <strong>example:</strong>
         * <p>1548777660000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
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
        @NameInMap("DataPoints")
        public java.util.List<DescribeMetricListResponseBodyMetricTotalModelMetricModelListDataPoints> dataPoints;

        /**
         * <strong>example:</strong>
         * <p>cpu_utilization</p>
         */
        @NameInMap("MetricName")
        public String metricName;

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
         * <strong>example:</strong>
         * <p>acp-fkuit0cmyru4p****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        /**
         * <strong>example:</strong>
         * <p>np-5hh4a31emkt6u****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

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
