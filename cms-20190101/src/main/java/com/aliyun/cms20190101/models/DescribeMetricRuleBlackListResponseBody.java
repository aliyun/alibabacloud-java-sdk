// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleBlackListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DescribeMetricRuleBlackList")
    public java.util.List<DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackList> describeMetricRuleBlackList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("MetricName")
        public String metricName;

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
        @NameInMap("Category")
        public String category;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("EnableEndTime")
        public Long enableEndTime;

        @NameInMap("EnableStartTime")
        public Long enableStartTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Instances")
        public java.util.List<String> instances;

        @NameInMap("IsEnable")
        public Boolean isEnable;

        @NameInMap("Metrics")
        public java.util.List<DescribeMetricRuleBlackListResponseBodyDescribeMetricRuleBlackListMetrics> metrics;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ScopeType")
        public String scopeType;

        @NameInMap("ScopeValue")
        public java.util.List<String> scopeValue;

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
