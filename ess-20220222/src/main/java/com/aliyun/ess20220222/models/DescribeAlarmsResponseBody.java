// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeAlarmsResponseBody extends TeaModel {
    /**
     * <p>The list of event-triggered tasks.</p>
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
         * <p>The key of the dimension. Valid values:</p>
         * <br>
         * <p>*   user_id: the ID of your Alibaba Cloud account</p>
         * <p>*   scaling_group: the scaling group that you want to monitor</p>
         * <p>*   device: the type of the NIC</p>
         * <p>*   state: the state of the TCP connection</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The value of the dimension. The value of the DimensionValue parameter varies based on the value of the DimensionKey parameter.</p>
         * <br>
         * <p>*   If you set the DimensionKey parameter to `user_id`, the system specifies the value of the DimensionValue parameter.</p>
         * <br>
         * <p>*   If you set the DimensionKey parameter to `scaling_group`, the system specifies the value of the DimensionValue parameter.</p>
         * <br>
         * <p>*   If you set the DimensionKey parameter to `device`, you can set the DimensionValue parameter to eth0 or eth1.</p>
         * <br>
         * <p>    *   For instances that reside in the classic network type, eth0 specifies the internal NIC. Only one eth0 NIC exists on each instance that resides in a VPC.</p>
         * <p>    *   For instances that reside in the classic network, eth1 specifies the public NIC.</p>
         * <br>
         * <p>*   If you set the DimensionKey parameter to `state`, you can set the DimensionValue parameter to TCP_TOTAL or ESTABLISHED.</p>
         * <br>
         * <p>    *   TCP_TOTAL specifies the total number of TCP connections.</p>
         * <p>    *   ESTABLISHED specifies the number of established TCP connections.</p>
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
         * <p>*   Valid value if the metric value is greater than or equal to the threshold: >=</p>
         * <p>*   Valid value if the metric value is less than or equal to the threshold: <=</p>
         * <p>*   Valid value if the metric value is greater than the threshold: ></p>
         * <p>*   Valid value if the metric value is less than the threshold: <</p>
         * <br>
         * <p>Default value: >=.</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The name of the metric that is specified in the multi-metric alert rule. Valid values:</p>
         * <br>
         * <p>*   CpuUtilization: the CPU utilization of an ECS instance. Unit: %.</p>
         * <p>*   IntranetTx: the outbound traffic over the internal network from an ECS instance. Unit: KB/min.</p>
         * <p>*   IntranetRx: the inbound traffic over the Internet to an ECS instance that resides in a VPC. Unit: KB/min.</p>
         * <p>*   VpcInternetTx: the outbound traffic over the Internet from an ECS instance that resides in a VPC. Unit: KB/min.</p>
         * <p>*   VpcInternetRx: the inbound traffic over the Internet to an ECS instance that resides in a VPC. Unit: KB/min.</p>
         * <p>*   SystemDiskReadBps: the number of bytes read from the system disk used by an ECS instance per second.</p>
         * <p>*   SystemDiskWriteBps: the number of bytes written to the system disk used by an ECS instance per second.</p>
         * <p>*   SystemDiskReadOps: the number of read operations on the system disk used by an ECS instance per second.</p>
         * <p>*   SystemDiskWriteOps: the number of write operations on the system disk used by an ECS instance per second.</p>
         * <p>*   CpuUtilizationAgent: the CPU utilization of an agent. Unit: %.</p>
         * <p>*   GpuUtilizationAgent: the GPU utilization of an agent. Unit: %.</p>
         * <p>*   GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory of an agent.</p>
         * <p>*   GpuMemoryUtilizationAgent: the GPU memory usage of an agent. Unit: %.</p>
         * <p>*   MemoryUtilization: the memory usage of an agent. Unit: %.</p>
         * <p>*   LoadAverage: the average system load of an agent.</p>
         * <p>*   TcpConnection: the total number of TCP connections of an agent.</p>
         * <p>*   TcpConnection: the number of established TCP connections of an agent.</p>
         * <p>*   PackagesNetOut: the number of packets that are sent by the internal NIC used by an agent.</p>
         * <p>*   PackagesNetIn: the number of packets that are received by the internal NIC used by an agent.</p>
         * <p>*   EciPodCpuUtilization: the CPU utilization of an elastic container instance. Unit: %.</p>
         * <p>*   EciPodMemoryUtilization: the memory usage of an elastic container instance. Unit: %.</p>
         * <br>
         * <p>For more information, see [Event-triggered task for system monitoring](https://help.aliyun.com/document_detail/74854.html).</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The period of time during which statistics about the metrics in the multi-metric alert rule is collected. Unit: seconds. Valid values:</p>
         * <br>
         * <p>*   15</p>
         * <p>*   60</p>
         * <p>*   120</p>
         * <p>*   300</p>
         * <p>*   900</p>
         * <br>
         * <p>> If your scaling group is of the ECS type and the event-triggered task associated with your scaling group monitors CloudMonitor metrics, you can set the Period parameter to 15. In most cases, the name of a CloudMonitor metric contains Agent.</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The method that is used to aggregate statistics about the metrics in the multi-metric alert rule. Valid values:</p>
         * <br>
         * <p>*   Average</p>
         * <p>*   Minimum</p>
         * <p>*   Maximum</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The thresholds of the metric values in the multi-metric alert rule. If the thresholds are reached the specified number of times within the specified period, a scaling rule is executed.</p>
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
         * <p>The list of unique identifiers of the scaling rules that are associated with the event-triggered task.</p>
         */
        @NameInMap("AlarmActions")
        public java.util.List<String> alarmActions;

        /**
         * <p>The ID of the event-triggered task.</p>
         */
        @NameInMap("AlarmTaskId")
        public String alarmTaskId;

        /**
         * <p>The operator that is used to compare the metric value and the threshold.</p>
         * <br>
         * <p>*   Valid value if the metric value is greater than or equal to the threshold: >=</p>
         * <p>*   Valid value if the metric value is less than or equal to the threshold: <=</p>
         * <p>*   Valid value if the metric value is greater than the threshold: ></p>
         * <p>*   Valid value if the metric value is less than the threshold: <</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The description of the event-triggered task.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Details of the dimensions.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<DescribeAlarmsResponseBodyAlarmListDimensions> dimensions;

        /**
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
        @NameInMap("Effective")
        public String effective;

        /**
         * <p>Indicates whether the event-triggered task is enabled. Valid values:</p>
         * <br>
         * <p>*   true: The event-triggered task is enabled.</p>
         * <p>*   false: The event-triggered task is disabled.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The number of times that the threshold must be reached before a scaling rule can be executed. For example, if you set this parameter to 3, the average CPU utilization must reach or exceed 80% three times in a row before a scaling rule is triggered.</p>
         */
        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        /**
         * <p>The expressions that are specified in the multi-metric alert rule.</p>
         */
        @NameInMap("Expressions")
        public java.util.List<DescribeAlarmsResponseBodyAlarmListExpressions> expressions;

        /**
         * <p>The relationship between the trigger conditions that are specified in the multi-metric alert rule. Valid values:</p>
         * <br>
         * <p>*   `&&`: An alert is triggered only if all metrics in the multi-metric alert rule meet the trigger conditions. In this case, an alert is triggered only if the results of all trigger conditions that are specified in the multi-metric alert rule are `true`.</p>
         * <p>*   `||`: An alert is triggered if one of the metrics in the multi-metric alert rule meets the trigger conditions.</p>
         */
        @NameInMap("ExpressionsLogicOperator")
        public String expressionsLogicOperator;

        /**
         * <p>The name of the metric. Valid values:</p>
         * <br>
         * <p>*   CpuUtilization: the CPU utilization of an ECS instance. Unit: %.</p>
         * <p>*   IntranetTx: the outbound traffic over the internal network from an ECS instance. Unit: KB/min.</p>
         * <p>*   IntranetRx: the inbound traffic over the Internet to an ECS instance that resides in a VPC. Unit: KB/min.</p>
         * <p>*   VpcInternetTx: the outbound traffic over the Internet from an ECS instance that resides in a VPC. Unit: KB/min.</p>
         * <p>*   VpcInternetRx: the inbound traffic over the Internet to an ECS instance that resides in a VPC. Unit: KB/min.</p>
         * <p>*   SystemDiskReadBps: the number of bytes read from the system disk used by an ECS instance per second.</p>
         * <p>*   SystemDiskWriteBps: the number of bytes written to the system disk used by an ECS instance per second.</p>
         * <p>*   SystemDiskReadOps: the number of read operations on the system disk used by an ECS instance per second.</p>
         * <p>*   SystemDiskWriteOps: the number of write operations on the system disk used by an ECS instance per second.</p>
         * <p>*   CpuUtilizationAgent: the CPU utilization of an agent. Unit: %.</p>
         * <p>*   GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory of an agent.</p>
         * <p>*   GpuMemoryUtilizationAgent: the GPU memory usage of an agent. Unit: %.</p>
         * <p>*   MemoryUtilization: the memory usage of an agent. Unit: %.</p>
         * <p>*   LoadAverage: the average system load of an agent.</p>
         * <p>*   TcpConnection: the total number of TCP connections of an agent.</p>
         * <p>*   TcpConnection: the number of established TCP connections of an agent.</p>
         * <p>*   PackagesNetOut: the number of packets that are sent by the internal NIC used by an agent.</p>
         * <p>*   PackagesNetIn: the number of packets that are received by the internal NIC used by an agent.</p>
         * <p>*   EciPodCpuUtilization: the CPU utilization of an elastic container instance. Unit: %.</p>
         * <p>*   EciPodMemoryUtilization: the memory usage of an elastic container instance. Unit: %.</p>
         * <br>
         * <p>For more information, see [Event-triggered task for system monitoring](https://help.aliyun.com/document_detail/74854.html).</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The type of the metric. Valid values:</p>
         * <br>
         * <p>*   system: system metrics of CloudMonitor</p>
         * <p>*   custom: custom metrics that are reported to CloudMonitor</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        /**
         * <p>The name of the event-triggered task.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The period of time during which statistics about the metric is collected. Unit: seconds. Valid values:</p>
         * <br>
         * <p>*   15</p>
         * <p>*   60</p>
         * <p>*   120</p>
         * <p>*   300</p>
         * <p>*   900</p>
         * <br>
         * <p>> If your scaling group is of the ECS type and the event-triggered task associated with your scaling group monitors CloudMonitor metrics, you can set the Period parameter to 15. In most cases, the name of a CloudMonitor metric contains Agent.</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The scaling group ID of the event-triggered task.</p>
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
         * <p>The method that is used to aggregate statistics for the metric. Valid values:</p>
         * <br>
         * <p>*   Average</p>
         * <p>*   Minimum</p>
         * <p>*   Maximum</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold of the metric value. If the threshold is reached the specified times within the specified period, a scaling rule is executed.</p>
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
