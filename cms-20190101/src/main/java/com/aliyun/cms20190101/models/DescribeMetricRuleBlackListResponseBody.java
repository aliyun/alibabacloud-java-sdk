// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleBlackListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p>The value 200 indicates success.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of alert blacklist policies.</p>
     */
    @NameInMap("DescribeMetricRuleBlackList")
    public java.util.List<DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList> describeMetricRuleBlackList;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D63E76CB-29AA-5B9F-88CE-400A6F28D428</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><p>true: Successful.</p>
     * </li>
     * <li><p>false: Failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of alert blacklist policies.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeMetricRuleBlackListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleBlackListResponseBody self = new DescribeMetricRuleBlackListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleBlackListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMetricRuleBlackListResponseBody setDescribeMetricRuleBlackList(java.util.List<DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList> describeMetricRuleBlackList) {
        this.describeMetricRuleBlackList = describeMetricRuleBlackList;
        return this;
    }
    public java.util.List<DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList> getDescribeMetricRuleBlackList() {
        return this.describeMetricRuleBlackList;
    }

    public DescribeMetricRuleBlackListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMetricRuleBlackListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetricRuleBlackListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMetricRuleBlackListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackListMetrics extends TeaModel {
        /**
         * <p>The name of the monitoring metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>disk_utilization</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The extension dimension information of the instance. For example, <code>{&quot;device&quot;:&quot;C:&quot;}</code> indicates that the blacklist policy is applied to all C drives of the ECS instance under the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;device&quot;:&quot;C:&quot;}]</p>
         */
        @NameInMap("Resource")
        public String resource;

        public static DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackListMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackListMetrics self = new DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackListMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackListMetrics setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackListMetrics setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

    public static class DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList extends TeaModel {
        /**
         * <p>The category of the Alibaba Cloud service. For example, ApsaraDB for Redis has <code>kvstore_standard</code> (Standard Edition), <code>kvstore_sharding</code> (Cluster Edition), and <code>kvstore_splitrw</code> (read/write splitting Edition).</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The timestamp when the alert blacklist policy was created.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1665714561000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The effective period of the alert blacklist policy.</p>
         * <p>The value is in the HH:mm-HH:mm format (24-hour clock). The default time zone is UTC+8. For example, &quot;00:00-23:59&quot; indicates that the policy takes effect all day.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00-23:59</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The start timestamp of the alert blacklist policy.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640608200000</p>
         */
        @NameInMap("EnableEndTime")
        public Long enableEndTime;

        /**
         * <p>The end timestamp of the alert blacklist policy.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640237400000</p>
         */
        @NameInMap("EnableStartTime")
        public Long enableStartTime;

        /**
         * <p>The ID of the alert blacklist policy.</p>
         * 
         * <strong>example:</strong>
         * <p>93514c96-ceb8-47d8-8ee3-93b6d98b****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The instances of the specified Alibaba Cloud service in the alert blacklist policy.</p>
         */
        @NameInMap("Instances")
        public java.util.List<String> instances;

        /**
         * <p>The status of the alert blacklist policy. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsEnable")
        public Boolean isEnable;

        /**
         * <p>The monitoring metrics of the instances.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackListMetrics> metrics;

        /**
         * <p>The name of the alert blacklist policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Blacklist-01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The effective scope of the alert blacklist policy. Valid values:</p>
         * <ul>
         * <li><p>USER: The alert blacklist policy takes effect only within the current Alibaba Cloud account.</p>
         * </li>
         * <li><p>GROUP: The alert blacklist policy takes effect in the specified application groups.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        /**
         * <p>The IDs of the application groups.</p>
         */
        @NameInMap("ScopeValue")
        public java.util.List<String> scopeValue;

        /**
         * <p>The timestamp when the alert blacklist policy was last modified.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1665718373000</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList self = new DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList setEnableEndTime(Long enableEndTime) {
            this.enableEndTime = enableEndTime;
            return this;
        }
        public Long getEnableEndTime() {
            return this.enableEndTime;
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList setEnableStartTime(Long enableStartTime) {
            this.enableStartTime = enableStartTime;
            return this;
        }
        public Long getEnableStartTime() {
            return this.enableStartTime;
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList setInstances(java.util.List<String> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<String> getInstances() {
            return this.instances;
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList setIsEnable(Boolean isEnable) {
            this.isEnable = isEnable;
            return this;
        }
        public Boolean getIsEnable() {
            return this.isEnable;
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList setMetrics(java.util.List<DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackListMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackListMetrics> getMetrics() {
            return this.metrics;
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList setScopeValue(java.util.List<String> scopeValue) {
            this.scopeValue = scopeValue;
            return this;
        }
        public java.util.List<String> getScopeValue() {
            return this.scopeValue;
        }

        public DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
