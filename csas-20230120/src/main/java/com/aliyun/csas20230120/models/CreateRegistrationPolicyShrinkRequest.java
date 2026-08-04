// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateRegistrationPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The restriction count for company devices.</p>
     */
    @NameInMap("CompanyLimitCount")
    public String companyLimitCountShrink;

    /**
     * <p>The restriction type for company devices. Valid values:</p>
     * <ul>
     * <li><p><strong>Unlimited</strong>: No restrictions.</p>
     * </li>
     * <li><p><strong>LimitAll</strong>: Limit by total count.</p>
     * </li>
     * <li><p><strong>LimitDiff</strong>: Limit by device category.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LimitAll</p>
     */
    @NameInMap("CompanyLimitType")
    public String companyLimitType;

    /**
     * <p>A description of the device registration policy. The description must be 1 to 128 characters in length. It can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一条设备注册策略</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The target type for policy matching. Valid values:</p>
     * <ul>
     * <li><p><strong>UserGroupAll</strong>: Apply to all users.</p>
     * </li>
     * <li><p><strong>UserGroupNormal</strong>: Apply to selected user groups.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UserGroupAll</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>The name of the device registration policy. The name must be 1 to 128 characters in length. It can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registration_policy_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The restriction count for personal devices.</p>
     */
    @NameInMap("PersonalLimitCount")
    public String personalLimitCountShrink;

    /**
     * <p>The restriction type for personal devices. Valid values:</p>
     * <ul>
     * <li><p><strong>Unlimited</strong>: No restrictions.</p>
     * </li>
     * <li><p><strong>LimitAll</strong>: Limit by total count.</p>
     * </li>
     * <li><p><strong>LimitDiff</strong>: Limit by device category.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LimitDiff</p>
     */
    @NameInMap("PersonalLimitType")
    public String personalLimitType;

    /**
     * <p>The priority of the device registration policy. A value of 0 indicates the highest priority. A value of 99 indicates the lowest priority.</p>
     * 
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <p>The status of the device registration policy. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: Disabled.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The IDs of user groups to which the device registration policy applies. Required if MatchMode is set to <strong>UserGroupNormal</strong>. A maximum of 100 user groups can be specified per policy.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The list of usernames in the whitelist for the device registration policy. You can specify up to 1,000 usernames.</p>
     */
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
