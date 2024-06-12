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
     * <br>
     * <p>*   If the metric value is greater than or equal to the threshold, set the value to: >=.</p>
     * <p>*   If the metric value is less than or equal to the threshold, set the value to: <=.</p>
     * <p>*   If the metric value is greater than the threshold, set the value to: >.</p>
     * <p>*   If the metric value is less than the threshold, set the value to: <.</p>
     * <br>
     * <p>Default value: >=.</p>
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
    public java.util.List<CreateAlarmRequestDimensions> dimensions;

    /**
     * <p>The effective period of the event-triggered task. By default, the event-triggered task is in effect all the time.</p>
     * <br>
     * <p>This parameter follows the cron expression format. The default format is `X X X X X ?`. In the format:</p>
     * <br>
     * <p>*   X: a placeholder for a field, which represents seconds, minutes, hours, days, and months in sequence. X can be a definite value or a special character that has logical meaning. For information about the valid values of X, see [Cron expression](https://help.aliyun.com/document_detail/25907.html).</p>
     * <p>*   ?: No value is specified.</p>
     * <br>
     * <p>> By default, this parameter value is specified in **UTC+8**. You can specify the time zone in the `TZ=+yy` format before a cron expression. y indicates the time zone. For example, `TZ=+00 * * 1-2 * * ?` specifies that the event-triggered task is in effect between 01:00 and 02:59 (UTC+0) every day.</p>
     * <br>
     * <p>Sample values:</p>
     * <br>
     * <p>*   ` * * * * * ?  `: The event-triggered task is in effect all the time.</p>
     * <p>*   ` * * 17-18 * * ?  `: The event-triggered task is in effect between 17:00 and 18:59 (UTC+8) every day.</p>
     * <p>*   `TZ=+00 * * 1-2 * * ?`: The event-triggered task is in effect between 01:00 and 02:59 (UTC+0) every day.</p>
     */
    @NameInMap("Effective")
    public String effective;

    /**
     * <p>The number of times that the threshold must be reached before a scaling rule can be executed. For example, if you set this parameter to 3, the average CPU utilization must reach or exceed 80% three times in a row before a scaling rule is triggered.</p>
     * <br>
     * <p>Default value: 3.</p>
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
     * <br>
     * <p>*   `&&`: An alert is triggered only if all metrics in the multi-metric alert rule meet the trigger conditions. In this case, an alert is triggered only if the results of all trigger conditions that are specified in the multi-metric alert rule are `true`.</p>
     * <p>*   `||`: An alert is triggered if one of the metrics in the multi-metric alert rule meets the trigger conditions.</p>
     * <br>
     * <p>Default value: `&&`.</p>
     */
    @NameInMap("ExpressionsLogicOperator")
    public String expressionsLogicOperator;

    /**
     * <p>The ID of the application group to which the custom metric belongs. If you set the MetricType parameter to custom, you must specify this parameter.</p>
     */
    @NameInMap("GroupId")
    public Integer groupId;

    /**
     * <p>The metric name. The valid values of this parameter vary based on the metric type.</p>
     * <br>
     * <p>*   If you set MetricType to custom, the valid values are the metrics that you have.</p>
     * <br>
     * <p>*   If you set MetricType to system, this parameter has the following valid values:</p>
     * <br>
     * <p>    *   CpuUtilization: the CPU utilization. Unit: %.</p>
     * <p>    *   ConcurrentConnections: the number of concurrent connections.</p>
     * <p>    *   IntranetTx: the outbound traffic over an internal network. Unit: KB/min.</p>
     * <p>    *   IntranetRx: the inbound traffic over an internal network. Unit: KB/min.</p>
     * <p>    *   VpcInternetTx: the outbound traffic over a virtual private cloud (VPC). Unit: KB/min.</p>
     * <p>    *   VpcInternetRx: the inbound traffic over a VPC. Unit: KB/min.</p>
     * <p>    *   SystemDiskReadBps: the number of bytes read from the system disk per second.</p>
     * <p>    *   SystemDiskWriteBps: the number of bytes written to the system disk per second.</p>
     * <p>    *   SystemDiskReadOps: the read IOPS of the system disk. Unit: counts/s.</p>
     * <p>    *   SystemDiskWriteOps: the write IOPS of the system disk. Unit: counts/s.</p>
     * <p>    *   CpuUtilizationAgent: the CPU utilization. Unit: %.</p>
     * <p>    *   GpuUtilizationAgent: the GPU utilization. Unit: %.</p>
     * <p>    *   GpuMemoryFreeUtilizationAgent: the idle GPU memory usage. Unit: %.</p>
     * <p>    *   GpuMemoryUtilizationAgent: the GPU memory usage. Unit: %.</p>
     * <p>    *   MemoryUtilization: the memory usage. Unit: %.</p>
     * <p>    *   LoadAverage: the average system load.</p>
     * <p>    *   TcpConnection: the total number of TCP connections.</p>
     * <p>    *   TcpConnection: the number of established TCP connections.</p>
     * <p>    *   PackagesNetOut: the number of packets sent by the internal network interface controller (NIC). Unit: counts/s.</p>
     * <p>    *   PackagesNetIn: the number of packets received by the internal NIC. Unit: counts/s.</p>
     * <p>    *   PackagesNetOut: the number of packets sent by the public NIC. Unit: counts/s.</p>
     * <p>    *   PackagesNetIn: the number of packets received by the public NIC. Unit: counts/s.</p>
     * <p>    *   EciPodCpuUtilization: the CPU utilization. Unit: %.</p>
     * <p>    *   EciPodMemoryUtilization: the memory usage. Unit: %.</p>
     * <p>    *   LoadBalancerRealServerAverageQps: the queries per second (QPS) of an instance.</p>
     * <br>
     * <p>For more information, see [Event-triggered tasks of the system monitoring type](https://help.aliyun.com/document_detail/74854.html).</p>
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

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The statistical period of the metric data. Unit: seconds. Valid values:</p>
     * <br>
     * <p>*   15</p>
     * <p>*   60</p>
     * <p>*   120</p>
     * <p>*   300</p>
     * <p>*   900</p>
     * <br>
     * <p>>  You can set this parameter to 15 seconds only for scaling groups of the ECS type.</p>
     * <br>
     * <p>Default value: 300.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The region ID of the scaling group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The scaling group ID of the event-triggered task.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The method that is used to aggregate statistics for the metric. Valid values:</p>
     * <br>
     * <p>*   Average</p>
     * <p>*   Minimum</p>
     * <p>*   Maximum</p>
     * <br>
     * <p>Default value: Average.</p>
     */
    @NameInMap("Statistics")
    public String statistics;

    /**
     * <p>The threshold of the metric value. If the threshold is reached the specified number of times within the specified period, a scaling rule is executed.</p>
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
         * <br>
         * <p>*   If you set MetricType to custom, you can specify this parameter based on your business requirements.</p>
         * <br>
         * <p>*   If you set MetricType to system, this parameter has the following valid values:</p>
         * <br>
         * <p>    *   user_id: the ID of your Alibaba Cloud account.</p>
         * <p>    *   scaling_group: the scaling group that you want to monitor by using the event-triggered task.</p>
         * <p>    *   device: the NIC type.</p>
         * <p>    *   state: the status of the TCP connection.</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The dimension value of the metric. The valid values of this parameter vary based on the value of Dimensions.DimensionKey.</p>
         * <br>
         * <p>*   If you set MetricType to custom, you can specify this parameter based on your business requirements.</p>
         * <br>
         * <p>*   If you set MetricType to system, this parameter has the following valid values:</p>
         * <br>
         * <p>    *   user_id: The system specifies the value.</p>
         * <br>
         * <p>    *   scaling_group: The system specifies the value.</p>
         * <br>
         * <p>    *   device: You can set this parameter to eth0 or eth1.</p>
         * <br>
         * <p>        *   For instances of the classic network type, eth0 specifies the internal NIC. Only one eth0 NIC exists on each instance that resides in VPCs.</p>
         * <p>        *   For instances of the classic network type, eth1 specifies the public NIC.</p>
         * <br>
         * <p>    *   state: You can set this parameter to TCP_TOTAL or ESTABLISHED.</p>
         * <br>
         * <p>        *   TCP_TOTAL specifies the total number of TCP connections.</p>
         * <p>        *   ESTABLISHED specifies the number of TCP connections that are established.</p>
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
         * <br>
         * <p>*   If the metric value is greater than or equal to the threshold, set the value to >=.</p>
         * <p>*   If the metric value is less than or equal to the metric threshold, set the value to <=.</p>
         * <p>*   If the metric value is greater than the metric threshold, set the value to >.</p>
         * <p>*   If the metric value is less than the metric threshold, set the value to <.</p>
         * <br>
         * <p>Default value: >=.</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The names of the metrics in the multi-metric alert rule. The valid values of this parameter vary based on the metric type.</p>
         * <br>
         * <p>*   If you set MetricType to custom, the valid values are the metrics that you have.</p>
         * <br>
         * <p>*   If you set MetricType to system, this parameter has the following valid values:</p>
         * <br>
         * <p>    *   CpuUtilization: the CPU utilization. Unit: %.</p>
         * <p>    *   ConcurrentConnections: the number of concurrent connections.</p>
         * <p>    *   IntranetTx: the outbound traffic over an internal network. Unit: KB/min.</p>
         * <p>    *   IntranetRx: the inbound traffic over an internal network. Unit: KB/min.</p>
         * <p>    *   VpcInternetTx: the outbound traffic over a VPC. Unit: KB/min.</p>
         * <p>    *   VpcInternetRx: the inbound traffic over a VPC. Unit: KB/min.</p>
         * <p>    *   SystemDiskReadBps: the number of bytes read from the system disk per second.</p>
         * <p>    *   SystemDiskWriteBps: the number of bytes written to the system disk per second.</p>
         * <p>    *   SystemDiskReadOps: the read IOPS of the system disk. Unit: counts/s.</p>
         * <p>    *   SystemDiskWriteOps: the write IOPS of the system disk. Unit: counts/s.</p>
         * <p>    *   CpuUtilizationAgent: the CPU utilization. Unit: %.</p>
         * <p>    *   GpuUtilizationAgent: the GPU utilization. Unit: %.</p>
         * <p>    *   GpuMemoryFreeUtilizationAgent: the idle GPU memory usage. Unit: %.</p>
         * <p>    *   GpuMemoryUtilizationAgent: the GPU memory usage. Unit: %.</p>
         * <p>    *   MemoryUtilization: the memory usage. Unit: %.</p>
         * <p>    *   LoadAverage: the average system load.</p>
         * <p>    *   TcpConnection: the total number of TCP connections.</p>
         * <p>    *   TcpConnection: the number of established TCP connections.</p>
         * <p>    *   PackagesNetOut: the number of packets sent by the internal NIC. Unit: counts/s.</p>
         * <p>    *   PackagesNetIn: the number of packets received by the internal NIC. Unit: counts/s.</p>
         * <p>    *   PackagesNetOut: the number of packets sent by the public NIC. Unit: counts/s.</p>
         * <p>    *   PackagesNetIn: the number of packets received by the public NIC. Unit: counts/s.</p>
         * <p>    *   EciPodCpuUtilization: the CPU utilization. Unit: %.</p>
         * <p>    *   EciPodMemoryUtilization: the memory usage. Unit: %.</p>
         * <p>    *   LoadBalancerRealServerAverageQps: the QPS of an instance.</p>
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
         * <p>>  You can set this parameter to 15 seconds only for scaling groups of the ECS type.</p>
         * <br>
         * <p>Default value: 300.</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The method that you want to use to aggregate the metric data in the multi-metric alert rule. Valid values:</p>
         * <br>
         * <p>*   Average: the average value.</p>
         * <p>*   Minimum: the minimum value</p>
         * <p>*   Maximum: the maximum value</p>
         * <br>
         * <p>Default value: Average.</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold of the metric value in the multi-metric alert rule. If the threshold is reached the specified number of times within the statistical period, a scaling rule is executed.</p>
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
