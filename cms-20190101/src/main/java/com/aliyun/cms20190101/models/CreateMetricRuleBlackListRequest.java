// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleBlackListRequest extends TeaModel {
    /**
     * <p>The category of the Alibaba Cloud service. For example, Redis includes <code>kvstore_standard</code> (Standard Edition), <code>kvstore_sharding</code> (Cluster Edition), and <code>kvstore_splitrw</code> (Read/Write Splitting Edition).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The effective period of the alert blacklist policy.</p>
     * <ul>
     * <li><p>If you do not specify this parameter, the alert blacklist policy is permanently valid.</p>
     * </li>
     * <li><p>If you specify this parameter, the blacklist policy is valid only within the specified time range. This parameter supports the following two formats:</p>
     * <ul>
     * <li><code>03:00-04:59</code>: The alert blacklist policy is valid from 03:00 to 04:59 (excluding 05:00) local time.</li>
     * <li><code>03:00-04:59 UTC+0700</code>: The alert blacklist policy is valid from 03:00 to 04:59 (excluding 05:00) UTC+07:00.</li>
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
     * <p>The end timestamp when the alert blacklist policy takes effect.</p>
     * <p>Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1640608200000</p>
     */
    @NameInMap("EnableEndTime")
    public String enableEndTime;

    /**
     * <p>The start timestamp when the alert blacklist policy takes effect.</p>
     * <p>Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1640237400000</p>
     */
    @NameInMap("EnableStartTime")
    public String enableStartTime;

    /**
     * <p>The list of instances of the specified Alibaba Cloud service in the alert blacklist policy.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Instances")
    public java.util.List<String> instances;

    /**
     * <p>The metrics of the instances.</p>
     * <ul>
     * <li><p>If you do not specify this parameter, the alert blacklist policy applies to all metrics of the specified Alibaba Cloud service.</p>
     * </li>
     * <li><p>If you specify this parameter, the blacklist policy applies only to the specified metrics.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Metrics")
    public java.util.List<CreateMetricRuleBlackListRequestMetrics> metrics;

    /**
     * <p>The name of the alert blacklist policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Blacklist-01</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The data namespace of the Alibaba Cloud service.</p>
     * <p>For more information about the namespaces of Alibaba Cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service metrics</a>.</p>
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
     * <p>The effective scope of the alert blacklist policy. Valid values:</p>
     * <ul>
     * <li><p>USER: The alert blacklist policy takes effect only within the current Alibaba Cloud account. This is the default value.</p>
     * </li>
     * <li><p>GROUP: The alert blacklist policy takes effect within the specified application group. You must specify an application group. For more information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("ScopeType")
    public String scopeType;

    /**
     * <p>The list of application group IDs. The value is a JSON array.</p>
     * <blockquote>
     * <p>This parameter is required only when <code>ScopeType</code> is set to <code>GROUP</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;67****&quot;,&quot;78****&quot;]</p>
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
         * <p>The extended dimension information of the instance. For example, <code>{&quot;device&quot;:&quot;C:&quot;}</code> indicates that the blacklist policy applies to all C drives of the ECS instance.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;device&quot;:&quot;C:&quot;}</p>
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
