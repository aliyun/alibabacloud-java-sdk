// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyAlarmRequest extends TeaModel {
    /**
     * <p>The list of unique identifiers of the scaling rules associated with the event-triggered task.</p>
     */
    @NameInMap("AlarmActions")
    public java.util.List<String> alarmActions;

    /**
     * <p>The ID of the event-triggered task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1hvbnmkl10vll5****_f95ce797-dc2e-4bad-9618-14fee7d1****</p>
     */
    @NameInMap("AlarmTaskId")
    public String alarmTaskId;

    /**
     * <p>The comparison operator between the statistical value and the threshold of the metric. The comparison operator indicates the relationship in which the statistical value and the threshold can satisfy the condition. Valid values:</p>
     * <ul>
     * <li>The statistical value is greater than or equal to the threshold. Value: <code>&gt;=</code>.</li>
     * <li>The statistical value is less than or equal to the threshold. Value: <code>&lt;=</code>.</li>
     * <li>The statistical value is greater than the threshold. Value: <code>&gt;</code>.</li>
     * <li>The statistical value is less than the threshold. Value: <code>&lt;</code>.</li>
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
    public java.util.List<ModifyAlarmRequestDimensions> dimensions;

    /**
     * <p>Specifies the effective period of the event-triggered task.</p>
     * <p>This parameter follows cron expressions. The default format is <code>X X X X X ?</code>, where:</p>
     * <ul>
     * <li><p>X: a placeholder for a field, which sequentially represents seconds, minutes, hours, day, and month. X can be a specific value or a special character with logical meaning. For more information about the valid values of X, see <a href="https://help.aliyun.com/document_detail/25907.html">Cron expression</a>.</p>
     * </li>
     * <li><p>?: specifies no value.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The value of this parameter is <strong>in the UTC+8 time zone by default</strong>. You can add time zone information <code>TZ=+yy</code> before the cron expression to specify a time zone, where y represents the numeric value of the time zone. For example, <code>TZ=+00 * * 1-2 * * ?</code> indicates that the event-triggered task takes effect between 01:00 and 02:59 every day in the UTC+0 time zone.</p>
     * </blockquote>
     * <p>Examples and descriptions:</p>
     * <ul>
     * <li><p><code>* * * * * ?  </code>: takes effect at all times.</p>
     * </li>
     * <li><p><code>* * 17-18 * * ? </code>: takes effect between 17:00 and 18:59 every day in the UTC+8 time zone.</p>
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
     * <p>The number of times that the threshold expression must be met before the scaling rule is triggered. For example, the average CPU utilization must be greater than or equal to 80% in three consecutive statistical results.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The monitoring metrics of the multi-metric event-triggered task.</p>
     */
    @NameInMap("Expressions")
    public java.util.List<ModifyAlarmRequestExpressions> expressions;

    /**
     * <p>The relationship between multiple monitoring metrics conditions. Valid values:</p>
     * <ul>
     * <li><code>&amp;&amp;</code>: An alert is triggered only when all monitoring metrics meet the alert conditions. An alert is triggered only when all expressions in the multi-metric event-triggered task evaluate to <code>true</code>.</li>
     * <li><code>||</code>: An alert is triggered when any monitoring metric meets the alert condition.</li>
     * </ul>
     * <p>Default value: <code>&amp;&amp;</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>&amp;&amp;</p>
     */
    @NameInMap("ExpressionsLogicOperator")
    public String expressionsLogicOperator;

    /**
     * <p>The ID of the CloudMonitor application group to which the custom metric belongs. This parameter is required only when MetricType is set to custom.</p>
     * 
     * <strong>example:</strong>
     * <p>4055401</p>
     */
    @NameInMap("GroupId")
    public Integer groupId;

    /**
     * <p>The name of the metric. Valid values vary based on the monitoring type of the event-triggered task: </p>
     * <ul>
     * <li><p>If the event-triggered task is of the custom monitoring type (MetricType=custom), valid values are your custom metrics.</p>
     * </li>
     * <li><p>If the event-triggered task is of the system monitoring type (MetricType=system), valid values: </p>
     * <ul>
     * <li><p>CpuUtilization: (ECS) CPU utilization (%).</p>
     * </li>
     * <li><p>IntranetTx: (ECS) outbound traffic over the internal network (KByte/min).</p>
     * </li>
     * <li><p>IntranetRx: (ECS) inbound traffic over the internal network (KByte/min).</p>
     * </li>
     * <li><p>VpcInternetTx: (ECS) outbound traffic over the Internet (KByte/min).</p>
     * </li>
     * <li><p>VpcInternetRx: (ECS) inbound traffic over the Internet (KByte/min).</p>
     * </li>
     * <li><p>SystemDiskReadBps: (ECS) system cloud disk read BPS (Byte/s).</p>
     * </li>
     * <li><p>SystemDiskWriteBps: (ECS) system cloud disk write BPS (Byte/s).</p>
     * </li>
     * <li><p>SystemDiskReadOps: (ECS) system cloud disk read IOPS (count/s).</p>
     * </li>
     * <li><p>SystemDiskWriteOps: (ECS) system cloud disk write IOPS (count/s).</p>
     * </li>
     * <li><p>CpuUtilizationAgent: (Agent) CPU utilization (%).</p>
     * </li>
     * <li><p>GpuMemoryFreeUtilizationAgent: (Agent) GPU memory idle rate (%).</p>
     * </li>
     * <li><p>GpuMemoryUtilizationAgent: (Agent) GPU memory utilization (%).</p>
     * </li>
     * <li><p>MemoryUtilization: (Agent) memory utilization (%).</p>
     * </li>
     * <li><p>LoadAverage: (Agent) average system load.</p>
     * </li>
     * <li><p>TcpConnection: (Agent) total number of TCP connections.</p>
     * </li>
     * <li><p>TcpConnection: (Agent) number of established TCP connections.</p>
     * </li>
     * <li><p>PackagesNetOut: (Agent) number of packets sent by the NIC.</p>
     * </li>
     * <li><p>PackagesNetIn: (Agent) number of packets received by the NIC.</p>
     * </li>
     * <li><p>EciPodCpuUtilization: CPU utilization (%).</p>
     * </li>
     * <li><p>EciPodMemoryUtilization: memory utilization (%).</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks for system monitoring</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>MemoryUtilization</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The type of the metric. Valid values:</p>
     * <ul>
     * <li>system: uses CloudMonitor system metrics.</li>
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
     * <p>alarmtask****</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The statistical period for the metric data, in seconds. Valid values:</p>
     * <ul>
     * <li><ol start="15">
     * <li></li>
     * </ol>
     * </li>
     * <li><ol start="60">
     * <li></li>
     * </ol>
     * </li>
     * <li><ol start="120">
     * <li></li>
     * </ol>
     * </li>
     * <li><ol start="300">
     * <li></li>
     * </ol>
     * </li>
     * <li><ol start="900">
     * <li></li>
     * </ol>
     * </li>
     * </ul>
     * <blockquote>
     * <p>A statistical period of 15 seconds is applicable only to metrics collected by the CloudMonitor agent (metrics that start with Agent) when monitoring ECS-type scaling groups. For all other metrics, the statistical period can be set to 60, 120, 300, or 900 seconds.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The region ID of the event-triggered task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The method used to aggregate the metric data. Valid values:</p>
     * <ul>
     * <li>Average: average value.</li>
     * <li>Minimum: minimum value.</li>
     * <li>Maximum: maximum value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Average</p>
     */
    @NameInMap("Statistics")
    public String statistics;

    /**
     * <p>The threshold of the monitoring metrics in a multi-metric event-triggered task. The scaling rule is executed when the threshold expression is met the specified number of times.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Threshold")
    public Float threshold;

    public static ModifyAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAlarmRequest self = new ModifyAlarmRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAlarmRequest setAlarmActions(java.util.List<String> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }
    public java.util.List<String> getAlarmActions() {
        return this.alarmActions;
    }

    public ModifyAlarmRequest setAlarmTaskId(String alarmTaskId) {
        this.alarmTaskId = alarmTaskId;
        return this;
    }
    public String getAlarmTaskId() {
        return this.alarmTaskId;
    }

    public ModifyAlarmRequest setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public ModifyAlarmRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAlarmRequest setDimensions(java.util.List<ModifyAlarmRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<ModifyAlarmRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public ModifyAlarmRequest setEffective(String effective) {
        this.effective = effective;
        return this;
    }
    public String getEffective() {
        return this.effective;
    }

    public ModifyAlarmRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public ModifyAlarmRequest setExpressions(java.util.List<ModifyAlarmRequestExpressions> expressions) {
        this.expressions = expressions;
        return this;
    }
    public java.util.List<ModifyAlarmRequestExpressions> getExpressions() {
        return this.expressions;
    }

    public ModifyAlarmRequest setExpressionsLogicOperator(String expressionsLogicOperator) {
        this.expressionsLogicOperator = expressionsLogicOperator;
        return this;
    }
    public String getExpressionsLogicOperator() {
        return this.expressionsLogicOperator;
    }

    public ModifyAlarmRequest setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }
    public Integer getGroupId() {
        return this.groupId;
    }

    public ModifyAlarmRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public ModifyAlarmRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public ModifyAlarmRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyAlarmRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAlarmRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public ModifyAlarmRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAlarmRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAlarmRequest setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
    }

    public ModifyAlarmRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public static class ModifyAlarmRequestDimensions extends TeaModel {
        /**
         * <p>The key of the dimension information associated with the metric. Valid values vary based on the monitoring type of the event-triggered node:</p>
         * <ul>
         * <li><p>If the event-triggered task is of the custom monitoring type (MetricType=custom), valid values are not restricted. You can specify custom values.</p>
         * </li>
         * <li><p>If the event-triggered task is of the system monitoring type (MetricType=system), valid values:</p>
         * <ul>
         * <li>user_id: your account ID.</li>
         * <li>scaling_group: the scaling group to be monitored.</li>
         * <li>device: the type of the network interface controller (NIC) device.</li>
         * <li>state: the state of the TCP connection.</li>
         * <li>rulePool: the server group specified for the ALB QPS monitoring metrics.</li>
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
         * <p>The value of the dimension information associated with the metric. Valid values are determined by Dimension.N.DimensionKey:</p>
         * <ul>
         * <li><p>If Dimension.N.DimensionKey is set to a custom value, which means the event-triggered task is of the custom monitoring type (MetricType=custom), valid values are not restricted. You can specify custom values.</p>
         * </li>
         * <li><p>If Dimension.N.DimensionKey is set to a system-specified value, which means the event-triggered task is of the system monitoring type (MetricType=system), valid values:</p>
         * <ul>
         * <li><p>user_id: automatically populated by the system.</p>
         * </li>
         * <li><p>scaling_group: automatically populated by the system.</p>
         * </li>
         * <li><p>device:</p>
         * <ul>
         * <li>eth0: for classic network instances, eth0 represents the internal NIC. For VPC-connected instances, only the eth0 NIC exists.</li>
         * <li>eth1: for classic network instances, eth1 represents the public NIC.</li>
         * </ul>
         * </li>
         * <li><p>state:</p>
         * <ul>
         * <li>TCP_TOTAL: the total number of TCP connections.</li>
         * <li>ESTABLISHED: the number of established TCP connections.</li>
         * </ul>
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

        public static ModifyAlarmRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            ModifyAlarmRequestDimensions self = new ModifyAlarmRequestDimensions();
            return TeaModel.build(map, self);
        }

        public ModifyAlarmRequestDimensions setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public ModifyAlarmRequestDimensions setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

    }

    public static class ModifyAlarmRequestExpressions extends TeaModel {
        /**
         * <p>The comparison operator between the statistical value and the threshold of the metric. The comparison operator indicates the relationship in which the statistical value and the threshold can satisfy the condition. Valid values:</p>
         * <ul>
         * <li>The statistical value is greater than or equal to the threshold. Value: <code>&gt;=</code>.</li>
         * <li>The statistical value is less than or equal to the threshold. Value: <code>&lt;=</code>.</li>
         * <li>The statistical value is greater than the threshold. Value: <code>&gt;</code>.</li>
         * <li>The statistical value is less than the threshold. Value: <code>&lt;</code>.</li>
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
         * <p>The name of the monitoring metric in the multi-metric event-triggered node. Valid values vary based on the monitoring type of the event-triggered task: </p>
         * <ul>
         * <li><p>If the event-triggered task is of the custom monitoring type (MetricType=custom), valid values are your custom monitoring metrics.</p>
         * </li>
         * <li><p>If the event-triggered task is of the system monitoring type (MetricType=system), valid values: </p>
         * <ul>
         * <li><p>CpuUtilization: (ECS) CPU utilization (%).</p>
         * </li>
         * <li><p>IntranetTx: (ECS) outbound traffic over the internal network (KByte/min).</p>
         * </li>
         * <li><p>IntranetRx: (ECS) inbound traffic over the internal network (KByte/min).</p>
         * </li>
         * <li><p>VpcInternetTx: (ECS) outbound traffic over the Internet (KByte/min).</p>
         * </li>
         * <li><p>VpcInternetRx: (ECS) inbound traffic over the Internet (KByte/min).</p>
         * </li>
         * <li><p>SystemDiskReadBps: (ECS) system cloud disk read BPS (Byte/s).</p>
         * </li>
         * <li><p>SystemDiskWriteBps: (ECS) system cloud disk write BPS (Byte/s).</p>
         * </li>
         * <li><p>SystemDiskReadOps: (ECS) system cloud disk read IOPS (count/s).</p>
         * </li>
         * <li><p>SystemDiskWriteOps: (ECS) system cloud disk write IOPS (count/s).</p>
         * </li>
         * <li><p>CpuUtilizationAgent: (Agent) CPU utilization (%).</p>
         * </li>
         * <li><p>GpuUtilizationAgent: (Agent) GPU utilization (%).</p>
         * </li>
         * <li><p>GpuMemoryFreeUtilizationAgent: (Agent) GPU memory idle rate (%).</p>
         * </li>
         * <li><p>GpuMemoryUtilizationAgent: (Agent) GPU memory utilization (%).</p>
         * </li>
         * <li><p>MemoryUtilization: (Agent) memory utilization (%).</p>
         * </li>
         * <li><p>LoadAverage: (Agent) average system load.</p>
         * </li>
         * <li><p>TcpConnection: (Agent) total number of TCP connections.</p>
         * </li>
         * <li><p>TcpConnection: (Agent) number of established TCP connections.</p>
         * </li>
         * <li><p>PackagesNetOut: (Agent) number of packets sent by the network interface controller (NIC).</p>
         * </li>
         * <li><p>PackagesNetIn: (Agent) number of packets received by the network interface controller (NIC).</p>
         * </li>
         * <li><p>EciPodCpuUtilization: CPU utilization (%).</p>
         * </li>
         * <li><p>EciPodMemoryUtilization: memory utilization (%).</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks for system monitoring</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CpuUtilization</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The statistical period for the metric data in the multi-metric event-triggered task, in seconds. Valid values:</p>
         * <ul>
         * <li><ol start="15">
         * <li></li>
         * </ol>
         * </li>
         * <li><ol start="60">
         * <li></li>
         * </ol>
         * </li>
         * <li><ol start="120">
         * <li></li>
         * </ol>
         * </li>
         * <li><ol start="300">
         * <li></li>
         * </ol>
         * </li>
         * <li><ol start="900">
         * <li></li>
         * </ol>
         * </li>
         * </ul>
         * <blockquote>
         * <p>A statistical period of 15 seconds is applicable only to metrics collected by the CloudMonitor agent (metrics that start with Agent) when monitoring ECS-type scaling groups. For all other metrics, the statistical period can be set to 60, 120, 300, or 900 seconds.</p>
         * </blockquote>
         * <p>Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The method used to aggregate the metric data in the multi-metric event-triggered task. Valid values:</p>
         * <ul>
         * <li>Average: average value.</li>
         * <li>Minimum: minimum value.</li>
         * <li>Maximum: maximum value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold of the monitoring metrics in a multi-metric event-triggered task. The scaling rule is executed when the threshold expression is met the specified number of times.</p>
         * 
         * <strong>example:</strong>
         * <p>40.0</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        public static ModifyAlarmRequestExpressions build(java.util.Map<String, ?> map) throws Exception {
            ModifyAlarmRequestExpressions self = new ModifyAlarmRequestExpressions();
            return TeaModel.build(map, self);
        }

        public ModifyAlarmRequestExpressions setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public ModifyAlarmRequestExpressions setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ModifyAlarmRequestExpressions setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public ModifyAlarmRequestExpressions setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public ModifyAlarmRequestExpressions setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
