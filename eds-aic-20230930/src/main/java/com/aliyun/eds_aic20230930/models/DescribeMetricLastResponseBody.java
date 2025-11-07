// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMetricLastResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Count")
    public Integer count;

    @NameInMap("MetricTotalModel")
    public java.util.List<DescribeMetricLastResponseBodyMetricTotalModel> metricTotalModel;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>2B9E6946-0E2A-5D2B-B275-361DF81F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMetricLastResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricLastResponseBody self = new DescribeMetricLastResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricLastResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeMetricLastResponseBody setMetricTotalModel(java.util.List<DescribeMetricLastResponseBodyMetricTotalModel> metricTotalModel) {
        this.metricTotalModel = metricTotalModel;
        return this;
    }
    public java.util.List<DescribeMetricLastResponseBodyMetricTotalModel> getMetricTotalModel() {
        return this.metricTotalModel;
    }

    public DescribeMetricLastResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMetricLastResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMetricLastResponseBodyMetricTotalModelMetricModelListDataPoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>99.52</p>
         */
        @NameInMap("Average")
        public Double average;

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

        public static DescribeMetricLastResponseBodyMetricTotalModelMetricModelListDataPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricLastResponseBodyMetricTotalModelMetricModelListDataPoints self = new DescribeMetricLastResponseBodyMetricTotalModelMetricModelListDataPoints();
            return TeaModel.build(map, self);
        }

        public DescribeMetricLastResponseBodyMetricTotalModelMetricModelListDataPoints setAverage(Double average) {
            this.average = average;
            return this;
        }
        public Double getAverage() {
            return this.average;
        }

        public DescribeMetricLastResponseBodyMetricTotalModelMetricModelListDataPoints setGpuId(String gpuId) {
            this.gpuId = gpuId;
            return this;
        }
        public String getGpuId() {
            return this.gpuId;
        }

        public DescribeMetricLastResponseBodyMetricTotalModelMetricModelListDataPoints setMaximum(Double maximum) {
            this.maximum = maximum;
            return this;
        }
        public Double getMaximum() {
            return this.maximum;
        }

        public DescribeMetricLastResponseBodyMetricTotalModelMetricModelListDataPoints setMinimum(Double minimum) {
            this.minimum = minimum;
            return this;
        }
        public Double getMinimum() {
            return this.minimum;
        }

        public DescribeMetricLastResponseBodyMetricTotalModelMetricModelListDataPoints setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeMetricLastResponseBodyMetricTotalModelMetricModelListProcessLastInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("CpuUsage")
        public Double cpuUsage;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("MemoryUsage")
        public Double memoryUsage;

        /**
         * <strong>example:</strong>
         * <p>com.offerup</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("ProcessIds")
        public java.util.List<Integer> processIds;

        /**
         * <strong>example:</strong>
         * <p>1548777660000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeMetricLastResponseBodyMetricTotalModelMetricModelListProcessLastInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricLastResponseBodyMetricTotalModelMetricModelListProcessLastInfos self = new DescribeMetricLastResponseBodyMetricTotalModelMetricModelListProcessLastInfos();
            return TeaModel.build(map, self);
        }

        public DescribeMetricLastResponseBodyMetricTotalModelMetricModelListProcessLastInfos setCpuUsage(Double cpuUsage) {
            this.cpuUsage = cpuUsage;
            return this;
        }
        public Double getCpuUsage() {
            return this.cpuUsage;
        }

        public DescribeMetricLastResponseBodyMetricTotalModelMetricModelListProcessLastInfos setMemoryUsage(Double memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }
        public Double getMemoryUsage() {
            return this.memoryUsage;
        }

        public DescribeMetricLastResponseBodyMetricTotalModelMetricModelListProcessLastInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMetricLastResponseBodyMetricTotalModelMetricModelListProcessLastInfos setProcessIds(java.util.List<Integer> processIds) {
            this.processIds = processIds;
            return this;
        }
        public java.util.List<Integer> getProcessIds() {
            return this.processIds;
        }

        public DescribeMetricLastResponseBodyMetricTotalModelMetricModelListProcessLastInfos setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeMetricLastResponseBodyMetricTotalModelMetricModelList extends TeaModel {
        @NameInMap("DataPoints")
        public java.util.List<DescribeMetricLastResponseBodyMetricTotalModelMetricModelListDataPoints> dataPoints;

        /**
         * <strong>example:</strong>
         * <p>cpu_utilization</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("ProcessLastInfos")
        public java.util.List<DescribeMetricLastResponseBodyMetricTotalModelMetricModelListProcessLastInfos> processLastInfos;

        public static DescribeMetricLastResponseBodyMetricTotalModelMetricModelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricLastResponseBodyMetricTotalModelMetricModelList self = new DescribeMetricLastResponseBodyMetricTotalModelMetricModelList();
            return TeaModel.build(map, self);
        }

        public DescribeMetricLastResponseBodyMetricTotalModelMetricModelList setDataPoints(java.util.List<DescribeMetricLastResponseBodyMetricTotalModelMetricModelListDataPoints> dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }
        public java.util.List<DescribeMetricLastResponseBodyMetricTotalModelMetricModelListDataPoints> getDataPoints() {
            return this.dataPoints;
        }

        public DescribeMetricLastResponseBodyMetricTotalModelMetricModelList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeMetricLastResponseBodyMetricTotalModelMetricModelList setProcessLastInfos(java.util.List<DescribeMetricLastResponseBodyMetricTotalModelMetricModelListProcessLastInfos> processLastInfos) {
            this.processLastInfos = processLastInfos;
            return this;
        }
        public java.util.List<DescribeMetricLastResponseBodyMetricTotalModelMetricModelListProcessLastInfos> getProcessLastInfos() {
            return this.processLastInfos;
        }

    }

    public static class DescribeMetricLastResponseBodyMetricTotalModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acp-fkuit0cmyru4p****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        @NameInMap("MetricModelList")
        public java.util.List<DescribeMetricLastResponseBodyMetricTotalModelMetricModelList> metricModelList;

        public static DescribeMetricLastResponseBodyMetricTotalModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricLastResponseBodyMetricTotalModel self = new DescribeMetricLastResponseBodyMetricTotalModel();
            return TeaModel.build(map, self);
        }

        public DescribeMetricLastResponseBodyMetricTotalModel setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public DescribeMetricLastResponseBodyMetricTotalModel setMetricModelList(java.util.List<DescribeMetricLastResponseBodyMetricTotalModelMetricModelList> metricModelList) {
            this.metricModelList = metricModelList;
            return this;
        }
        public java.util.List<DescribeMetricLastResponseBodyMetricTotalModelMetricModelList> getMetricModelList() {
            return this.metricModelList;
        }

    }

}
