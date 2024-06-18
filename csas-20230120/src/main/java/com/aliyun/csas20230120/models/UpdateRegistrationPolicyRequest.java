// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateRegistrationPolicyRequest extends TeaModel {
    @NameInMap("CompanyLimitCount")
    public UpdateRegistrationPolicyRequestCompanyLimitCount companyLimitCount;

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
    public UpdateRegistrationPolicyRequestPersonalLimitCount personalLimitCount;

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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("All")
        public Integer all;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mobile")
        public Integer mobile;

        /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("All")
        public Integer all;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Mobile")
        public Integer mobile;

        /**
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
