// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateRegistrationPolicyShrinkRequest extends TeaModel {
    @NameInMap("CompanyLimitCount")
    public String companyLimitCountShrink;

    @NameInMap("CompanyLimitType")
    public String companyLimitType;

    @NameInMap("Description")
    public String description;

    @NameInMap("MatchMode")
    public String matchMode;

    @NameInMap("Name")
    public String name;

    @NameInMap("PersonalLimitCount")
    public String personalLimitCountShrink;

    @NameInMap("PersonalLimitType")
    public String personalLimitType;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("Priority")
    public Long priority;

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
