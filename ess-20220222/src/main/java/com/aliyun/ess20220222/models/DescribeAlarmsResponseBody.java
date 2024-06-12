// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeAlarmsResponseBody extends TeaModel {
    /**
     * <p>The event-triggered tasks.</p>
     */
    @NameInMap("AlarmList")
    public java.util.List<DescribeAlarmsResponseBodyAlarmList> alarmList;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of event-triggered tasks.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAlarmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmsResponseBody self = new DescribeAlarmsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmsResponseBody setAlarmList(java.util.List<DescribeAlarmsResponseBodyAlarmList> alarmList) {
        this.alarmList = alarmList;
        return this;
    }
    public java.util.List<DescribeAlarmsResponseBodyAlarmList> getAlarmList() {
        return this.alarmList;
    }

    public DescribeAlarmsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAlarmsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlarmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlarmsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAlarmsResponseBodyAlarmListDimensions extends TeaModel {
        /**
         * <p>The dimension key of the metric. Valid values:</p>
         * <br>
         * <p>*   user_id: the ID of your Alibaba Cloud account.</p>
         * <p>*   scaling_group: the scaling group that is monitored by the event-triggered task.</p>
         * <p>*   device: the NIC type.</p>
         * <p>*   state: the status of the TCP connection.</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The dimension value of the metric. The value of DimensionValue varies based on the value of DimensionKey.</p>
         * <br>
         * <p>*   If you set DimensionKey to `user_id`, the system specifies the value of DimensionValue.</p>
         * <br>
         * <p>*   If you set DimensionKey to `scaling_group`, the system specifies the value of DimensionValue.</p>
         * <br>
         * <p>*   If you set DimensionKey to `device`, you can set DimensionValue to eth0 or eth1.</p>
         * <br>
         * <p>    *   For instances of the classic network type, eth0 indicates the internal NIC. Only one eth0 NIC exists on each instance that resides in VPCs.</p>
         * <p>    *   For instances of the classic network type, eth1 indicates the public NIC.</p>
         * <br>
         * <p>*   If you set DimensionKey to `state`, you can set DimensionValue to TCP_TOTAL or ESTABLISHED.</p>
         * <br>
         * <p>    *   TCP_TOTAL indicates the total number of TCP connections.</p>
         * <p>    *   ESTABLISHED indicates the number of TCP connections that are established.</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        public static DescribeAlarmsResponseBodyAlarmListDimensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyAlarmListDimensions self = new DescribeAlarmsResponseBodyAlarmListDimensions();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyAlarmListDimensions setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public DescribeAlarmsResponseBodyAlarmListDimensions setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

    }

    public static class DescribeAlarmsResponseBodyAlarmListExpressions extends TeaModel {
        /**
         * <p>The operator that is used to compare the metric value and the threshold.</p>
         * <br>
         * <p>*   Valid value if the metric value is greater than or equal to the threshold: >=.</p>
         * <p>*   Valid value if the metric value is less than or equal to the threshold: <=.</p>
         * <p>*   Valid value if the metric value is greater than the threshold: >.</p>
         * <p>*   Valid value if the metric value is less than the threshold: <.</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The name of the metric that is specified in the multi-metric alert rule. Valid values:</p>
         * <br>
         * <p>*   CpuUtilization: the CPU utilization of an ECS instance. Unit: %.</p>
         * <p>*   ConcurrentConnections: the number of current connections to an ECS instance.</p>
         * <p>*   IntranetTx: the outbound traffic over an internal network. Unit: KB/min.</p>
         * <p>*   IntranetRx: the inbound traffic over an internal network. Unit: KB/min.</p>
         * <p>*   VpcInternetTx: the outbound traffic over a VPC. Unit: KB/min.</p>
         * <p>*   VpcInternetRx: the inbound traffic over a VPC. Unit: KB/min.</p>
         * <p>*   SystemDiskReadBps: the number of bytes read from the system disk per second.</p>
         * <p>*   SystemDiskWriteBps: the number of bytes written to the system disk per second.</p>
         * <p>*   SystemDiskReadOps: the read IOPS of the system disk. Unit: counts/s.</p>
         * <p>*   SystemDiskWriteOps: the write IOPS of the system disk. Unit: counts/s.</p>
         * <p>*   CpuUtilizationAgent: the CPU utilization. Unit: %.</p>
         * <p>*   GpuUtilizationAgent: the GPU utilization. Unit: %.</p>
         * <p>*   GpuMemoryFreeUtilizationAgent: the idle GPU memory usage. Unit: %.</p>
         * <p>*   GpuMemoryUtilizationAgent: the GPU memory usage. Unit: %.</p>
         * <p>*   MemoryUtilization: the memory usage. Unit: %.</p>
         * <p>*   LoadAverage: the average system load.</p>
         * <p>*   TcpConnection: the total number of TCP connections.</p>
         * <p>*   TcpConnection: the number of established TCP connections.</p>
         * <p>*   PackagesNetOut: the number of packets sent by the internal NIC. Unit: counts/s.</p>
         * <p>*   PackagesNetIn: the number of packets received by the internal NIC. Unit: counts/s.</p>
         * <p>*   PackagesNetOut: the number of packets sent by the public NIC. Unit: counts/s.</p>
         * <p>*   PackagesNetIn: the number of packets received by the public NIC. Unit: counts/s.</p>
         * <p>*   EciPodCpuUtilization: the CPU utilization. Unit: %.</p>
         * <p>*   EciPodMemoryUtilization: the memory usage. Unit: %.</p>
         * <p>*   LoadBalancerRealServerAverageQps: the QPS of an instance.</p>
         * <br>
         * <p>For more information, see [Event-triggered tasks of the system monitoring type](https://help.aliyun.com/document_detail/74854.html).</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The statistical period of the metric data in the multi-metric alert rule. Unit: seconds. Valid values:</p>
         * <br>
         * <p>*   15</p>
         * <p>*   60</p>
         * <p>*   120</p>
         * <p>*   300</p>
         * <p>*   900</p>
         * <br>
         * <p>>  If your scaling group is of the ECS type and the event-triggered task that is associated with your scaling group monitors CloudMonitor metrics, you can set Period to 15. In most cases, the name of a CloudMonitor metric contains Agent.</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The method that is used to aggregate statistics about the metrics in the multi-metric alert rule. Valid values:</p>
         * <br>
         * <p>*   Average: the average value</p>
         * <p>*   Minimum: the minimum value</p>
         * <p>*   Maximum: the maximum value</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold of the metric value. If the threshold is reached the specified number of times within the specified period, a scaling rule is executed.</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        public static DescribeAlarmsResponseBodyAlarmListExpressions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyAlarmListExpressions self = new DescribeAlarmsResponseBodyAlarmListExpressions();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyAlarmListExpressions setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeAlarmsResponseBodyAlarmListExpressions setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAlarmsResponseBodyAlarmListExpressions setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeAlarmsResponseBodyAlarmListExpressions setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlarmsResponseBodyAlarmListExpressions setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class DescribeAlarmsResponseBodyAlarmList extends TeaModel {
        /**
         * <p>The unique identifiers of the scaling rules that are associated with the event-triggered task.</p>
         */
        @NameInMap("AlarmActions")
        public java.util.List<String> alarmActions;

        /**
         * <p>The ID of the event-triggered task.</p>
         */
        @NameInMap("AlarmTaskId")
        public String alarmTaskId;

        /**
         * <p>The operator that is used to compare the metric value and the metric threshold.</p>
         * <br>
         * <p>*   Valid value if the metric value is greater than or equal to the threshold: >=.</p>
         * <p>*   Valid value if the metric value is less than or equal to the threshold: <=.</p>
         * <p>*   Valid value if the metric value is greater than the threshold: >.</p>
         * <p>*   Valid value if the metric value is less than the threshold: <.</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The description of the event-triggered task.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The metric dimensions.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<DescribeAlarmsResponseBodyAlarmListDimensions> dimensions;

        /**
         * <p>The effective period of the event-triggered task.</p>
         */
        @NameInMap("Effective")
        public String effective;

        /**
         * <p>Indicates whether the event-triggered task feature is enabled. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The number of consecutive times that the threshold must be reached before a scaling rule is executed. For example, if you set this parameter to 3, the average CPU utilization must reach or exceed 80% three times in a row before a scaling rule is executed.</p>
         */
        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        /**
         * <p>The alert conditions of the multi-metric alert rule.</p>
         */
        @NameInMap("Expressions")
        public java.util.List<DescribeAlarmsResponseBodyAlarmListExpressions> expressions;

        /**
         * <p>The relationship between the trigger conditions that are specified in the multi-metric alert rule. Valid values:</p>
         * <br>
         * <p>*   `&&`: An alert is triggered only if all metrics in the multi-metric alert rule meet their trigger conditions. In this case, an alert is triggered only if the results of all trigger conditions that are specified in the multi-metric alert rule are `true`.</p>
         * <p>*   `||`: An alert is triggered only if one of the metrics in the multi-metric alert rule meets its trigger condition.</p>
         */
        @NameInMap("ExpressionsLogicOperator")
        public String expressionsLogicOperator;

        /**
         * <p>The metric name. Valid values:</p>
         * <br>
         * <p>*   CpuUtilization: the CPU utilization of an Elastic Compute Service (ECS) instance. Unit: %.</p>
         * <p>*   ConcurrentConnections: the number of current connections to an ECS instance.</p>
         * <p>*   IntranetTx: the outbound traffic over an internal network. Unit: KB/min.</p>
         * <p>*   IntranetRx: the inbound traffic over an internal network. Unit: KB/min.</p>
         * <p>*   VpcInternetTx: the outbound traffic over a virtual private cloud (VPC). Unit: KB/min.</p>
         * <p>*   VpcInternetRx: the inbound traffic over a VPC. Unit: KB/min.</p>
         * <p>*   SystemDiskReadBps: the number of bytes read from the system disk per second.</p>
         * <p>*   SystemDiskWriteBps: the number of bytes written to the system disk per second.</p>
         * <p>*   SystemDiskReadOps: the read IOPS of the system disk. Unit: counts/s.</p>
         * <p>*   SystemDiskWriteOps: the write IOPS of the system disk. Unit: counts/s.</p>
         * <p>*   CpuUtilizationAgent: the CPU utilization. Unit: %.</p>
         * <p>*   GpuUtilizationAgent: the GPU utilization. Unit: %.</p>
         * <p>*   GpuMemoryFreeUtilizationAgent: the idle GPU memory usage. Unit: %.</p>
         * <p>*   GpuMemoryUtilizationAgent: the GPU memory usage. Unit: %.</p>
         * <p>*   MemoryUtilization: the memory usage. Unit: %.</p>
         * <p>*   LoadAverage: the average system load.</p>
         * <p>*   TcpConnection: the total number of TCP connections.</p>
         * <p>*   TcpConnection: the number of established TCP connections.</p>
         * <p>*   PackagesNetOut: the number of packets sent by the internal NIC. Unit: counts/s.</p>
         * <p>*   PackagesNetIn: the number of packets received by the internal NIC. Unit: counts/s.</p>
         * <p>*   PackagesNetOut: the number of packets sent by the public NIC. Unit: counts/s.</p>
         * <p>*   PackagesNetIn: the number of packets received by the public NIC. Unit: counts/s.</p>
         * <p>*   EciPodCpuUtilization: the CPU utilization. Unit: %.</p>
         * <p>*   EciPodMemoryUtilization: the memory usage. Unit: %.</p>
         * <p>*   LoadBalancerRealServerAverageQps: the queries per second (QPS) of an instance.</p>
         * <br>
         * <p>For more information, see [Event-triggered tasks of the system monitoring type](https://help.aliyun.com/document_detail/74854.html).</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The metric type. Valid values:</p>
         * <br>
         * <p>*   system: system metrics of CloudMonitor</p>
         * <p>*   custom: custom metrics that are reported to CloudMonitor.</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        /**
         * <p>The name of the event-triggered task.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The statistical period of the metric data. Unit: seconds. Valid values:</p>
         * <br>
         * <p>*   15</p>
         * <p>*   60</p>
         * <p>*   120</p>
         * <p>*   300</p>
         * <p>*   900</p>
         * <br>
         * <p>>  You can set the value of this parameter to 15 Seconds only for scaling groups of the ECS type.</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The ID of the scaling group to which the event-triggered task is associated.</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The status of the event-triggered task. Valid values:</p>
         * <br>
         * <p>*   ALARM: The alert condition is met and an alert is triggered.</p>
         * <p>*   OK: The alert condition is not met.</p>
         * <p>*   INSUFFICIENT_DATA: Auto Scaling cannot determine whether the alert condition is met due to insufficient data.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The method that is used to aggregate the metric data. Valid values:</p>
         * <br>
         * <p>*   Average: the average value</p>
         * <p>*   Minimum: the minimum value</p>
         * <p>*   Maximum: the maximum value</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold of the metric. If the threshold is reached the specified number of times within the statistical period, a scaling rule is executed.</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        public static DescribeAlarmsResponseBodyAlarmList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyAlarmList self = new DescribeAlarmsResponseBodyAlarmList();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyAlarmList setAlarmActions(java.util.List<String> alarmActions) {
            this.alarmActions = alarmActions;
            return this;
        }
        public java.util.List<String> getAlarmActions() {
            return this.alarmActions;
        }

        public DescribeAlarmsResponseBodyAlarmList setAlarmTaskId(String alarmTaskId) {
            this.alarmTaskId = alarmTaskId;
            return this;
        }
        public String getAlarmTaskId() {
            return this.alarmTaskId;
        }

        public DescribeAlarmsResponseBodyAlarmList setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeAlarmsResponseBodyAlarmList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAlarmsResponseBodyAlarmList setDimensions(java.util.List<DescribeAlarmsResponseBodyAlarmListDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<DescribeAlarmsResponseBodyAlarmListDimensions> getDimensions() {
            return this.dimensions;
        }

        public DescribeAlarmsResponseBodyAlarmList setEffective(String effective) {
            this.effective = effective;
            return this;
        }
        public String getEffective() {
            return this.effective;
        }

        public DescribeAlarmsResponseBodyAlarmList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeAlarmsResponseBodyAlarmList setEvaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeAlarmsResponseBodyAlarmList setExpressions(java.util.List<DescribeAlarmsResponseBodyAlarmListExpressions> expressions) {
            this.expressions = expressions;
            return this;
        }
        public java.util.List<DescribeAlarmsResponseBodyAlarmListExpressions> getExpressions() {
            return this.expressions;
        }

        public DescribeAlarmsResponseBodyAlarmList setExpressionsLogicOperator(String expressionsLogicOperator) {
            this.expressionsLogicOperator = expressionsLogicOperator;
            return this;
        }
        public String getExpressionsLogicOperator() {
            return this.expressionsLogicOperator;
        }

        public DescribeAlarmsResponseBodyAlarmList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAlarmsResponseBodyAlarmList setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public DescribeAlarmsResponseBodyAlarmList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAlarmsResponseBodyAlarmList setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeAlarmsResponseBodyAlarmList setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeAlarmsResponseBodyAlarmList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeAlarmsResponseBodyAlarmList setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlarmsResponseBodyAlarmList setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
