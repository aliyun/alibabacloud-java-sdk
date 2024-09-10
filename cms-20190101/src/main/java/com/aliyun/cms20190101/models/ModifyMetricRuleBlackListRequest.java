// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMetricRuleBlackListRequest extends TeaModel {
    /**
     * <p>The category of the cloud service. For example, ApsaraDB for Redis supports the standard architecture, the cluster architecture, and the read/write splitting architecture. In this case, the valid values of this parameter for ApsaraDB for Redis include <code>kvstore_standard</code>, <code>kvstore_sharding</code>, and <code>kvstore_splitrw</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The time range within which the blacklist policy is effective. Take note of the following information:</p>
     * <ul>
     * <li><p>If you do not configure this parameter, the blacklist policy is permanently effective.</p>
     * </li>
     * <li><p>If you configure this parameter, the blacklist policy is effective only within the specified time range. Examples:</p>
     * <ul>
     * <li><code>03:00-04:59</code>: The blacklist policy is effective from 03:00 to 05:00 local time. 05:00 local time is excluded.</li>
     * <li><code>03:00-04:59 UTC+0700</code>: The blacklist policy is effective from 03:00 to 05:00 (UTC+7). 05:00 (UTC+7) is excluded.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>03:00-04:59</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The timestamp when the blacklist policy expires.</p>
     * <p>Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1640608200000</p>
     */
    @NameInMap("EnableEndTime")
    public String enableEndTime;

    /**
     * <p>The timestamp when the blacklist policy starts to take effect.</p>
     * <p>Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1640237400000</p>
     */
    @NameInMap("EnableStartTime")
    public String enableStartTime;

    /**
     * <p>The ID of the blacklist policy.</p>
     * <p>For information about how to obtain the ID of a blacklist policy, see <a href="https://help.aliyun.com/document_detail/457257.html">DescribeMetricRuleBlackList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>93514c96-ceb8-47d8-8ee3-93b6d98b****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The IDs of the instances that belong to the specified cloud service.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Instances")
    public java.util.List<String> instances;

    /**
     * <p>The metrics of the instance.</p>
     * <ul>
     * <li>If you do not configure this parameter, the blacklist policy applies to all metrics of the specified cloud service.</li>
     * <li>If you configure this parameter, the blacklist policy applies only to the current metric.</li>
     * </ul>
     */
    @NameInMap("Metrics")
    public java.util.List<ModifyMetricRuleBlackListRequestMetrics> metrics;

    /**
     * <p>The name of the blacklist policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Blacklist-02</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace of the cloud service.</p>
     * <p>For more information about the namespaces of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The effective scope of the blacklist policy. Valid values:</p>
     * <ul>
     * <li>USER: The blacklist policy takes effect only within the current Alibaba Cloud account.</li>
     * <li>GROUP (default): The blacklist policy takes effect only within the specified application group. For information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("ScopeType")
    public String scopeType;

    /**
     * <p>The IDs of the application groups.</p>
     * <blockquote>
     * <p> This parameter is required only when <code>ScopeType</code> is set to <code>GROUP</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;67****&quot;,&quot;78****&quot;]</p>
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
         * <p>Valid values of N: 1 to 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disk_utilization</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The extended dimension of the instance. For example, <code>{&quot;device&quot;:&quot;C:&quot;}</code> specifies that the blacklist policy is applied to all C disks of the specified Elastic Compute Service (ECS) instance.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;device&quot;:&quot;C:&quot;}</p>
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
