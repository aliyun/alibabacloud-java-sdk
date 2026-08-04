// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AIUsageLimitPolicy extends TeaModel {
    /**
     * <p>A brief description of the policy\&quot;s purpose or scope.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The timestamp (in UTC) when the policy was created, formatted as <code>YYYY-MM-DDThh:mm:ssZ</code>. This is a system-generated, read-only property.</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The timestamp (in UTC) when the policy was last modified, formatted as <code>YYYY-MM-DDThh:mm:ssZ</code>. This is a system-generated, read-only property.</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The unique identifier for the usage limit policy. This is a system-generated, read-only value.</p>
     */
    @NameInMap("LimitPolicyId")
    public String limitPolicyId;

    /**
     * <p>The maximum value for the specified <code>MetricType</code> allowed within the <code>ResetPeriod</code>. Once this limit is reached, further requests are throttled or rejected.</p>
     */
    @NameInMap("LimitValue")
    public Long limitValue;

    /**
     * <p>The type of metric the limit applies to, such as the number of API requests, tokens processed, or compute units consumed.</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>A user-friendly name for the policy. This helps you identify the policy in a list.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The priority of the policy, used to determine the evaluation order when multiple policies apply to the same request. A lower number indicates a higher priority.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The time window during which the usage count is accumulated before it resets. For example: <code>Hour</code>, <code>Day</code>, or <code>Month</code>.</p>
     */
    @NameInMap("ResetPeriod")
    public String resetPeriod;

    /**
     * <p>A list of service IDs that this policy applies to. The policy is enforced only for requests made to these services.</p>
     */
    @NameInMap("ServiceIds")
    public java.util.List<String> serviceIds;

    /**
     * <p>The status of the policy. Valid values are <code>Enabled</code> and <code>Disabled</code>. A disabled policy is not enforced.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>A list of user group IDs that this policy applies to. The policy is enforced only for users who belong to these groups.</p>
     */
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
