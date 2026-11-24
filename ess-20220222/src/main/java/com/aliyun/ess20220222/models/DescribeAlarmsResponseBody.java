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
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
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
         * <p>The key of the dimension associated with the metric. Valid values:</p>
         * <ul>
         * <li>user_id: the ID of your account.</li>
         * <li>scaling_group: the monitored scaling group.</li>
         * <li>device: the type of the NIC device.</li>
         * <li>state: the state of the TCP connection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>device</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The value of the dimension associated with the metric. The valid values vary based on the dimension key.</p>
         * <ul>
         * <li><p><code>user_id</code>: automatically populated by the system.</p>
         * </li>
         * <li><p><code>scaling_group</code>: automatically populated by the system.</p>
         * </li>
         * <li><p>Valid values for <code>device</code>:</p>
         * <ul>
         * <li>eth0: For classic network instances, eth0 represents the internal NIC. For VPC-connected instances, only the eth0 NIC exists.</li>
         * <li>eth1: For classic network instances, eth1 represents the public NIC.</li>
         * </ul>
         * </li>
         * <li><p>Valid values for <code>state</code>:</p>
         * <ul>
         * <li>TCP_TOTAL: the total number of TCP connections.</li>
         * <li>ESTABLISHED: the number of established TCP connections.</li>
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
         * <p>The comparison operator used to compare the metric value with the threshold in the multi-metric alert rule. Valid values:</p>
         * <ul>
         * <li><blockquote>
         * <p>=: The metric value is greater than or equal to the threshold.</p>
         * </blockquote>
         * </li>
         * <li>&lt;=: The metric value is less than or equal to the threshold.</li>
         * <li><blockquote>
         * <p>: The metric value is greater than the threshold.</p>
         * </blockquote>
         * </li>
         * <li>&lt;: The metric value is less than the threshold.</li>
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
         * <p>The name of the monitoring metrics in the multi-metric alert rule. Valid values: </p>
         * <ul>
         * <li>CpuUtilization: the CPU utilization of an ECS instance. Unit: %.</li>
         * <li>ConcurrentConnections: the number of concurrent connections to an ECS instance.</li>
         * <li>IntranetTx: the outbound internal network traffic of an ECS instance. Unit: Kbit/min.</li>
         * <li>IntranetRx: the inbound internal network traffic of an ECS instance. Unit: Kbit/min.</li>
         * <li>VpcInternetTx: the outbound Internet traffic of an ECS instance. Unit: Kbit/min.</li>
         * <li>VpcInternetRx: the inbound Internet traffic of an ECS instance. Unit: Kbit/min.</li>
         * <li>SystemDiskReadBps: the number of bytes read from the system cloud disk per second. Unit: Byte/s.</li>
         * <li>SystemDiskWriteBps: the number of bytes written to the system cloud disk per second. Unit: Byte/s.</li>
         * <li>SystemDiskReadOps: the number of read operations on the system cloud disk per second. Unit: IOPS.</li>
         * <li>SystemDiskWriteOps: the number of write operations on the system cloud disk per second. Unit: IOPS.</li>
         * <li>CpuUtilizationAgent: the CPU utilization collected by the CloudMonitor agent. Unit: %.</li>
         * <li>GpuUtilizationAgent: the GPU utilization collected by the CloudMonitor agent. Unit: %.</li>
         * <li>GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory collected by the CloudMonitor agent. Unit: %.</li>
         * <li>GpuMemoryUtilizationAgent: the GPU memory utilization collected by the CloudMonitor agent. Unit: %.</li>
         * <li>MemoryUtilization: the memory utilization collected by the CloudMonitor agent. Unit: %.</li>
         * <li>LoadAverage: the average system load collected by the CloudMonitor agent.</li>
         * <li>TcpConnection: the total number of TCP connections collected by the CloudMonitor agent.</li>
         * <li>TcpConnection: the number of established TCP connections collected by the CloudMonitor agent.</li>
         * <li>PackagesNetOut: the number of packets sent by the internal network interface controller (NIC) per second collected by the CloudMonitor agent. Unit: packets/s.</li>
         * <li>PackagesNetIn: the number of packets received by the internal network interface controller (NIC) per second collected by the CloudMonitor agent. Unit: packets/s.</li>
         * <li>PackagesNetOut: the number of packets sent by the public network interface controller (NIC) per second collected by the CloudMonitor agent. Unit: packets/s.</li>
         * <li>PackagesNetIn: the number of packets received by the public network interface controller (NIC) per second collected by the CloudMonitor agent. Unit: packets/s.</li>
         * <li>EciPodCpuUtilization: the CPU utilization. Unit: %.</li>
         * <li>EciPodMemoryUtilization: the memory utilization. Unit: %.</li>
         * <li>LoadBalancerRealServerAverageQps: the average QPS per backend server in an ALB server group. Unit: queries/s.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered nodes for system monitoring</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CpuUtilization</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The period at which metric data is collected in the multi-metric alert rule. Unit: seconds. Valid values:</p>
         * <ul>
         * <li>15</li>
         * <li>60</li>
         * <li>120</li>
         * <li>300</li>
         * <li>900</li>
         * </ul>
         * <blockquote>
         * <p>A statistical period of 15 seconds is supported only when you monitor a scaling group that contains ECS instances and use metrics collected by the CloudMonitor agent (metrics whose names start with Agent).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The statistical method used for metric data in the multi-metric alert rule. Valid values:</p>
         * <ul>
         * <li>Average: the average value.</li>
         * <li>Minimum: the minimum value.</li>
         * <li>Maximum: the maximum value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold of the monitoring metrics in the multi-metric alert rule. The scaling rule is triggered when the threshold expression is met for the specified number of times.</p>
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

    public static class DescribeAlarmsResponseBodyAlarmListHybridMetricsDimensions extends TeaModel {
        /**
         * <p>The key of the metric dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>queue</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The value of the metric dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>testQueue</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        public static DescribeAlarmsResponseBodyAlarmListHybridMetricsDimensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyAlarmListHybridMetricsDimensions self = new DescribeAlarmsResponseBodyAlarmListHybridMetricsDimensions();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyAlarmListHybridMetricsDimensions setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public DescribeAlarmsResponseBodyAlarmListHybridMetricsDimensions setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

    }

    public static class DescribeAlarmsResponseBodyAlarmListHybridMetrics extends TeaModel {
        /**
         * <p>The dimensions of the metric. This is used to specify the resources monitored by the metric.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<DescribeAlarmsResponseBodyAlarmListHybridMetricsDimensions> dimensions;

        /**
         * <p>The metric calculation expression for multiple Hybrid Cloud Monitoring metrics. The calculation result of the expression is used to trigger scaling activities. The calculation expression must comply with the Reverse Polish Notation (RPN) specification, and only the <code>+</code>, <code>-</code>, <code>*</code>, and <code>/</code> operators are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>(a+b)/2</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The reference ID of the metric in the metric calculation expression.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the monitoring metrics in the Hybrid Cloud Monitoring metrics repository.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunSmq_NumberOfMessagesVisible</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The statistical method of the metric. Valid values:</p>
         * <ul>
         * <li>Average: the average value of all data points in the specified period.</li>
         * <li>Minimum: the minimum value of all data points in the specified period.</li>
         * <li>Maximum: the maximum value of all data points in the specified period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistic")
        public String statistic;

        public static DescribeAlarmsResponseBodyAlarmListHybridMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyAlarmListHybridMetrics self = new DescribeAlarmsResponseBodyAlarmListHybridMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyAlarmListHybridMetrics setDimensions(java.util.List<DescribeAlarmsResponseBodyAlarmListHybridMetricsDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<DescribeAlarmsResponseBodyAlarmListHybridMetricsDimensions> getDimensions() {
            return this.dimensions;
        }

        public DescribeAlarmsResponseBodyAlarmListHybridMetrics setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DescribeAlarmsResponseBodyAlarmListHybridMetrics setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeAlarmsResponseBodyAlarmListHybridMetrics setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAlarmsResponseBodyAlarmListHybridMetrics setStatistic(String statistic) {
            this.statistic = statistic;
            return this;
        }
        public String getStatistic() {
            return this.statistic;
        }

    }

    public static class DescribeAlarmsResponseBodyAlarmList extends TeaModel {
        /**
         * <p>The list of unique identifiers of the scaling rules associated with the event-triggered task.</p>
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
         * <p>The comparison operator used to compare the metric value with the threshold. Valid values:</p>
         * <ul>
         * <li><blockquote>
         * <p>=: The metric value is greater than or equal to the threshold.</p>
         * </blockquote>
         * </li>
         * <li>&lt;=: The metric value is less than or equal to the threshold.</li>
         * <li><blockquote>
         * <p>: The metric value is greater than the threshold.</p>
         * </blockquote>
         * </li>
         * <li>&lt;: The metric value is less than the threshold.</li>
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
         * <p>The dimension information associated with the metric.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<DescribeAlarmsResponseBodyAlarmListDimensions> dimensions;

        /**
         * <p>The effective period of the event-triggered node.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li><ul>
         * <li><ul>
         * <li><ul>
         * <li><ul>
         * <li>?</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         */
        @NameInMap("Effective")
        public String effective;

        /**
         * <p>Indicates whether the event-triggered task is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The number of times that the threshold condition must be met before the scaling rule is triggered. For example, if this parameter is set to 3, the scaling rule is triggered only when the average CPU utilization is greater than or equal to 80% for three consecutive times.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        /**
         * <p>The information about the multi-metric alert rule.</p>
         */
        @NameInMap("Expressions")
        public java.util.List<DescribeAlarmsResponseBodyAlarmListExpressions> expressions;

        /**
         * <p>The logical operator that specifies the relationship among multiple monitoring alert conditions. Valid values:</p>
         * <ul>
         * <li><code>&amp;&amp;</code>: An alert is triggered only when all monitoring metrics meet the alert conditions. That is, an alert is triggered only when all expressions in the multi-metric alert rule evaluate to <code>true</code>.</li>
         * <li><code>||</code>: An alert is triggered when any of the monitoring metrics meets the alert condition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&amp;&amp;</p>
         */
        @NameInMap("ExpressionsLogicOperator")
        public String expressionsLogicOperator;

        /**
         * <p>The monitoring metrics settings of Hybrid Cloud Monitoring. For more information about how to configure the settings, see <a href="https://help.aliyun.com/document_detail/2852162.html">Use formulas to customize target tracking scaling rules</a>.</p>
         */
        @NameInMap("HybridMetrics")
        public java.util.List<DescribeAlarmsResponseBodyAlarmListHybridMetrics> hybridMetrics;

        /**
         * <p>The ID of the Hybrid Cloud Monitoring metrics repository.</p>
         * <p>For more information about how to manage metrics repositories, see <a href="https://help.aliyun.com/document_detail/217606.html">Manage metrics repositories</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-test</p>
         */
        @NameInMap("HybridMonitorNamespace")
        public String hybridMonitorNamespace;

        /**
         * <p>The name of the metric. Valid values: </p>
         * <ul>
         * <li>CpuUtilization: the CPU utilization of an ECS instance. Unit: %.</li>
         * <li>ConcurrentConnections: the number of concurrent connections to an ECS instance.</li>
         * <li>IntranetTx: the outbound internal traffic of an ECS instance. Unit: Kbit/min.</li>
         * <li>IntranetRx: the inbound internal traffic of an ECS instance. Unit: Kbit/min.</li>
         * <li>VpcInternetTx: the outbound Internet traffic of an ECS instance. Unit: Kbit/min.</li>
         * <li>VpcInternetRx: the inbound Internet traffic of an ECS instance. Unit: Kbit/min.</li>
         * <li>SystemDiskReadBps: the number of bytes read from the system cloud disk per second. Unit: Byte/s.</li>
         * <li>SystemDiskWriteBps: the number of bytes written to the system cloud disk per second. Unit: Byte/s.</li>
         * <li>SystemDiskReadOps: the number of read operations on the system cloud disk per second. Unit: IOPS.</li>
         * <li>SystemDiskWriteOps: the number of write operations on the system cloud disk per second. Unit: IOPS.</li>
         * <li>CpuUtilizationAgent: the CPU utilization collected by the CloudMonitor agent. Unit: %.</li>
         * <li>GpuUtilizationAgent: the GPU utilization collected by the CloudMonitor agent. Unit: %.</li>
         * <li>GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory collected by the CloudMonitor agent. Unit: %.</li>
         * <li>GpuMemoryUtilizationAgent: the GPU memory utilization collected by the CloudMonitor agent. Unit: %.</li>
         * <li>MemoryUtilization: the memory utilization collected by the CloudMonitor agent. Unit: %.</li>
         * <li>LoadAverage: the average system load collected by the CloudMonitor agent.</li>
         * <li>TcpConnection: the total number of TCP connections collected by the CloudMonitor agent.</li>
         * <li>TcpConnection: the number of established TCP connections collected by the CloudMonitor agent.</li>
         * <li>PackagesNetOut: the number of packets sent by the internal NIC per second collected by the CloudMonitor agent. Unit: packets/s.</li>
         * <li>PackagesNetIn: the number of packets received by the internal NIC per second collected by the CloudMonitor agent. Unit: packets/s.</li>
         * <li>PackagesNetOut: the number of packets sent by the public NIC per second collected by the CloudMonitor agent. Unit: packets/s.</li>
         * <li>PackagesNetIn: the number of packets received by the public NIC per second collected by the CloudMonitor agent. Unit: packets/s.</li>
         * <li>EciPodCpuUtilization: the CPU utilization. Unit: %.</li>
         * <li>EciPodMemoryUtilization: the memory utilization. Unit: %.</li>
         * <li>LoadBalancerRealServerAverageQps: the average QPS per backend server in an ALB server group. Unit: queries/s.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks for system monitoring</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CpuUtilization</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The type of the metric. Valid values:</p>
         * <ul>
         * <li>system: system metrics of CloudMonitor.</li>
         * <li>custom: custom metrics reported to CloudMonitor.</li>
         * <li>hybrid: metrics of Hybrid Cloud Monitoring.</li>
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
         * <p>The period at which metric data is collected. Unit: seconds. Valid values:</p>
         * <ul>
         * <li>15</li>
         * <li>60</li>
         * <li>120</li>
         * <li>300</li>
         * <li>900</li>
         * </ul>
         * <blockquote>
         * <p>A statistical period of 15 seconds is supported only for scaling groups that contain ECS instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The PromQL query statement for Hybrid Cloud Monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>(avg(last_over_time(AliyunMnsnew_ActiveMessages{region=\&quot;cn-hangzhou\&quot;,userId=\&quot;123456****\&quot;,queue=\&quot;testQueue\&quot;}[900s])) by (userId))/(avg(last_over_time(AliyunEss_RunningInstanceCount{instanceId=\&quot;asg-bp1****\&quot;}[900s])) by (userId) != 0)</p>
         */
        @NameInMap("PromQL")
        public String promQL;

        /**
         * <p>The ID of the scaling group with which the event-triggered task is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The state of the event-triggered task. Valid values:</p>
         * <ul>
         * <li>ALARM: Alerting. The alert condition is met.</li>
         * <li>OK: Normal. The alert condition is not met.</li>
         * <li>INSUFFICIENT_DATA: Insufficient data. The data is insufficient to determine whether the alert condition is met.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALARM</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The statistical method used for metric data. Valid values:</p>
         * <ul>
         * <li>Average: the average value.</li>
         * <li>Minimum: the minimum value.</li>
         * <li>Maximum: the maximum value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold of the monitoring metrics. The scaling rule is triggered when the threshold expression is met for the specified number of times.</p>
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

        public DescribeAlarmsResponseBodyAlarmList setHybridMetrics(java.util.List<DescribeAlarmsResponseBodyAlarmListHybridMetrics> hybridMetrics) {
            this.hybridMetrics = hybridMetrics;
            return this;
        }
        public java.util.List<DescribeAlarmsResponseBodyAlarmListHybridMetrics> getHybridMetrics() {
            return this.hybridMetrics;
        }

        public DescribeAlarmsResponseBodyAlarmList setHybridMonitorNamespace(String hybridMonitorNamespace) {
            this.hybridMonitorNamespace = hybridMonitorNamespace;
            return this;
        }
        public String getHybridMonitorNamespace() {
            return this.hybridMonitorNamespace;
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

        public DescribeAlarmsResponseBodyAlarmList setPromQL(String promQL) {
            this.promQL = promQL;
            return this;
        }
        public String getPromQL() {
            return this.promQL;
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
