// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class ModifyAlarmRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AlarmTaskId")
    public String alarmTaskId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("Statistics")
    public String statistics;

    @NameInMap("Threshold")
    public Float threshold;

    @NameInMap("ComparisonOperator")
    public String comparisonOperator;

    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    @NameInMap("GroupId")
    public Integer groupId;

    @NameInMap("Effective")
    public String effective;

    @NameInMap("AlarmAction")
    public java.util.List<String> alarmAction;

    @NameInMap("Dimension")
    public java.util.List<ModifyAlarmRequestDimension> dimension;

    public static ModifyAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAlarmRequest self = new ModifyAlarmRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAlarmRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAlarmRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAlarmRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAlarmRequest setAlarmTaskId(String alarmTaskId) {
        this.alarmTaskId = alarmTaskId;
        return this;
    }
    public String getAlarmTaskId() {
        return this.alarmTaskId;
    }

    public ModifyAlarmRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyAlarmRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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

    public ModifyAlarmRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
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

    public ModifyAlarmRequest setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public ModifyAlarmRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public ModifyAlarmRequest setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }
    public Integer getGroupId() {
        return this.groupId;
    }

    public ModifyAlarmRequest setEffective(String effective) {
        this.effective = effective;
        return this;
    }
    public String getEffective() {
        return this.effective;
    }

    public ModifyAlarmRequest setAlarmAction(java.util.List<String> alarmAction) {
        this.alarmAction = alarmAction;
        return this;
    }
    public java.util.List<String> getAlarmAction() {
        return this.alarmAction;
    }

    public ModifyAlarmRequest setDimension(java.util.List<ModifyAlarmRequestDimension> dimension) {
        this.dimension = dimension;
        return this;
    }
    public java.util.List<ModifyAlarmRequestDimension> getDimension() {
        return this.dimension;
    }

    public static class ModifyAlarmRequestDimension extends TeaModel {
        @NameInMap("DimensionKey")
        public String dimensionKey;

        @NameInMap("DimensionValue")
        public String dimensionValue;

        public static ModifyAlarmRequestDimension build(java.util.Map<String, ?> map) throws Exception {
            ModifyAlarmRequestDimension self = new ModifyAlarmRequestDimension();
            return TeaModel.build(map, self);
        }

        public ModifyAlarmRequestDimension setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public ModifyAlarmRequestDimension setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

    }

}
