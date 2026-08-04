// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateRegistrationPolicyRequest extends TeaModel {
    /**
     * <p>The restriction count for company devices.</p>
     */
    @NameInMap("CompanyLimitCount")
    public CreateRegistrationPolicyRequestCompanyLimitCount companyLimitCount;

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
    public CreateRegistrationPolicyRequestPersonalLimitCount personalLimitCount;

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

    public static CreateRegistrationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRegistrationPolicyRequest self = new CreateRegistrationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateRegistrationPolicyRequest setCompanyLimitCount(CreateRegistrationPolicyRequestCompanyLimitCount companyLimitCount) {
        this.companyLimitCount = companyLimitCount;
        return this;
    }
    public CreateRegistrationPolicyRequestCompanyLimitCount getCompanyLimitCount() {
        return this.companyLimitCount;
    }

    public CreateRegistrationPolicyRequest setCompanyLimitType(String companyLimitType) {
        this.companyLimitType = companyLimitType;
        return this;
    }
    public String getCompanyLimitType() {
        return this.companyLimitType;
    }

    public CreateRegistrationPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRegistrationPolicyRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public CreateRegistrationPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRegistrationPolicyRequest setPersonalLimitCount(CreateRegistrationPolicyRequestPersonalLimitCount personalLimitCount) {
        this.personalLimitCount = personalLimitCount;
        return this;
    }
    public CreateRegistrationPolicyRequestPersonalLimitCount getPersonalLimitCount() {
        return this.personalLimitCount;
    }

    public CreateRegistrationPolicyRequest setPersonalLimitType(String personalLimitType) {
        this.personalLimitType = personalLimitType;
        return this;
    }
    public String getPersonalLimitType() {
        return this.personalLimitType;
    }

    public CreateRegistrationPolicyRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public CreateRegistrationPolicyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateRegistrationPolicyRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public CreateRegistrationPolicyRequest setWhitelist(java.util.List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

    public static class CreateRegistrationPolicyRequestCompanyLimitCount extends TeaModel {
        /**
         * <p>The total restriction count for company devices. Valid values: 0 to 100. Default value: 0. This parameter takes effect only when CompanyLimitType is set to <strong>LimitAll</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("All")
        public Integer all;

        /**
         * <p>The restriction count for mobile logins by company devices. Valid values: 0 to 100. Default value: 0. This parameter takes effect only when CompanyLimitType is set to <strong>LimitDiff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mobile")
        public Integer mobile;

        /**
         * <p>The restriction count for PC logins by company devices. Valid values: 0 to 100. Default value: 0. This parameter takes effect only when CompanyLimitType is set to <strong>LimitDiff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PC")
        public Integer PC;

        public static CreateRegistrationPolicyRequestCompanyLimitCount build(java.util.Map<String, ?> map) throws Exception {
            CreateRegistrationPolicyRequestCompanyLimitCount self = new CreateRegistrationPolicyRequestCompanyLimitCount();
            return TeaModel.build(map, self);
        }

        public CreateRegistrationPolicyRequestCompanyLimitCount setAll(Integer all) {
            this.all = all;
            return this;
        }
        public Integer getAll() {
            return this.all;
        }

        public CreateRegistrationPolicyRequestCompanyLimitCount setMobile(Integer mobile) {
            this.mobile = mobile;
            return this;
        }
        public Integer getMobile() {
            return this.mobile;
        }

        public CreateRegistrationPolicyRequestCompanyLimitCount setPC(Integer PC) {
            this.PC = PC;
            return this;
        }
        public Integer getPC() {
            return this.PC;
        }

    }

    public static class CreateRegistrationPolicyRequestPersonalLimitCount extends TeaModel {
        /**
         * <p>The total restriction count for personal devices. Valid values: 0 to 100. Default value: 0. This parameter takes effect only when PersonalLimitType is set to <strong>LimitAll</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("All")
        public Integer all;

        /**
         * <p>The restriction count for mobile logins by personal devices. Valid values: 0 to 100. Default value: 0. This parameter takes effect only when PersonalLimitType is set to <strong>LimitDiff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Mobile")
        public Integer mobile;

        /**
         * <p>The restriction count for PC logins by personal devices. Valid values: 0 to 100. Default value: 0. This parameter takes effect only when PersonalLimitType is set to <strong>LimitDiff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PC")
        public Integer PC;

        public static CreateRegistrationPolicyRequestPersonalLimitCount build(java.util.Map<String, ?> map) throws Exception {
            CreateRegistrationPolicyRequestPersonalLimitCount self = new CreateRegistrationPolicyRequestPersonalLimitCount();
            return TeaModel.build(map, self);
        }

        public CreateRegistrationPolicyRequestPersonalLimitCount setAll(Integer all) {
            this.all = all;
            return this;
        }
        public Integer getAll() {
            return this.all;
        }

        public CreateRegistrationPolicyRequestPersonalLimitCount setMobile(Integer mobile) {
            this.mobile = mobile;
            return this;
        }
        public Integer getMobile() {
            return this.mobile;
        }

        public CreateRegistrationPolicyRequestPersonalLimitCount setPC(Integer PC) {
            this.PC = PC;
            return this;
        }
        public Integer getPC() {
            return this.PC;
        }

    }

}
