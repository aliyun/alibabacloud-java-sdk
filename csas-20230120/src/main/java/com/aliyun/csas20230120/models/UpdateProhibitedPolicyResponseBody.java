// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateProhibitedPolicyResponseBody extends TeaModel {
    /**
     * <p>The details of the software prohibition policy.</p>
     */
    @NameInMap("Policy")
    public UpdateProhibitedPolicyResponseBodyPolicy policy;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C4F48DD4-B70D-5342-80B9-2BF5498262FF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateProhibitedPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProhibitedPolicyResponseBody self = new UpdateProhibitedPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProhibitedPolicyResponseBody setPolicy(UpdateProhibitedPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public UpdateProhibitedPolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public UpdateProhibitedPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateProhibitedPolicyResponseBodyPolicySoftwareIds extends TeaModel {
        /**
         * <p>Indicates whether the prohibited software is a system built-in entry. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A system built-in prohibited software entry shared across all Alibaba Cloud accounts. It cannot be modified or deleted.</li>
         * <li><strong>false</strong>: A custom prohibited software entry under the current Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The ID of the prohibited software.</p>
         * 
         * <strong>example:</strong>
         * <p>swb-f024ee962344****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        public static UpdateProhibitedPolicyResponseBodyPolicySoftwareIds build(java.util.Map<String, ?> map) throws Exception {
            UpdateProhibitedPolicyResponseBodyPolicySoftwareIds self = new UpdateProhibitedPolicyResponseBodyPolicySoftwareIds();
            return TeaModel.build(map, self);
        }

        public UpdateProhibitedPolicyResponseBodyPolicySoftwareIds setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public UpdateProhibitedPolicyResponseBodyPolicySoftwareIds setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

    }

    public static class UpdateProhibitedPolicyResponseBodyPolicy extends TeaModel {
        /**
         * <p>Specifies whether endpoint users are allowed to submit a filing request for this policy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Filing is allowed. A filing entry is provided in the pop-up notification on the endpoint.</li>
         * <li><strong>false</strong>: Filing is not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowReport")
        public Boolean allowReport;

        /**
         * <p>The time when the software prohibition policy was created, in the yyyy-MM-dd HH:mm:ss format. The time is in the UTC+8 time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-19 10:24:31</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the software prohibition policy.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether the policy is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled. The policy is delivered to endpoints and takes effect.</li>
         * <li><strong>false</strong>: Disabled. The policy configuration is retained but not delivered to endpoints.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Specifies whether to forcibly terminate running software processes. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The endpoint immediately terminates the running processes of the software when the policy is triggered.</li>
         * <li><strong>false</strong>: Running processes are not terminated. Only subsequent launches are blocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ForceKill")
        public Boolean forceKill;

        /**
         * <p>The Chinese text of the primary button in the pop-up notification on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Submit Filing</p>
         */
        @NameInMap("MainButtonTextCh")
        public String mainButtonTextCh;

        /**
         * <p>The English text of the primary button in the pop-up notification on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Report</p>
         */
        @NameInMap("MainButtonTextEn")
        public String mainButtonTextEn;

        /**
         * <p>The scope in which the policy takes effect. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: Takes effect for all users under the current Alibaba Cloud account. No user group needs to be specified.</li>
         * <li><strong>UserGroupNormal</strong>: Takes effect only for users in the user groups specified by UserGroupIds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        @NameInMap("MatchMode")
        public String matchMode;

        /**
         * <p>The Chinese text of the secondary button in the pop-up notification on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Got It</p>
         */
        @NameInMap("MinorButtonTextCh")
        public String minorButtonTextCh;

        /**
         * <p>The English text of the secondary button in the pop-up notification on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>I know</p>
         */
        @NameInMap("MinorButtonTextEn")
        public String minorButtonTextEn;

        /**
         * <p>The name of the software prohibition policy.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest_c51af82d</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The object type. Valid values:</p>
         * <ul>
         * <li><strong>App</strong>: Controls by prohibited software. The controlled objects are specified by SoftwareIds.</li>
         * <li><strong>Tag</strong>: Controls by prohibited software tag. The controlled objects are specified by TagIds. All prohibited software under the specified tags is controlled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>App</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The ID of the software prohibition policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pid-ef8eb37cff62****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The action to take. Valid values:</p>
         * <ul>
         * <li><strong>Ban</strong>: Blocks the software from running and displays a pop-up notification on the endpoint to alert the user.</li>
         * <li><strong>BanSilent</strong>: Blocks the software from running without notifying the user (silent blocking).</li>
         * <li><strong>Warn</strong>: Displays a pop-up notification on the endpoint to alert the user without blocking the software from running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ban</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The policy priority. Valid values: 0 to 99. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The Chinese prompt content displayed in the pop-up notification on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("PromptCh")
        public String promptCh;

        /**
         * <p>The English prompt content displayed in the pop-up notification on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>After analysis and monitoring, the software has been disabled as a security risk.</p>
         */
        @NameInMap("PromptEn")
        public String promptEn;

        /**
         * <p>The collection of prohibited software directly controlled by this policy.</p>
         */
        @NameInMap("SoftwareIds")
        public java.util.List<UpdateProhibitedPolicyResponseBodyPolicySoftwareIds> softwareIds;

        /**
         * <p>The collection of prohibited software tag IDs controlled by this policy.</p>
         */
        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        /**
         * <p>The Chinese title of the pop-up notification on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Software Prohibition Reminder</p>
         */
        @NameInMap("TitleCh")
        public String titleCh;

        /**
         * <p>The English title of the pop-up notification on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Software Blocked</p>
         */
        @NameInMap("TitleEn")
        public String titleEn;

        /**
         * <p>The collection of user group IDs for which the policy takes effect.</p>
         */
        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        /**
         * <p>The list of exempted usernames.</p>
         */
        @NameInMap("Whitelist")
        public java.util.List<String> whitelist;

        public static UpdateProhibitedPolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateProhibitedPolicyResponseBodyPolicy self = new UpdateProhibitedPolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setAllowReport(Boolean allowReport) {
            this.allowReport = allowReport;
            return this;
        }
        public Boolean getAllowReport() {
            return this.allowReport;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setForceKill(Boolean forceKill) {
            this.forceKill = forceKill;
            return this;
        }
        public Boolean getForceKill() {
            return this.forceKill;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setMainButtonTextCh(String mainButtonTextCh) {
            this.mainButtonTextCh = mainButtonTextCh;
            return this;
        }
        public String getMainButtonTextCh() {
            return this.mainButtonTextCh;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setMainButtonTextEn(String mainButtonTextEn) {
            this.mainButtonTextEn = mainButtonTextEn;
            return this;
        }
        public String getMainButtonTextEn() {
            return this.mainButtonTextEn;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setMinorButtonTextCh(String minorButtonTextCh) {
            this.minorButtonTextCh = minorButtonTextCh;
            return this;
        }
        public String getMinorButtonTextCh() {
            return this.minorButtonTextCh;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setMinorButtonTextEn(String minorButtonTextEn) {
            this.minorButtonTextEn = minorButtonTextEn;
            return this;
        }
        public String getMinorButtonTextEn() {
            return this.minorButtonTextEn;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setPromptCh(String promptCh) {
            this.promptCh = promptCh;
            return this;
        }
        public String getPromptCh() {
            return this.promptCh;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setPromptEn(String promptEn) {
            this.promptEn = promptEn;
            return this;
        }
        public String getPromptEn() {
            return this.promptEn;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setSoftwareIds(java.util.List<UpdateProhibitedPolicyResponseBodyPolicySoftwareIds> softwareIds) {
            this.softwareIds = softwareIds;
            return this;
        }
        public java.util.List<UpdateProhibitedPolicyResponseBodyPolicySoftwareIds> getSoftwareIds() {
            return this.softwareIds;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setTitleCh(String titleCh) {
            this.titleCh = titleCh;
            return this;
        }
        public String getTitleCh() {
            return this.titleCh;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setTitleEn(String titleEn) {
            this.titleEn = titleEn;
            return this;
        }
        public String getTitleEn() {
            return this.titleEn;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public UpdateProhibitedPolicyResponseBodyPolicy setWhitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<String> getWhitelist() {
            return this.whitelist;
        }

    }

}
