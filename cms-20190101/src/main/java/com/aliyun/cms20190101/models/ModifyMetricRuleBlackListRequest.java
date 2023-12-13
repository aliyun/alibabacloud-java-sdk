// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMetricRuleBlackListRequest extends TeaModel {
    /**
     * <p>The category of the Alibaba Cloud service. For example, ApsaraDB for Redis includes the following categories: ApsaraDB for Redis (standard architecture), ApsaraDB for Redis (cluster architecture), and ApsaraDB for Redis (read/write splitting architecture). In this case, the valid values of this parameter for ApsaraDB for Redis include `kvstore_standard`, `kvstore_sharding`, and `kvstore_splitrw`.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The time range within which the blacklist policy is effective. Take note of the following information:</p>
     * <br>
     * <p>*   If you do not configure this parameter, the blacklist policy is permanently effective.</p>
     * <br>
     * <p>*   If you configure this parameter, the blacklist policy is effective only within the specified time range. Examples:</p>
     * <br>
     * <p>    *   `03:00-04:59`: The blacklist policy is effective from 03:00 to 05:00 local time. 05:00 local time is excluded.</p>
     * <p>    *   `03:00-04:59 UTC+0700`: The blacklist policy is effective from 03:00 to 05:00 (UTC+7). 05:00 (UTC+7) is excluded.</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The timestamp when the blacklist policy expires.</p>
     * <br>
     * <p>Unit: milliseconds.</p>
     */
    @NameInMap("EnableEndTime")
    public String enableEndTime;

    /**
     * <p>The timestamp when the blacklist policy starts to take effect.</p>
     * <br>
     * <p>Unit: milliseconds.</p>
     */
    @NameInMap("EnableStartTime")
    public String enableStartTime;

    /**
     * <p>The ID of the blacklist policy.</p>
     * <br>
     * <p>For information about how to obtain the ID of a blacklist policy, see [DescribeMetricRuleBlackList](~~457257~~).</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The IDs of the instances that belong to the specified cloud service.</p>
     */
    @NameInMap("Instances")
    public java.util.List<String> instances;

    /**
     * <p>The metrics of the instance.</p>
     * <br>
     * <p>*   If you do not configure this parameter, the blacklist policy applies to all metrics of the specified cloud service.</p>
     * <p>*   If you configure this parameter, the blacklist policy applies only to the current metric.</p>
     */
    @NameInMap("Metrics")
    public java.util.List<ModifyMetricRuleBlackListRequestMetrics> metrics;

    /**
     * <p>The name of the blacklist policy.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace of the cloud service.</p>
     * <br>
     * <p>For more information about the namespaces of different cloud services, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The effective scope of the blacklist policy. Valid values:</p>
     * <br>
     * <p>*   USER: The blacklist policy takes effect only within the current Alibaba Cloud account.</p>
     * <p>*   GROUP (default): The blacklist policy takes effect only within the specified application group. For information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).</p>
     */
    @NameInMap("ScopeType")
    public String scopeType;

    /**
     * <p>The IDs of the application groups. Specify a JSON array.</p>
     * <br>
     * <p>> This parameter must be specified when `ScopeType` is set to `GROUP`.</p>
     */
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
        /**
         * <p>The name of the metric.</p>
         * <br>
         * <p>Valid values of N: 1 to 10.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The extended dimension of the instance. For example, `{"device":"C:"}` specifies that the blacklist policy is applied to all C disks of the specified Elastic Compute Service (ECS) instance.</p>
         * <br>
         * <p>Valid values of N: 1 to 10.</p>
         */
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
