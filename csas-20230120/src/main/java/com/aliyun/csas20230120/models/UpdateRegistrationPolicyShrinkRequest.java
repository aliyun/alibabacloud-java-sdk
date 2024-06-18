// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateRegistrationPolicyShrinkRequest extends TeaModel {
    @NameInMap("CompanyLimitCount")
    public String companyLimitCountShrink;

    /**
     * <strong>example:</strong>
     * <p>LimitAll</p>
     */
    @NameInMap("CompanyLimitType")
    public String companyLimitType;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>UserGroupNormal</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <strong>example:</strong>
     * <p>registration_policy_name</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("PersonalLimitCount")
    public String personalLimitCountShrink;

    /**
     * <strong>example:</strong>
     * <p>LimitDiff</p>
     */
    @NameInMap("PersonalLimitType")
    public String personalLimitType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>reg-policy-63b2f1844b86****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    @NameInMap("Whitelist")
    public java.util.List<String> whitelist;

    public static UpdateRegistrationPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRegistrationPolicyShrinkRequest self = new UpdateRegistrationPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRegistrationPolicyShrinkRequest setCompanyLimitCountShrink(String companyLimitCountShrink) {
        this.companyLimitCountShrink = companyLimitCountShrink;
        return this;
    }
    public String getCompanyLimitCountShrink() {
        return this.companyLimitCountShrink;
    }

    public UpdateRegistrationPolicyShrinkRequest setCompanyLimitType(String companyLimitType) {
        this.companyLimitType = companyLimitType;
        return this;
    }
    public String getCompanyLimitType() {
        return this.companyLimitType;
    }

    public UpdateRegistrationPolicyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateRegistrationPolicyShrinkRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public UpdateRegistrationPolicyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRegistrationPolicyShrinkRequest setPersonalLimitCountShrink(String personalLimitCountShrink) {
        this.personalLimitCountShrink = personalLimitCountShrink;
        return this;
    }
    public String getPersonalLimitCountShrink() {
        return this.personalLimitCountShrink;
    }

    public UpdateRegistrationPolicyShrinkRequest setPersonalLimitType(String personalLimitType) {
        this.personalLimitType = personalLimitType;
        return this;
    }
    public String getPersonalLimitType() {
        return this.personalLimitType;
    }

    public UpdateRegistrationPolicyShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdateRegistrationPolicyShrinkRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public UpdateRegistrationPolicyShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateRegistrationPolicyShrinkRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public UpdateRegistrationPolicyShrinkRequest setWhitelist(java.util.List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

}
