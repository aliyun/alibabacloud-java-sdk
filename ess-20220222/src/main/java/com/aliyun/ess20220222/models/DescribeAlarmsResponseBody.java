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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>871C7C53-34A4-45AA-8C14-4B72FA6A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of event-triggered tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * <ul>
         * <li>user_id: the ID of your Alibaba Cloud account.</li>
         * <li>scaling_group: the scaling group that is monitored by the event-triggered task.</li>
         * <li>device: the NIC type.</li>
         * <li>state: the status of the TCP connection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>device</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The dimension value of the metric. The value of DimensionValue varies based on the value of DimensionKey.</p>
         * <ul>
         * <li><p>If you set DimensionKey to <code>user_id</code>, the system specifies the value of DimensionValue.</p>
         * </li>
         * <li><p>If you set DimensionKey to <code>scaling_group</code>, the system specifies the value of DimensionValue.</p>
         * </li>
         * <li><p>If you set DimensionKey to <code>device</code>, you can set DimensionValue to eth0 or eth1.</p>
         * <ul>
         * <li>For instances of the classic network type, eth0 indicates the internal NIC. Only one eth0 NIC exists on each instance that resides in VPCs.</li>
         * <li>For instances of the classic network type, eth1 indicates the public NIC.</li>
         * </ul>
         * </li>
         * <li><p>If you set DimensionKey to <code>state</code>, you can set DimensionValue to TCP_TOTAL or ESTABLISHED.</p>
         * <ul>
         * <li>TCP_TOTAL indicates the total number of TCP connections.</li>
         * <li>ESTABLISHED indicates the number of TCP connections that are established.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eth0</p>
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
         * <ul>
         * <li>Valid value if the metric value is greater than or equal to the threshold: &gt;=.</li>
         * <li>Valid value if the metric value is less than or equal to the threshold: &lt;=.</li>
         * <li>Valid value if the metric value is greater than the threshold: &gt;.</li>
         * <li>Valid value if the metric value is less than the threshold: &lt;.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=</p>
         * </blockquote>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The name of the metric that is specified in the multi-metric alert rule. Valid values:</p>
         * <ul>
         * <li>CpuUtilization: the CPU utilization of an ECS instance. Unit: %.</li>
         * <li>ConcurrentConnections: the number of current connections to an ECS instance.</li>
         * <li>IntranetTx: the outbound traffic over an internal network. Unit: KB/min.</li>
         * <li>IntranetRx: the inbound traffic over an internal network. Unit: KB/min.</li>
         * <li>VpcInternetTx: the outbound traffic over a VPC. Unit: KB/min.</li>
         * <li>VpcInternetRx: the inbound traffic over a VPC. Unit: KB/min.</li>
         * <li>SystemDiskReadBps: the number of bytes read from the system disk per second.</li>
         * <li>SystemDiskWriteBps: the number of bytes written to the system disk per second.</li>
         * <li>SystemDiskReadOps: the read IOPS of the system disk. Unit: counts/s.</li>
         * <li>SystemDiskWriteOps: the write IOPS of the system disk. Unit: counts/s.</li>
         * <li>CpuUtilizationAgent: the CPU utilization. Unit: %.</li>
         * <li>GpuUtilizationAgent: the GPU utilization. Unit: %.</li>
         * <li>GpuMemoryFreeUtilizationAgent: the idle GPU memory usage. Unit: %.</li>
         * <li>GpuMemoryUtilizationAgent: the GPU memory usage. Unit: %.</li>
         * <li>MemoryUtilization: the memory usage. Unit: %.</li>
         * <li>LoadAverage: the average system load.</li>
         * <li>TcpConnection: the total number of TCP connections.</li>
         * <li>TcpConnection: the number of established TCP connections.</li>
         * <li>PackagesNetOut: the number of packets sent by the internal NIC. Unit: counts/s.</li>
         * <li>PackagesNetIn: the number of packets received by the internal NIC. Unit: counts/s.</li>
         * <li>PackagesNetOut: the number of packets sent by the public NIC. Unit: counts/s.</li>
         * <li>PackagesNetIn: the number of packets received by the public NIC. Unit: counts/s.</li>
         * <li>EciPodCpuUtilization: the CPU utilization. Unit: %.</li>
         * <li>EciPodMemoryUtilization: the memory usage. Unit: %.</li>
         * <li>LoadBalancerRealServerAverageQps: the QPS of an instance.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks of the system monitoring type</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CpuUtilization</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The statistical period of the metric data in the multi-metric alert rule. Unit: seconds. Valid values:</p>
         * <ul>
         * <li>15</li>
         * <li>60</li>
         * <li>120</li>
         * <li>300</li>
         * <li>900</li>
         * </ul>
         * <blockquote>
         * <p> If your scaling group is of the ECS type and the event-triggered task that is associated with your scaling group monitors CloudMonitor metrics, you can set Period to 15. In most cases, the name of a CloudMonitor metric contains Agent.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The method that is used to aggregate statistics about the metrics in the multi-metric alert rule. Valid values:</p>
         * <ul>
         * <li>Average: the average value</li>
         * <li>Minimum: the minimum value</li>
         * <li>Maximum: the maximum value</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold of the metric value. If the threshold is reached the specified number of times within the specified period, a scaling rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>40.0</p>
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
         * 
         * <strong>example:</strong>
         * <p>asg-bp1hvbnmkl10vll5****_f95ce797-dc2e-4bad-9618-14fee7d1****</p>
         */
        @NameInMap("AlarmTaskId")
        public String alarmTaskId;

        /**
         * <p>The operator that is used to compare the metric value and the metric threshold.</p>
         * <ul>
         * <li>Valid value if the metric value is greater than or equal to the threshold: &gt;=.</li>
         * <li>Valid value if the metric value is less than or equal to the threshold: &lt;=.</li>
         * <li>Valid value if the metric value is greater than the threshold: &gt;.</li>
         * <li>Valid value if the metric value is less than the threshold: &lt;.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=</p>
         * </blockquote>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The description of the event-triggered task.</p>
         * 
         * <strong>example:</strong>
         * <p>Test alarm task.</p>
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
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Effective")
        public String effective;

        /**
         * <p>Indicates whether the event-triggered task feature is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The number of consecutive times that the threshold must be reached before a scaling rule is executed. For example, if you set this parameter to 3, the average CPU utilization must reach or exceed 80% three times in a row before a scaling rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <ul>
         * <li><code>&amp;&amp;</code>: An alert is triggered only if all metrics in the multi-metric alert rule meet their trigger conditions. In this case, an alert is triggered only if the results of all trigger conditions that are specified in the multi-metric alert rule are <code>true</code>.</li>
         * <li><code>||</code>: An alert is triggered only if one of the metrics in the multi-metric alert rule meets its trigger condition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&amp;&amp;</p>
         */
        @NameInMap("ExpressionsLogicOperator")
        public String expressionsLogicOperator;

        /**
         * <p>The metric name. Valid values:</p>
         * <ul>
         * <li>CpuUtilization: the CPU utilization of an Elastic Compute Service (ECS) instance. Unit: %.</li>
         * <li>ConcurrentConnections: the number of current connections to an ECS instance.</li>
         * <li>IntranetTx: the outbound traffic over an internal network. Unit: KB/min.</li>
         * <li>IntranetRx: the inbound traffic over an internal network. Unit: KB/min.</li>
         * <li>VpcInternetTx: the outbound traffic over a virtual private cloud (VPC). Unit: KB/min.</li>
         * <li>VpcInternetRx: the inbound traffic over a VPC. Unit: KB/min.</li>
         * <li>SystemDiskReadBps: the number of bytes read from the system disk per second.</li>
         * <li>SystemDiskWriteBps: the number of bytes written to the system disk per second.</li>
         * <li>SystemDiskReadOps: the read IOPS of the system disk. Unit: counts/s.</li>
         * <li>SystemDiskWriteOps: the write IOPS of the system disk. Unit: counts/s.</li>
         * <li>CpuUtilizationAgent: the CPU utilization. Unit: %.</li>
         * <li>GpuUtilizationAgent: the GPU utilization. Unit: %.</li>
         * <li>GpuMemoryFreeUtilizationAgent: the idle GPU memory usage. Unit: %.</li>
         * <li>GpuMemoryUtilizationAgent: the GPU memory usage. Unit: %.</li>
         * <li>MemoryUtilization: the memory usage. Unit: %.</li>
         * <li>LoadAverage: the average system load.</li>
         * <li>TcpConnection: the total number of TCP connections.</li>
         * <li>TcpConnection: the number of established TCP connections.</li>
         * <li>PackagesNetOut: the number of packets sent by the internal NIC. Unit: counts/s.</li>
         * <li>PackagesNetIn: the number of packets received by the internal NIC. Unit: counts/s.</li>
         * <li>PackagesNetOut: the number of packets sent by the public NIC. Unit: counts/s.</li>
         * <li>PackagesNetIn: the number of packets received by the public NIC. Unit: counts/s.</li>
         * <li>EciPodCpuUtilization: the CPU utilization. Unit: %.</li>
         * <li>EciPodMemoryUtilization: the memory usage. Unit: %.</li>
         * <li>LoadBalancerRealServerAverageQps: the queries per second (QPS) of an instance.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks of the system monitoring type</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CpuUtilization</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The metric type. Valid values:</p>
         * <ul>
         * <li>system: system metrics of CloudMonitor</li>
         * <li>custom: custom metrics that are reported to CloudMonitor.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        /**
         * <p>The name of the event-triggered task.</p>
         * 
         * <strong>example:</strong>
         * <p>TestAlarmTask</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The statistical period of the metric data. Unit: seconds. Valid values:</p>
         * <ul>
         * <li>15</li>
         * <li>60</li>
         * <li>120</li>
         * <li>300</li>
         * <li>900</li>
         * </ul>
         * <blockquote>
         * <p> You can set the value of this parameter to 15 Seconds only for scaling groups of the ECS type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The ID of the scaling group to which the event-triggered task is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The status of the event-triggered task. Valid values:</p>
         * <ul>
         * <li>ALARM: The alert condition is met and an alert is triggered.</li>
         * <li>OK: The alert condition is not met.</li>
         * <li>INSUFFICIENT_DATA: Auto Scaling cannot determine whether the alert condition is met due to insufficient data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALARM</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The method that is used to aggregate the metric data. Valid values:</p>
         * <ul>
         * <li>Average: the average value</li>
         * <li>Minimum: the minimum value</li>
         * <li>Maximum: the maximum value</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold of the metric. If the threshold is reached the specified number of times within the statistical period, a scaling rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>80.0</p>
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
