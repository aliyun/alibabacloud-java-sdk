// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleBlackListRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("EnableEndTime")
    public String enableEndTime;

    @NameInMap("EnableStartTime")
    public String enableStartTime;

    @NameInMap("Instances")
    public java.util.List<String> instances;

    @NameInMap("Metrics")
    public java.util.List<CreateMetricRuleBlackListRequestMetrics> metrics;

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

    public static CreateMetricRuleBlackListRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricRuleBlackListRequest self = new CreateMetricRuleBlackListRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetricRuleBlackListRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateMetricRuleBlackListRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public CreateMetricRuleBlackListRequest setEnableEndTime(String enableEndTime) {
        this.enableEndTime = enableEndTime;
        return this;
    }
    public String getEnableEndTime() {
        return this.enableEndTime;
    }

    public CreateMetricRuleBlackListRequest setEnableStartTime(String enableStartTime) {
        this.enableStartTime = enableStartTime;
        return this;
    }
    public String getEnableStartTime() {
        return this.enableStartTime;
    }

    public CreateMetricRuleBlackListRequest setInstances(java.util.List<String> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<String> getInstances() {
        return this.instances;
    }

    public CreateMetricRuleBlackListRequest setMetrics(java.util.List<CreateMetricRuleBlackListRequestMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<CreateMetricRuleBlackListRequestMetrics> getMetrics() {
        return this.metrics;
    }

    public CreateMetricRuleBlackListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMetricRuleBlackListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateMetricRuleBlackListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMetricRuleBlackListRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public CreateMetricRuleBlackListRequest setScopeValue(String scopeValue) {
        this.scopeValue = scopeValue;
        return this;
    }
    public String getScopeValue() {
        return this.scopeValue;
    }

    public static class CreateMetricRuleBlackListRequestMetrics extends TeaModel {
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Resource")
        public String resource;

        public static CreateMetricRuleBlackListRequestMetrics build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleBlackListRequestMetrics self = new CreateMetricRuleBlackListRequestMetrics();
            return TeaModel.build(map, self);
        }

        public CreateMetricRuleBlackListRequestMetrics setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public CreateMetricRuleBlackListRequestMetrics setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

}
