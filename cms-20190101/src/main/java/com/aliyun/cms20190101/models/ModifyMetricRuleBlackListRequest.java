// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMetricRuleBlackListRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("EnableEndTime")
    public String enableEndTime;

    @NameInMap("EnableStartTime")
    public String enableStartTime;

    @NameInMap("Id")
    public String id;

    @NameInMap("Instances")
    public java.util.List<String> instances;

    @NameInMap("Metrics")
    public java.util.List<ModifyMetricRuleBlackListRequestMetrics> metrics;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScopeType")
    public String scopeType;

    @NameInMap("ScopeValue")
    public String scopeValue;

    public static ModifyMetricRuleBlackListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMetricRuleBlackListRequest self = new ModifyMetricRuleBlackListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMetricRuleBlackListRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ModifyMetricRuleBlackListRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyMetricRuleBlackListRequest setEnableEndTime(String enableEndTime) {
        this.enableEndTime = enableEndTime;
        return this;
    }
    public String getEnableEndTime() {
        return this.enableEndTime;
    }

    public ModifyMetricRuleBlackListRequest setEnableStartTime(String enableStartTime) {
        this.enableStartTime = enableStartTime;
        return this;
    }
    public String getEnableStartTime() {
        return this.enableStartTime;
    }

    public ModifyMetricRuleBlackListRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyMetricRuleBlackListRequest setInstances(java.util.List<String> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<String> getInstances() {
        return this.instances;
    }

    public ModifyMetricRuleBlackListRequest setMetrics(java.util.List<ModifyMetricRuleBlackListRequestMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<ModifyMetricRuleBlackListRequestMetrics> getMetrics() {
        return this.metrics;
    }

    public ModifyMetricRuleBlackListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyMetricRuleBlackListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ModifyMetricRuleBlackListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyMetricRuleBlackListRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public ModifyMetricRuleBlackListRequest setScopeValue(String scopeValue) {
        this.scopeValue = scopeValue;
        return this;
    }
    public String getScopeValue() {
        return this.scopeValue;
    }

    public static class ModifyMetricRuleBlackListRequestMetrics extends TeaModel {
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Resource")
        public String resource;

        public static ModifyMetricRuleBlackListRequestMetrics build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleBlackListRequestMetrics self = new ModifyMetricRuleBlackListRequestMetrics();
            return TeaModel.build(map, self);
        }

        public ModifyMetricRuleBlackListRequestMetrics setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ModifyMetricRuleBlackListRequestMetrics setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

}
