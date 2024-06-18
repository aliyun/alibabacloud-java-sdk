// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateRegistrationPolicyRequest extends TeaModel {
    @NameInMap("CompanyLimitCount")
    public CreateRegistrationPolicyRequestCompanyLimitCount companyLimitCount;

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
    public CreateRegistrationPolicyRequestPersonalLimitCount personalLimitCount;

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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("All")
        public Integer all;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Mobile")
        public Integer mobile;

        /**
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
