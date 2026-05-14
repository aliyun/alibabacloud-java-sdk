// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AIUsageLimitPolicy extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("LimitPolicyId")
    public String limitPolicyId;

    @NameInMap("LimitValue")
    public Long limitValue;

    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ResetPeriod")
    public String resetPeriod;

    @NameInMap("ServiceIds")
    public java.util.List<String> serviceIds;

    @NameInMap("Status")
    public String status;

    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    public static AIUsageLimitPolicy build(java.util.Map<String, ?> map) throws Exception {
        AIUsageLimitPolicy self = new AIUsageLimitPolicy();
        return TeaModel.build(map, self);
    }

    public AIUsageLimitPolicy setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AIUsageLimitPolicy setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AIUsageLimitPolicy setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AIUsageLimitPolicy setLimitPolicyId(String limitPolicyId) {
        this.limitPolicyId = limitPolicyId;
        return this;
    }
    public String getLimitPolicyId() {
        return this.limitPolicyId;
    }

    public AIUsageLimitPolicy setLimitValue(Long limitValue) {
        this.limitValue = limitValue;
        return this;
    }
    public Long getLimitValue() {
        return this.limitValue;
    }

    public AIUsageLimitPolicy setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public AIUsageLimitPolicy setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AIUsageLimitPolicy setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public AIUsageLimitPolicy setResetPeriod(String resetPeriod) {
        this.resetPeriod = resetPeriod;
        return this;
    }
    public String getResetPeriod() {
        return this.resetPeriod;
    }

    public AIUsageLimitPolicy setServiceIds(java.util.List<String> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<String> getServiceIds() {
        return this.serviceIds;
    }

    public AIUsageLimitPolicy setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AIUsageLimitPolicy setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

}
