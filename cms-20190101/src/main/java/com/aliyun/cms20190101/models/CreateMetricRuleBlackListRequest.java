// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleBlackListRequest extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The ID of the application group. The value of this parameter is a JSON array.</p>
     * <br>
     * <p>>  This parameter is required only if the `ScopeType` parameter is set to `GROUP`.</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The operation that you want to perform. Set the value to **CreateMetricRuleBlackList**.</p>
     */
    @NameInMap("EnableEndTime")
    public String enableEndTime;

    /**
     * <p>The ID of the blacklist policy.</p>
     */
    @NameInMap("EnableStartTime")
    public String enableStartTime;

    @NameInMap("Instances")
    public java.util.List<String> instances;

    @NameInMap("Metrics")
    public java.util.List<CreateMetricRuleBlackListRequestMetrics> metrics;

    /**
     * <p>The category of the cloud service. For example, ApsaraDB for Redis includes the following categories: ApsaraDB for Redis (standard architecture), ApsaraDB for Redis (cluster architecture), and ApsaraDB for Redis (read/write splitting architecture). In this case, the valid values of this parameter for ApsaraDB for Redis include `kvstore_standard`, `kvstore_sharding`, and `kvstore_splitrw`.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The timestamp when the blacklist policy expires.</p>
     * <br>
     * <p>Unit: milliseconds.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of instances that belong to the specified cloud service. The value of this parameter is a JSON array.</p>
     * <br>
     * <p>Valid values of N: 1 to 20.</p>
     */
    @NameInMap("ScopeType")
    public String scopeType;

    /**
     * <p>The extended dimension of the instance. For example, `{"device":"C:"}` specifies that the blacklist policy is applied to all C disks of the specified Elastic Compute Service (ECS) instance.</p>
     * <br>
     * <p>Valid values of N: 1 to 10</p>
     */
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
        /**
         * <p>The timestamp when the blacklist policy starts to take effect.</p>
         * <br>
         * <p>Unit: milliseconds.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The name of the blacklist policy.</p>
         */
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
