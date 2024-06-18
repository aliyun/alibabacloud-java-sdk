// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateRegistrationPolicyShrinkRequest extends TeaModel {
    @NameInMap("CompanyLimitCount")
    public String companyLimitCountShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LimitAll</p>
     */
    @NameInMap("CompanyLimitType")
    public String companyLimitType;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UserGroupAll</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registration_policy_name</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("PersonalLimitCount")
    public String personalLimitCountShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LimitDiff</p>
     */
    @NameInMap("PersonalLimitType")
    public String personalLimitType;

    /**
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    @NameInMap("Whitelist")
    public java.util.List<String> whitelist;

    public static CreateRegistrationPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRegistrationPolicyShrinkRequest self = new CreateRegistrationPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRegistrationPolicyShrinkRequest setCompanyLimitCountShrink(String companyLimitCountShrink) {
        this.companyLimitCountShrink = companyLimitCountShrink;
        return this;
    }
    public String getCompanyLimitCountShrink() {
        return this.companyLimitCountShrink;
    }

    public CreateRegistrationPolicyShrinkRequest setCompanyLimitType(String companyLimitType) {
        this.companyLimitType = companyLimitType;
        return this;
    }
    public String getCompanyLimitType() {
        return this.companyLimitType;
    }

    public CreateRegistrationPolicyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRegistrationPolicyShrinkRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public CreateRegistrationPolicyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRegistrationPolicyShrinkRequest setPersonalLimitCountShrink(String personalLimitCountShrink) {
        this.personalLimitCountShrink = personalLimitCountShrink;
        return this;
    }
    public String getPersonalLimitCountShrink() {
        return this.personalLimitCountShrink;
    }

    public CreateRegistrationPolicyShrinkRequest setPersonalLimitType(String personalLimitType) {
        this.personalLimitType = personalLimitType;
        return this;
    }
    public String getPersonalLimitType() {
        return this.personalLimitType;
    }

    public CreateRegistrationPolicyShrinkRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public CreateRegistrationPolicyShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateRegistrationPolicyShrinkRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public CreateRegistrationPolicyShrinkRequest setWhitelist(java.util.List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

}
