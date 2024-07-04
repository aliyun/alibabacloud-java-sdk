// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateAlarmRequest extends TeaModel {
    /**
     * <p>The list of unique identifiers of the scaling rules that are associated with the event-triggered task.</p>
     */
    @NameInMap("AlarmActions")
    public java.util.List<String> alarmActions;

    /**
     * <p>The operator that is used to compare the metric value and the threshold. Valid values:</p>
     * <ul>
     * <li>If the metric value is greater than or equal to the threshold, set the value to: &gt;=.</li>
     * <li>If the metric value is less than or equal to the threshold, set the value to: &lt;=.</li>
     * <li>If the metric value is greater than the threshold, set the value to: &gt;.</li>
     * <li>If the metric value is less than the threshold, set the value to: &lt;.</li>
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
     * <p>The metric dimensions.</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<CreateAlarmRequestDimensions> dimensions;

    /**
     * <p>The effective period of the event-triggered task. By default, the event-triggered task is in effect all the time.</p>
     * <p>This parameter follows the cron expression format. The default format is <code>X X X X X ?</code>. In the format:</p>
     * <ul>
     * <li>X: a placeholder for a field, which represents seconds, minutes, hours, days, and months in sequence. X can be a definite value or a special character that has logical meaning. For information about the valid values of X, see <a href="https://help.aliyun.com/document_detail/25907.html">Cron expression</a>.</li>
     * <li>?: No value is specified.</li>
     * </ul>
     * <blockquote>
     * <p>By default, this parameter value is specified in <strong>UTC+8</strong>. You can specify the time zone in the <code>TZ=+yy</code> format before a cron expression. y indicates the time zone. For example, <code>TZ=+00 * * 1-2 * * ?</code> specifies that the event-triggered task is in effect between 01:00 and 02:59 (UTC+0) every day.</p>
     * </blockquote>
     * <p>Sample values:</p>
     * <ul>
     * <li><code>* * * * * ? </code>: The event-triggered task is in effect all the time.</li>
     * <li><code>* * 17-18 * * ? </code>: The event-triggered task is in effect between 17:00 and 18:59 (UTC+8) every day.</li>
     * <li><code>TZ=+00 * * 1-2 * * ?</code>: The event-triggered task is in effect between 01:00 and 02:59 (UTC+0) every day.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TZ=+00 * * 1-2 * * ?</p>
     */
    @NameInMap("Effective")
    public String effective;

    /**
     * <p>The number of times that the threshold must be reached before a scaling rule can be executed. For example, if you set this parameter to 3, the average CPU utilization must reach or exceed 80% three times in a row before a scaling rule is triggered.</p>
     * <p>Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The information about the multi-metric alert rules.</p>
     */
    @NameInMap("Expressions")
    public java.util.List<CreateAlarmRequestExpressions> expressions;

    /**
     * <p>The relationship between the trigger conditions in the multi-metric alert rule. Valid values:</p>
     * <ul>
     * <li><code>&amp;&amp;</code>: An alert is triggered only if all metrics in the multi-metric alert rule meet the trigger conditions. In this case, an alert is triggered only if the results of all trigger conditions that are specified in the multi-metric alert rule are <code>true</code>.</li>
     * <li><code>||</code>: An alert is triggered if one of the metrics in the multi-metric alert rule meets the trigger conditions.</li>
     * </ul>
     * <p>Default value: <code>&amp;&amp;</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>&amp;&amp;</p>
     */
    @NameInMap("ExpressionsLogicOperator")
    public String expressionsLogicOperator;

    /**
     * <p>The ID of the application group to which the custom metric belongs. If you set the MetricType parameter to custom, you must specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>4055401</p>
     */
    @NameInMap("GroupId")
    public Integer groupId;

    /**
     * <p>The metric name. The valid values of this parameter vary based on the metric type.</p>
     * <ul>
     * <li><p>If you set MetricType to custom, the valid values are the metrics that you have.</p>
     * </li>
     * <li><p>If you set MetricType to system, this parameter has the following valid values:</p>
     * <ul>
     * <li>CpuUtilization: the CPU utilization. Unit: %.</li>
     * <li>ConcurrentConnections: the number of concurrent connections.</li>
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
     * <li>PackagesNetOut: the number of packets sent by the internal network interface controller (NIC). Unit: counts/s.</li>
     * <li>PackagesNetIn: the number of packets received by the internal NIC. Unit: counts/s.</li>
     * <li>PackagesNetOut: the number of packets sent by the public NIC. Unit: counts/s.</li>
     * <li>PackagesNetIn: the number of packets received by the public NIC. Unit: counts/s.</li>
     * <li>EciPodCpuUtilization: the CPU utilization. Unit: %.</li>
     * <li>EciPodMemoryUtilization: the memory usage. Unit: %.</li>
     * <li>LoadBalancerRealServerAverageQps: the queries per second (QPS) of an instance.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks of the system monitoring type</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CpuUtilization</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The type of the metric. Valid values:</p>
     * <ul>
     * <li>system: system metrics of CloudMonitor</li>
     * <li>custom: custom metrics that are reported to CloudMonitor</li>
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
     * <p>The statistical period of the metric data. Unit: seconds. Valid values:</p>
     * <ul>
     * <li>15</li>
     * <li>60</li>
     * <li>120</li>
     * <li>300</li>
     * <li>900</li>
     * </ul>
     * <blockquote>
     * <p> You can set this parameter to 15 seconds only for scaling groups of the ECS type.</p>
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
     * <p>The scaling group ID of the event-triggered task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp18p2yfxow2dloq****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The method that is used to aggregate statistics for the metric. Valid values:</p>
     * <ul>
     * <li>Average</li>
     * <li>Minimum</li>
     * <li>Maximum</li>
     * </ul>
     * <p>Default value: Average.</p>
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
         * <p>The dimension key of the metric. The valid values vary based on the metric type.</p>
         * <ul>
         * <li><p>If you set MetricType to custom, you can specify this parameter based on your business requirements.</p>
         * </li>
         * <li><p>If you set MetricType to system, this parameter has the following valid values:</p>
         * <ul>
         * <li>user_id: the ID of your Alibaba Cloud account.</li>
         * <li>scaling_group: the scaling group that you want to monitor by using the event-triggered task.</li>
         * <li>device: the NIC type.</li>
         * <li>state: the status of the TCP connection.</li>
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
         * <p>The dimension value of the metric. The valid values of this parameter vary based on the value of Dimensions.DimensionKey.</p>
         * <ul>
         * <li><p>If you set MetricType to custom, you can specify this parameter based on your business requirements.</p>
         * </li>
         * <li><p>If you set MetricType to system, this parameter has the following valid values:</p>
         * <ul>
         * <li><p>user_id: The system specifies the value.</p>
         * </li>
         * <li><p>scaling_group: The system specifies the value.</p>
         * </li>
         * <li><p>device: You can set this parameter to eth0 or eth1.</p>
         * <ul>
         * <li>For instances of the classic network type, eth0 specifies the internal NIC. Only one eth0 NIC exists on each instance that resides in VPCs.</li>
         * <li>For instances of the classic network type, eth1 specifies the public NIC.</li>
         * </ul>
         * </li>
         * <li><p>state: You can set this parameter to TCP_TOTAL or ESTABLISHED.</p>
         * <ul>
         * <li>TCP_TOTAL specifies the total number of TCP connections.</li>
         * <li>ESTABLISHED specifies the number of TCP connections that are established.</li>
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
         * <p>The operator that you want to use to compare the metric value and the threshold in the multi-metric alert rule. Valid values:</p>
         * <ul>
         * <li>If the metric value is greater than or equal to the threshold, set the value to &gt;=.</li>
         * <li>If the metric value is less than or equal to the metric threshold, set the value to &lt;=.</li>
         * <li>If the metric value is greater than the metric threshold, set the value to &gt;.</li>
         * <li>If the metric value is less than the metric threshold, set the value to &lt;.</li>
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
         * <p>The names of the metrics in the multi-metric alert rule. The valid values of this parameter vary based on the metric type.</p>
         * <ul>
         * <li><p>If you set MetricType to custom, the valid values are the metrics that you have.</p>
         * </li>
         * <li><p>If you set MetricType to system, this parameter has the following valid values:</p>
         * <ul>
         * <li>CpuUtilization: the CPU utilization. Unit: %.</li>
         * <li>ConcurrentConnections: the number of concurrent connections.</li>
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
         * </li>
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
         * <p> You can set this parameter to 15 seconds only for scaling groups of the ECS type.</p>
         * </blockquote>
         * <p>Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The method that you want to use to aggregate the metric data in the multi-metric alert rule. Valid values:</p>
         * <ul>
         * <li>Average: the average value.</li>
         * <li>Minimum: the minimum value</li>
         * <li>Maximum: the maximum value</li>
         * </ul>
         * <p>Default value: Average.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold of the metric value in the multi-metric alert rule. If the threshold is reached the specified number of times within the statistical period, a scaling rule is executed.</p>
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
