// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateAlarmRequest extends TeaModel {
    /**
     * <p>The list of unique identifiers of the scaling rules associated with the event-triggered task.</p>
     */
    @NameInMap("AlarmActions")
    public java.util.List<String> alarmActions;

    /**
     * <p>The comparison operator used to compare the aggregated metric value with the threshold. This operator specifies the condition under which the threshold is met. Valid values:</p>
     * <ul>
     * <li><blockquote>
     * <p>=: The aggregated metric value is greater than or equal to the threshold.</p>
     * </blockquote>
     * </li>
     * <li>&lt;=: The aggregated metric value is less than or equal to the threshold.</li>
     * <li><blockquote>
     * <p>: The aggregated metric value is greater than the threshold.</p>
     * </blockquote>
     * </li>
     * <li>&lt;: The aggregated metric value is less than the threshold.</li>
     * </ul>
     * <p>Default value: &gt;=.</p>
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
    public java.util.List<CreateAlarmRequestDimensions> dimensions;

    /**
     * <p>Specifies the effective period of the event-triggered task. By default, the task takes effect at all times.</p>
     * <p>This parameter follows the cron expression format. The default format is <code>X X X X X ?</code>, which is described as follows:</p>
     * <ul>
     * <li><p>X: a placeholder for a field, representing seconds, minutes, hours, day of month, and month in sequence. X can be a specific value or a special character with logical meaning. For more information about the valid values of X, see <a href="https://help.aliyun.com/document_detail/25907.html">Cron expressions</a>.</p>
     * </li>
     * <li><p>?: indicates that no value is specified.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The specified value of this parameter <strong>defaults to the UTC+8 time zone</strong>. You can add the time zone information <code>TZ=+yy</code> before the cron expression to specify a time zone, where y represents the time zone offset. For example, <code>TZ=+00 * * 1-2 * * ?</code> indicates that the event-triggered task takes effect between 01:00 and 02:59 every day in the UTC+0 time zone.</p>
     * </blockquote>
     * <p>Examples and their meanings:</p>
     * <ul>
     * <li><p><code>* * * * * ?</code>: takes effect at all times.</p>
     * </li>
     * <li><p><code>* * 17-18 * * ?</code>: takes effect between 17:00 and 18:59 every day in the UTC+8 time zone.</p>
     * </li>
     * <li><p><code>TZ=+00 * * 1-2 * * ?</code>: takes effect between 01:00 and 02:59 every day in the UTC+0 time zone.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TZ=+00 * * 1-2 * * ?</p>
     */
    @NameInMap("Effective")
    public String effective;

    /**
     * <p>The number of times that the threshold expression must be met to trigger a scaling rule. For example, if this parameter is set to 3, the scaling rule is triggered when the average CPU utilization is greater than or equal to 80% for three consecutive times.</p>
     * <p>Default value: 3.</p>
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
    public java.util.List<CreateAlarmRequestExpressions> expressions;

    /**
     * <p>The logical operator between multiple metric alert conditions. Valid values:</p>
     * <ul>
     * <li><code>&amp;&amp;</code>: An alert is triggered only when all monitoring metrics meet the alert conditions. That is, an alert is triggered only when all expressions in the multi-metric alert rule evaluate to <code>true</code>.</li>
     * <li><code>||</code>: An alert is triggered if any one of the metrics meets the alert condition.</li>
     * </ul>
     * <p>Default value: <code>&amp;&amp;</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>&amp;&amp;</p>
     */
    @NameInMap("ExpressionsLogicOperator")
    public String expressionsLogicOperator;

    /**
     * <p>The ID of the CloudMonitor application group to which the custom metric belongs. This parameter is required only when the metric type is custom.</p>
     * 
     * <strong>example:</strong>
     * <p>4055401</p>
     */
    @NameInMap("GroupId")
    public Integer groupId;

    /**
     * <p>The name of the metric. The valid values vary based on the monitoring type of the event-triggered task:</p>
     * <ul>
     * <li><p>If the event-triggered task is of the custom monitoring type (MetricType=custom), the valid values are your custom metrics.</p>
     * </li>
     * <li><p>If the event-triggered task is of the system monitoring type (MetricType=system), valid values: </p>
     * <ul>
     * <li><p>CpuUtilization: the CPU utilization of an ECS instance (%).</p>
     * </li>
     * <li><p>ConcurrentConnections: the number of concurrent connections to an ECS instance.</p>
     * </li>
     * <li><p>IntranetTx: the outbound internal network traffic of an ECS instance (Kb/min).</p>
     * </li>
     * <li><p>IntranetRx: the inbound internal network traffic of an ECS instance (Kb/min).</p>
     * </li>
     * <li><p>VpcInternetTx: the outbound Internet traffic of an ECS instance (Kb/min).</p>
     * </li>
     * <li><p>VpcInternetRx: the inbound Internet traffic of an ECS instance (Kb/min).</p>
     * </li>
     * <li><p>SystemDiskReadBps: the read BPS of the system cloud disk (Byte/s).</p>
     * </li>
     * <li><p>SystemDiskWriteBps: the write BPS of the system cloud disk (Byte/s).</p>
     * </li>
     * <li><p>SystemDiskReadOps: the read IOPS of the system cloud disk (operations/s).</p>
     * </li>
     * <li><p>SystemDiskWriteOps: the write IOPS of the system cloud disk (operations/s).</p>
     * </li>
     * <li><p>CpuUtilizationAgent: the CPU utilization monitored by the agent (%).</p>
     * </li>
     * <li><p>GpuUtilizationAgent: the GPU utilization monitored by the agent (%).</p>
     * </li>
     * <li><p>GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory monitored by the agent (%).</p>
     * </li>
     * <li><p>GpuMemoryUtilizationAgent: the GPU memory utilization monitored by the agent (%).</p>
     * </li>
     * <li><p>MemoryUtilization: the memory utilization monitored by the agent (%).</p>
     * </li>
     * <li><p>LoadAverage: the average system load monitored by the agent.</p>
     * </li>
     * <li><p>TcpConnection: the total number of TCP connections monitored by the agent.</p>
     * </li>
     * <li><p>TcpConnection: the number of established TCP connections monitored by the agent.</p>
     * </li>
     * <li><p>PackagesNetOut: the number of packets sent by the internal NIC per second monitored by the agent (packets/s).</p>
     * </li>
     * <li><p>PackagesNetIn: the number of packets received by the internal NIC per second monitored by the agent (packets/s).</p>
     * </li>
     * <li><p>PackagesNetOut: the number of packets sent by the public NIC per second monitored by the agent (packets/s).</p>
     * </li>
     * <li><p>PackagesNetIn: the number of packets received by the public NIC per second monitored by the agent (packets/s).</p>
     * </li>
     * <li><p>EciPodCpuUtilization: the CPU utilization (%).</p>
     * </li>
     * <li><p>EciPodMemoryUtilization: the memory utilization (%).</p>
     * </li>
     * <li><p>LoadBalancerRealServerAverageQps: the average QPS per backend server in an ALB server group (queries/s).</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">System monitoring event-triggered tasks</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CpuUtilization</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The type of the metric. Valid values:</p>
     * <ul>
     * <li>system: uses system metrics of CloudMonitor.</li>
     * <li>custom: uses custom metrics reported to CloudMonitor.</li>
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

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The epoch for aggregating monitoring metric data. Unit: seconds. Valid values:</p>
     * <ul>
     * <li>15</li>
     * <li>60</li>
     * <li>120</li>
     * <li>300</li>
     * <li>900</li>
     * </ul>
     * <blockquote>
     * <p>Only scaling groups of the ECS instance type support a 15-second statistical period.</p>
     * </blockquote>
     * <p>Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The region ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group associated with the event-triggered task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp18p2yfxow2dloq****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The method for aggregating metric data. Valid values:</p>
     * <ul>
     * <li>Average: the average value.</li>
     * <li>Minimum: the minimum value.</li>
     * <li>Maximum: the maximum value.</li>
     * </ul>
     * <p>Default value: Average.</p>
     * 
     * <strong>example:</strong>
     * <p>Average</p>
     */
    @NameInMap("Statistics")
    public String statistics;

    /**
     * <p>The threshold of the monitoring metrics. When the monitoring threshold expression is met for a specified number of times, it triggers the execution of a scaling rule.</p>
     * 
     * <strong>example:</strong>
     * <p>80.0</p>
     */
    @NameInMap("Threshold")
    public Float threshold;

    public static CreateAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlarmRequest self = new CreateAlarmRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlarmRequest setAlarmActions(java.util.List<String> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }
    public java.util.List<String> getAlarmActions() {
        return this.alarmActions;
    }

    public CreateAlarmRequest setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public CreateAlarmRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAlarmRequest setDimensions(java.util.List<CreateAlarmRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<CreateAlarmRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public CreateAlarmRequest setEffective(String effective) {
        this.effective = effective;
        return this;
    }
    public String getEffective() {
        return this.effective;
    }

    public CreateAlarmRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public CreateAlarmRequest setExpressions(java.util.List<CreateAlarmRequestExpressions> expressions) {
        this.expressions = expressions;
        return this;
    }
    public java.util.List<CreateAlarmRequestExpressions> getExpressions() {
        return this.expressions;
    }

    public CreateAlarmRequest setExpressionsLogicOperator(String expressionsLogicOperator) {
        this.expressionsLogicOperator = expressionsLogicOperator;
        return this;
    }
    public String getExpressionsLogicOperator() {
        return this.expressionsLogicOperator;
    }

    public CreateAlarmRequest setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }
    public Integer getGroupId() {
        return this.groupId;
    }

    public CreateAlarmRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public CreateAlarmRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public CreateAlarmRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlarmRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAlarmRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateAlarmRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAlarmRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAlarmRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public CreateAlarmRequest setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
    }

    public CreateAlarmRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public static class CreateAlarmRequestDimensions extends TeaModel {
        /**
         * <p>The key of the dimension information associated with the metric. Valid values vary based on the monitoring type of the event-triggered task:</p>
         * <ul>
         * <li><p>If the event-triggered task is of the custom monitoring type (MetricType=custom), the valid values are not limited and can be specified by you.</p>
         * </li>
         * <li><p>If the event-triggered task is of the system monitoring type (MetricType=system), valid values:</p>
         * <ul>
         * <li>user_id: the ID of your account.</li>
         * <li>scaling_group: the monitored scaling group.</li>
         * <li>device: the type of the network interface controller (NIC) device.</li>
         * <li>state: the state of the TCP connection.</li>
         * <li>rulePool: the ALB server group specified for the QPS monitoring metrics.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>device</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The value of the dimension information associated with the metric. Valid values vary based on Dimensions.DimensionKey:</p>
         * <ul>
         * <li><p>If Dimensions.DimensionKey is custom, which means the event-triggered task is of the custom monitoring type (MetricType=custom), the valid values are not limited and can be specified by you.</p>
         * </li>
         * <li><p>If Dimensions.DimensionKey is within the system-specified range, which means the event-triggered task is of the system monitoring type (MetricType=system), valid values:</p>
         * <ul>
         * <li><p>user_id: automatically populated by the system.</p>
         * </li>
         * <li><p>scaling_group: automatically populated by the system.</p>
         * </li>
         * <li><p>device:</p>
         * <ul>
         * <li><p>eth0: For classic network instances, eth0 represents the internal NIC. For VPC-connected instances, only the eth0 NIC exists.</p>
         * </li>
         * <li><p>eth1: For classic network instances, eth1 represents the public NIC.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>state:</p>
         * <ul>
         * <li><p>TCP_TOTAL: the total number of TCP connections.</p>
         * </li>
         * <li><p>ESTABLISHED: the number of established TCP connections.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>rulePool: the ID of the ALB server group. Example: sgp-xxxxx.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eth0</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        public static CreateAlarmRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            CreateAlarmRequestDimensions self = new CreateAlarmRequestDimensions();
            return TeaModel.build(map, self);
        }

        public CreateAlarmRequestDimensions setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public CreateAlarmRequestDimensions setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

    }

    public static class CreateAlarmRequestExpressions extends TeaModel {
        /**
         * <p>The comparison operator used to compare the aggregated metric value with the threshold for the multi-metric alert rule. This operator specifies the condition under which the threshold is met. Valid values:</p>
         * <ul>
         * <li><blockquote>
         * <p>=: The aggregated metric value is greater than or equal to the threshold.</p>
         * </blockquote>
         * </li>
         * <li>&lt;=: The aggregated metric value is less than or equal to the threshold.</li>
         * <li><blockquote>
         * <p>: The aggregated metric value is greater than the threshold.</p>
         * </blockquote>
         * </li>
         * <li>&lt;: The aggregated metric value is less than the threshold.</li>
         * </ul>
         * <p>Default value: &gt;=.</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=</p>
         * </blockquote>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The name of the monitoring metrics for the multi-metric alert rule. Valid values vary based on the monitoring type of the event-triggered task:</p>
         * <ul>
         * <li><p>If the event-triggered task is of the custom monitoring type (MetricType=custom), the valid values are your custom metrics.</p>
         * </li>
         * <li><p>If the event-triggered task is of the system monitoring type (MetricType=system), valid values: </p>
         * <ul>
         * <li><p>CpuUtilization: the CPU utilization of an ECS instance (%).</p>
         * </li>
         * <li><p>ConcurrentConnections: the number of concurrent connections to an ECS instance.</p>
         * </li>
         * <li><p>IntranetTx: the outbound internal network traffic of an ECS instance (Kb/min).</p>
         * </li>
         * <li><p>IntranetRx: the inbound internal network traffic of an ECS instance (Kb/min).</p>
         * </li>
         * <li><p>VpcInternetTx: the outbound Internet traffic of an ECS instance (Kb/min).</p>
         * </li>
         * <li><p>VpcInternetRx: the inbound Internet traffic of an ECS instance (Kb/min).</p>
         * </li>
         * <li><p>SystemDiskReadBps: the read BPS of the system cloud disk (Byte/s).</p>
         * </li>
         * <li><p>SystemDiskWriteBps: the write BPS of the system cloud disk (Byte/s).</p>
         * </li>
         * <li><p>SystemDiskReadOps: the read IOPS of the system cloud disk (operations/s).</p>
         * </li>
         * <li><p>SystemDiskWriteOps: the write IOPS of the system cloud disk (operations/s).</p>
         * </li>
         * <li><p>CpuUtilizationAgent: the CPU utilization monitored by the agent (%).</p>
         * </li>
         * <li><p>GpuUtilizationAgent: the GPU utilization monitored by the agent (%).</p>
         * </li>
         * <li><p>GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory monitored by the agent (%).</p>
         * </li>
         * <li><p>GpuMemoryUtilizationAgent: the GPU memory utilization monitored by the agent (%).</p>
         * </li>
         * <li><p>MemoryUtilization: the memory utilization monitored by the agent (%).</p>
         * </li>
         * <li><p>LoadAverage: the average system load monitored by the agent.</p>
         * </li>
         * <li><p>TcpConnection: the total number of TCP connections monitored by the agent.</p>
         * </li>
         * <li><p>TcpConnection: the number of established TCP connections monitored by the agent.</p>
         * </li>
         * <li><p>PackagesNetOut: the number of packets sent by the internal network interface controller (NIC) per second monitored by the agent (packets/s).</p>
         * </li>
         * <li><p>PackagesNetIn: the number of packets received by the internal network interface controller (NIC) per second monitored by the agent (packets/s).</p>
         * </li>
         * <li><p>PackagesNetOut: the number of packets sent by the public network interface controller (NIC) per second monitored by the agent (packets/s).</p>
         * </li>
         * <li><p>PackagesNetIn: the number of packets received by the public network interface controller (NIC) per second monitored by the agent (packets/s).</p>
         * </li>
         * <li><p>EciPodCpuUtilization: the CPU utilization (%).</p>
         * </li>
         * <li><p>EciPodMemoryUtilization: the memory utilization (%).</p>
         * </li>
         * <li><p>LoadBalancerRealServerAverageQps: the average QPS per backend server in an ALB server group (queries/s).</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">System monitoring event-triggered tasks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CpuUtilization</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The epoch for aggregating monitoring metric data in the multi-metric alert rule. Unit: seconds. Valid values:</p>
         * <ul>
         * <li>15</li>
         * <li>60</li>
         * <li>120</li>
         * <li>300</li>
         * <li>900</li>
         * </ul>
         * <blockquote>
         * <p>Only scaling groups of the ECS instance type support a 15-second statistical period.</p>
         * </blockquote>
         * <p>Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The method for aggregating metric data in the multi-metric alert rule. Valid values:</p>
         * <ul>
         * <li>Average: the average value.</li>
         * <li>Minimum: the minimum value.</li>
         * <li>Maximum: the maximum value.</li>
         * </ul>
         * <p>Default value: Average.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold of the monitoring metrics in the multi-metric alert rule. When the monitoring threshold expression is met for a specified number of times, it triggers the execution of a scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>40.0</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        public static CreateAlarmRequestExpressions build(java.util.Map<String, ?> map) throws Exception {
            CreateAlarmRequestExpressions self = new CreateAlarmRequestExpressions();
            return TeaModel.build(map, self);
        }

        public CreateAlarmRequestExpressions setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateAlarmRequestExpressions setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public CreateAlarmRequestExpressions setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public CreateAlarmRequestExpressions setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateAlarmRequestExpressions setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
