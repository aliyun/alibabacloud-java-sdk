// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateRegistrationPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The registration limit for corporate devices.</p>
     */
    @NameInMap("CompanyLimitCount")
    public String companyLimitCountShrink;

    /**
     * <p>The registration limit type for corporate devices. Valid values:</p>
     * <ul>
     * <li><p><strong>Unlimited</strong>: No limit.</p>
     * </li>
     * <li><p><strong>LimitAll</strong>: Limits the total number of devices.</p>
     * </li>
     * <li><p><strong>LimitDiff</strong>: Limits devices by terminal type.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LimitAll</p>
     */
    @NameInMap("CompanyLimitType")
    public String companyLimitType;

    /**
     * <p>The description of the device registration policy. The description can be 1 to 128 characters long and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一条设备注册策略</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The matching target type of the policy. Valid values:</p>
     * <ul>
     * <li><p><strong>UserGroupAll</strong>: Associates with all users.</p>
     * </li>
     * <li><p><strong>UserGroupNormal</strong>: Associates with specific user groups.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UserGroupNormal</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>The name of the device registration policy. The name must be 1 to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>registration_policy_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The registration limit for personal devices.</p>
     */
    @NameInMap("PersonalLimitCount")
    public String personalLimitCountShrink;

    /**
     * <p>The registration limit type for personal devices. Valid values:</p>
     * <ul>
     * <li><p><strong>Unlimited</strong>: No limit.</p>
     * </li>
     * <li><p><strong>LimitAll</strong>: Limits the total number of devices.</p>
     * </li>
     * <li><p><strong>LimitDiff</strong>: Limits devices by terminal type.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LimitDiff</p>
     */
    @NameInMap("PersonalLimitType")
    public String personalLimitType;

    /**
     * <p>The ID of the device registration policy. You can obtain the ID by calling one of the following operations:</p>
     * <ul>
     * <li><p><a href="~~ListRegistrationPolicies~~">ListRegistrationPolicies</a></p>
     * </li>
     * <li><p><a href="~~GetRegistrationPolicy~~">GetRegistrationPolicy</a></p>
     * </li>
     * <li><p><a href="~~CreateRegistrationPolicy~~">CreateRegistrationPolicy</a></p>
     * </li>
     * <li><p><a href="~~UpdateRegistrationPolicy~~">UpdateRegistrationPolicy</a></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>reg-policy-63b2f1844b86****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The priority of the device registration policy. A smaller value indicates a higher priority. The value 0 indicates the highest priority, and 99 indicates the lowest priority.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <p>The status of the device registration policy. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong></p>
     * </li>
     * <li><p><strong>Disabled</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The IDs of user groups. This parameter is required when MatchMode is set to <strong>UserGroupNormal</strong>. A policy can be associated with up to 100 user groups.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The list of whitelisted users for the device registration policy. You can add up to 1,000 usernames.</p>
     */
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
