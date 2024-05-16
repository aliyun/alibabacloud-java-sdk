// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyAlarmRequest extends TeaModel {
    /**
     * <p>The list of unique identifiers of the scaling rules that are associated with the event-triggered task.</p>
     */
    @NameInMap("AlarmActions")
    public java.util.List<String> alarmActions;

    /**
     * <p>The ID of the event-triggered task.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlarmTaskId")
    public String alarmTaskId;

    /**
     * <p>The operator that is used to compare the metric value and the threshold. Valid values:</p>
     * <br>
     * <p>*   If the metric value is greater than or equal to the threshold, set the value to `>=`.</p>
     * <p>*   If the metric value is less than or equal to the threshold, set the value to `<=`.</p>
     * <p>*   If the metric value is greater than the threshold, set the value to `>`.</p>
     * <p>*   If the metric value is less than the threshold, set the value to `<`.</p>
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
    public java.util.List<ModifyAlarmRequestDimensions> dimensions;

    /**
     * <p>The effective period of the event-triggered task.</p>
     * <br>
     * <p>This parameter follows the cron expression format. The default format is `X X X X X ?`, in which:</p>
     * <br>
     * <p>*   X: a placeholder for a field, which represents seconds, minutes, hours, days, and months in sequence. X can be a definite value or a special character that has logical meaning. For information about the valid values of X, see [Cron expression](https://help.aliyun.com/document_detail/25907.html).</p>
     * <p>*   ?: No value is specified.</p>
     * <br>
     * <p>> By default, the value of this parameter is specified in **UTC+8**. You can specify the time zone in the `TZ=+yy` format before a cron expression. y indicates the time zone. For example, `TZ=+00 * * 1-2 * * ?` specifies that the event-triggered task is in effect between 01:00 and 02:59 (UTC+0) every day.</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   ` * * * * * ?  `: The event-triggered task is in effect all the time.</p>
     * <p>*   ` * * 17-18 * * ?  `: The event-triggered task is in effect between 17:00 and 18:59 (UTC+8) every day.</p>
     * <p>*   `TZ=+00 * * 1-2 * * ?`: The event-triggered task is in effect between 01:00 and 02:59 (UTC+0) every day.</p>
     */
    @NameInMap("Effective")
    public String effective;

    /**
     * <p>The number of times that the threshold must be reached before a scaling rule can be executed. For example, if you set this parameter to 3, the average CPU utilization must reach or exceed 80% three times in a row before a scaling rule is triggered.</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The expressions that are specified in the multi-metric alert rule.</p>
     */
    @NameInMap("Expressions")
    public java.util.List<ModifyAlarmRequestExpressions> expressions;

    /**
     * <p>The relationship between the trigger conditions in the multi-metric alert rule. Valid values:</p>
     * <br>
     * <p>*   `&&`: An alert is triggered only if all metrics in the multi-metric alert rule meet the trigger conditions. In this case, an alert is triggered only if the results of all trigger conditions that are specified in the multi-metric alert rule are `true`.</p>
     * <p>*   `||`: An alert is triggered if one of the metrics in the multi-metric alert rule meets the trigger condition.</p>
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
     * <p>The name of the metric. The valid values vary based on the metric type.</p>
     * <br>
     * <p>*   If you set the MetricType parameter to custom, the valid values are your custom metrics.</p>
     * <br>
     * <p>*   If you set the MetricType parameter to system, the MetricName parameter has the following valid values:</p>
     * <br>
     * <p>    *   CpuUtilization: the CPU utilization of an ECS instance. Unit: %.</p>
     * <p>    *   IntranetTx: the outbound traffic over the internal network from an ECS instance. Unit: KB/min.</p>
     * <p>    *   IntranetRx: the inbound traffic over the Internet to an ECS instance that resides in a virtual private cloud (VPC). Unit: KB/min.</p>
     * <p>    *   VpcInternetTx: the outbound traffic over the Internet from an ECS instance that resides in a VPC. Unit: KB/min.</p>
     * <p>    *   VpcInternetRx: the inbound traffic over the Internet to an ECS instance that resides in a VPC. Unit: KB/min.</p>
     * <p>    *   SystemDiskReadBps: the number of bytes read from the system disk used by an ECS instance per second.</p>
     * <p>    *   SystemDiskWriteBps: the number of bytes written to the system disk used by an ECS instance per second.</p>
     * <p>    *   SystemDiskReadOps: the number of read operations on the system disk used by an ECS instance per second.</p>
     * <p>    *   SystemDiskWriteOps: the number of write operations on the system disk used by an ECS instance per second.</p>
     * <p>    *   CpuUtilizationAgent: the CPU utilization of an agent. Unit: %.</p>
     * <p>    *   GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory of an agent.</p>
     * <p>    *   GpuMemoryUtilizationAgent: the GPU memory usage of an agent. Unit: %.</p>
     * <p>    *   MemoryUtilization: the memory usage of an agent. Unit: %.</p>
     * <p>    *   LoadAverage: the average system load of an agent.</p>
     * <p>    *   TcpConnection: the total number of TCP connections of an agent.</p>
     * <p>    *   TcpConnection: the number of established TCP connections of an agent.</p>
     * <p>    *   PackagesNetOut: the number of packets that are sent by the internal network interface controller (NIC) used by an agent.</p>
     * <p>    *   PackagesNetIn: the number of packets that are received by the internal NIC used by an agent.</p>
     * <p>    *   EciPodCpuUtilization: the CPU utilization of an elastic container instance. Unit: %.</p>
     * <p>    *   EciPodMemoryUtilization: the memory usage of an elastic container instance. Unit: %.</p>
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

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The period of time during which statistics about the metric is collected. Unit: seconds. Valid values:</p>
     * <br>
     * <p>*   15</p>
     * <p>*   60</p>
     * <p>*   120</p>
     * <p>*   300</p>
     * <p>*   900</p>
     * <br>
     * <p>> If your scaling group is of the ECS type and uses CloudMonitor metrics, you can set the Period parameter to 15. In other cases, you can set the Period parameter to 60, 120, 300, or 900. In most cases, the name of a CloudMonitor metric contains Agent.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The region ID of the event-triggered task.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

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
     * <p>The thresholds of the metric values in the multi-metric alert rule. If the thresholds are reached the specified number of times within the specified period, a scaling rule is executed.</p>
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
         * <p>The key of the dimension. The valid values vary based on the metric type.</p>
         * <br>
         * <p>*   If you set the MetricType parameter to custom, you can specify this parameter based on your business requirements.</p>
         * <br>
         * <p>*   If you set the MetricType parameter to system, this parameter has the following valid values:</p>
         * <br>
         * <p>    *   user_id: the ID of your Alibaba Cloud account</p>
         * <p>    *   scaling_group: the scaling group that you want to monitor</p>
         * <p>    *   device: the type of the NIC</p>
         * <p>    *   state: the status of the TCP connection</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The value of the dimension. The valid values vary based on the value of the DimensionKey parameter.</p>
         * <br>
         * <p>*   If you set the MetricType parameter to custom, you can specify this parameter based on your business requirements.</p>
         * <br>
         * <p>*   If you set the MetricType parameter to system, this parameter has the following valid values:</p>
         * <br>
         * <p>    *   If you set the DimensionKey parameter to user_id, the system specifies the value</p>
         * <br>
         * <p>    *   scaling_group: The system specifies the value of the DimensionValue parameter.</p>
         * <br>
         * <p>    *   If you set the DimensionKey parameter to device, you can set the DimensionValue parameter to eth0 or eth1.</p>
         * <br>
         * <p>        *   For instances that reside in the classic network type, eth0 specifies the internal NIC. Only one eth0 NIC exists on each instance that resides in a VPC.</p>
         * <p>        *   For instances that reside in the classic network, eth1 specifies the public NIC.</p>
         * <br>
         * <p>    *   If you set the DimensionKey parameter to state, you can set the DimensionValue parameter to TCP_TOTAL or ESTABLISHED.</p>
         * <br>
         * <p>        *   TCP_TOTAL specifies the total number of TCP connections.</p>
         * <p>        *   ESTABLISHED specifies the number of established TCP connections.</p>
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
         * <p>The operator that is used to compare the metric value and the threshold. Valid values:</p>
         * <br>
         * <p>*   If the metric value is greater than or equal to the threshold, set the value to `>=`.</p>
         * <p>*   If the metric value is less than or equal to the threshold, set the value to `<=`.</p>
         * <p>*   If the metric value is greater than the threshold, set the value to `>`.</p>
         * <p>*   If the metric value is less than the threshold, set the value to `<`.</p>
         * <br>
         * <p>Default value: >=.</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The name of the metric that is specified in the multi-metric alert rule. The valid values vary based on the metric type.</p>
         * <br>
         * <p>*   If you set the MetricType parameter to custom, the valid values are your custom metrics.</p>
         * <br>
         * <p>*   If you set the MetricType parameter to system, the MetricName parameter has the following valid values:</p>
         * <br>
         * <p>    *   CpuUtilization: the CPU utilization of an ECS instance. Unit: %.</p>
         * <p>    *   IntranetTx: the outbound traffic over the internal network from an ECS instance. Unit: KB/min.</p>
         * <p>    *   IntranetRx: the inbound traffic over the Internet to an ECS instance that resides in a VPC. Unit: KB/min.</p>
         * <p>    *   VpcInternetTx: the outbound traffic over the Internet from an ECS instance that resides in a VPC. Unit: KB/min.</p>
         * <p>    *   VpcInternetRx: the inbound traffic over the Internet to an ECS instance that resides in a VPC. Unit: KB/min.</p>
         * <p>    *   SystemDiskReadBps: the number of bytes read from the system disk used by an ECS instance per second.</p>
         * <p>    *   SystemDiskWriteBps: the number of bytes written to the system disk used by an ECS instance per second.</p>
         * <p>    *   SystemDiskReadOps: the number of read operations on the system disk used by an ECS instance per second.</p>
         * <p>    *   SystemDiskWriteOps: the number of write operations on the system disk used by an ECS instance per second.</p>
         * <p>    *   CpuUtilizationAgent: the CPU utilization of an agent. Unit: %.</p>
         * <p>    *   GpuUtilizationAgent: the GPU utilization of an agent. Unit: %.</p>
         * <p>    *   GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory of an agent.</p>
         * <p>    *   GpuMemoryUtilizationAgent: the GPU memory usage of an agent. Unit: %.</p>
         * <p>    *   MemoryUtilization: the memory usage of an agent. Unit: %.</p>
         * <p>    *   LoadAverage: the average system load of an agent.</p>
         * <p>    *   TcpConnection: the total number of TCP connections of an agent.</p>
         * <p>    *   TcpConnection: the number of established TCP connections of an agent.</p>
         * <p>    *   PackagesNetOut: the number of packets that are sent by the internal NIC used by an agent.</p>
         * <p>    *   PackagesNetIn: the number of packets that are received by the internal NIC used by an agent.</p>
         * <p>    *   EciPodCpuUtilization: the CPU utilization of an elastic container instance. Unit: %.</p>
         * <p>    *   EciPodMemoryUtilization: the memory usage of an elastic container instance. Unit: %.</p>
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
         * <p>> If your scaling group is of the ECS type and the event-triggered task associated with your scaling group monitors CloudMonitor metrics, you can set the Period parameter to 15. In other cases, you can set the Period parameter to 60, 120, 300, or 900. In most cases, the name of a CloudMonitor metric contains Agent.</p>
         * <br>
         * <p>Default value: 300.</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The method that is used to aggregate statistics about the metrics that are specified in the multi-metric alert rule. Valid values:</p>
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
