// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleBlackListResponseBody extends TeaModel {
    /**
     * <p>The categories of the Alibaba Cloud service. For example, ApsaraDB for Redis includes the following categories: ApsaraDB for Redis (standard architecture), ApsaraDB for Redis (cluster architecture), and ApsaraDB for Redis (read/write splitting architecture). In this case, the valid values of this parameter for ApsaraDB for Redis include `kvstore_standard`, `kvstore_sharding`, and `kvstore_splitrw`.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The timestamp when the blacklist policy started to take effect.</p>
     * <br>
     * <p>Unit: milliseconds.</p>
     */
    @NameInMap("DescribeMetricRuleBlackList")
    public java.util.List<DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList> describeMetricRuleBlackList;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The namespace of the cloud service.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The namespace of the cloud service.</p>
     * <br>
     * <p>For more information about the namespaces of different cloud services, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The timestamp when the blacklist policy was created.</p>
     * <br>
     * <p>Unit: milliseconds.</p>
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
         * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The ID of the request.</p>
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
         * <p>The name of the blacklist policy.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The metrics of the instance.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The extended dimension of the instance. For example, `{"device":"C:"}` specifies that the blacklist policy is applied to all C disks of the specified Elastic Compute Service (ECS) instance.</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The number of entries to return on each page.</p>
         * <br>
         * <p>Default value: 10.</p>
         */
        @NameInMap("EnableEndTime")
        public Long enableEndTime;

        /**
         * <p>The ID of the application group. The value of this parameter is a JSON array.</p>
         * <br>
         * <p>>  This parameter is returned only if the `ScopeType` parameter is set to `GROUP`.</p>
         */
        @NameInMap("EnableStartTime")
        public Long enableStartTime;

        /**
         * <p>The timestamp when the blacklist policy was modified.</p>
         * <br>
         * <p>Unit: milliseconds.</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Instances")
        public java.util.List<String> instances;

        /**
         * <p>The total number of blacklist policies.</p>
         */
        @NameInMap("IsEnable")
        public Boolean isEnable;

        /**
         * <p>The method that is used to sort query results by time. Valid values:</p>
         * <br>
         * <p>*   DESC (default): descending order</p>
         * <p>*   ASC: ascending order</p>
         */
        @NameInMap("Metrics")
        public java.util.List<DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackListMetrics> metrics;

        /**
         * <p>The status of the blacklist policy. Valid values:</p>
         * <br>
         * <p>*   true: The blacklist policy is enabled.</p>
         * <p>*   false: The blacklist policy is disabled.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of the page to return.</p>
         * <br>
         * <p>Default value: 1.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The IDs of instances that belong to the specified cloud service.</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        @NameInMap("ScopeValue")
        public java.util.List<String> scopeValue;

        /**
         * <p>The ID of the blacklist policy.</p>
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
