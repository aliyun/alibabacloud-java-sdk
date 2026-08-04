// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateRegistrationPolicyRequest extends TeaModel {
    /**
     * <p>The registration limit for corporate devices.</p>
     */
    @NameInMap("CompanyLimitCount")
    public UpdateRegistrationPolicyRequestCompanyLimitCount companyLimitCount;

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
    public UpdateRegistrationPolicyRequestPersonalLimitCount personalLimitCount;

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

    public static UpdateRegistrationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRegistrationPolicyRequest self = new UpdateRegistrationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRegistrationPolicyRequest setCompanyLimitCount(UpdateRegistrationPolicyRequestCompanyLimitCount companyLimitCount) {
        this.companyLimitCount = companyLimitCount;
        return this;
    }
    public UpdateRegistrationPolicyRequestCompanyLimitCount getCompanyLimitCount() {
        return this.companyLimitCount;
    }

    public UpdateRegistrationPolicyRequest setCompanyLimitType(String companyLimitType) {
        this.companyLimitType = companyLimitType;
        return this;
    }
    public String getCompanyLimitType() {
        return this.companyLimitType;
    }

    public UpdateRegistrationPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateRegistrationPolicyRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public UpdateRegistrationPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRegistrationPolicyRequest setPersonalLimitCount(UpdateRegistrationPolicyRequestPersonalLimitCount personalLimitCount) {
        this.personalLimitCount = personalLimitCount;
        return this;
    }
    public UpdateRegistrationPolicyRequestPersonalLimitCount getPersonalLimitCount() {
        return this.personalLimitCount;
    }

    public UpdateRegistrationPolicyRequest setPersonalLimitType(String personalLimitType) {
        this.personalLimitType = personalLimitType;
        return this;
    }
    public String getPersonalLimitType() {
        return this.personalLimitType;
    }

    public UpdateRegistrationPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdateRegistrationPolicyRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public UpdateRegistrationPolicyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateRegistrationPolicyRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public UpdateRegistrationPolicyRequest setWhitelist(java.util.List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

    public static class UpdateRegistrationPolicyRequestCompanyLimitCount extends TeaModel {
        /**
         * <p>The total number of corporate devices that can be registered. The value can be from 0 to 100. The default value is 0. This parameter is valid only when CompanyLimitType is set to <strong>LimitAll</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("All")
        public Integer all;

        /**
         * <p>The number of corporate mobile devices that can be registered. The value can be from 0 to 100. The default value is 0. This parameter is valid only when CompanyLimitType is set to <strong>LimitDiff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mobile")
        public Integer mobile;

        /**
         * <p>The number of corporate PCs that can be registered. The value can be from 0 to 100. The default value is 0. This parameter is valid only when CompanyLimitType is set to <strong>LimitDiff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PC")
        public Integer PC;

        public static UpdateRegistrationPolicyRequestCompanyLimitCount build(java.util.Map<String, ?> map) throws Exception {
            UpdateRegistrationPolicyRequestCompanyLimitCount self = new UpdateRegistrationPolicyRequestCompanyLimitCount();
            return TeaModel.build(map, self);
        }

        public UpdateRegistrationPolicyRequestCompanyLimitCount setAll(Integer all) {
            this.all = all;
            return this;
        }
        public Integer getAll() {
            return this.all;
        }

        public UpdateRegistrationPolicyRequestCompanyLimitCount setMobile(Integer mobile) {
            this.mobile = mobile;
            return this;
        }
        public Integer getMobile() {
            return this.mobile;
        }

        public UpdateRegistrationPolicyRequestCompanyLimitCount setPC(Integer PC) {
            this.PC = PC;
            return this;
        }
        public Integer getPC() {
            return this.PC;
        }

    }

    public static class UpdateRegistrationPolicyRequestPersonalLimitCount extends TeaModel {
        /**
         * <p>The total number of personal devices that can be registered. The value can be from 0 to 100. The default value is 0. This parameter is valid only when PersonalLimitType is set to <strong>LimitAll</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("All")
        public Integer all;

        /**
         * <p>The number of personal mobile devices that can be registered. The value can be from 0 to 100. The default value is 0. This parameter is valid only when PersonalLimitType is set to <strong>LimitDiff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Mobile")
        public Integer mobile;

        /**
         * <p>The number of personal PCs that can be registered. The value can be from 0 to 100. The default value is 0. This parameter is valid only when PersonalLimitType is set to <strong>LimitDiff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PC")
        public Integer PC;

        public static UpdateRegistrationPolicyRequestPersonalLimitCount build(java.util.Map<String, ?> map) throws Exception {
            UpdateRegistrationPolicyRequestPersonalLimitCount self = new UpdateRegistrationPolicyRequestPersonalLimitCount();
            return TeaModel.build(map, self);
        }

        public UpdateRegistrationPolicyRequestPersonalLimitCount setAll(Integer all) {
            this.all = all;
            return this;
        }
        public Integer getAll() {
            return this.all;
        }

        public UpdateRegistrationPolicyRequestPersonalLimitCount setMobile(Integer mobile) {
            this.mobile = mobile;
            return this;
        }
        public Integer getMobile() {
            return this.mobile;
        }

        public UpdateRegistrationPolicyRequestPersonalLimitCount setPC(Integer PC) {
            this.PC = PC;
            return this;
        }
        public Integer getPC() {
            return this.PC;
        }

    }

}
