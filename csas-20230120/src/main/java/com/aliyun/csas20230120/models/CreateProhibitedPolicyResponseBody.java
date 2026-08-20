// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateProhibitedPolicyResponseBody extends TeaModel {
    /**
     * <p>The details of the software prohibition policy.</p>
     */
    @NameInMap("Policy")
    public CreateProhibitedPolicyResponseBodyPolicy policy;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>215060E3-03D2-548D-A014-17941EA3B6C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateProhibitedPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProhibitedPolicyResponseBody self = new CreateProhibitedPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProhibitedPolicyResponseBody setPolicy(CreateProhibitedPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public CreateProhibitedPolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public CreateProhibitedPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateProhibitedPolicyResponseBodyPolicySoftwareIds extends TeaModel {
        /**
         * <p>Indicates whether the banned software is a system built-in banned software. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The ID of the prohibited software. You can obtain the value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListProhibitedSoftware~~">ListProhibitedSoftware</a>: Lists prohibited software.</li>
         * <li><a href="~~CreateProhibitedSoftware~~">CreateProhibitedSoftware</a>: Creates custom prohibited software.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>swb-9a0bfde19662****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        public static CreateProhibitedPolicyResponseBodyPolicySoftwareIds build(java.util.Map<String, ?> map) throws Exception {
            CreateProhibitedPolicyResponseBodyPolicySoftwareIds self = new CreateProhibitedPolicyResponseBodyPolicySoftwareIds();
            return TeaModel.build(map, self);
        }

        public CreateProhibitedPolicyResponseBodyPolicySoftwareIds setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public CreateProhibitedPolicyResponseBodyPolicySoftwareIds setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

    }

    public static class CreateProhibitedPolicyResponseBodyPolicy extends TeaModel {
        /**
         * <p>Specifies whether end users are allowed to submit a report request for this policy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Reporting is allowed. The pop-up window on the endpoint provides a reporting entry.</li>
         * <li><strong>false</strong>: Reporting is not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowReport")
        public Boolean allowReport;

        /**
         * <p>The time when the software prohibition policy was created, in the yyyy-MM-dd HH:mm:ss format. The time is displayed in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-29 11:26:02</p>
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
         * <p>Indicates whether the policy is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled. The policy is delivered to the endpoint and takes effect.</li>
         * <li><strong>false</strong>: Disabled. The policy retains its configuration but is not delivered to the endpoint.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Specifies whether to forcibly terminate running software processes. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The terminal immediately terminates the running process of the software when the policy is hit.</li>
         * <li><strong>false</strong>: Running processes are not terminated. Only subsequent launches are blocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ForceKill")
        public Boolean forceKill;

        /**
         * <p>The Chinese text of the primary button in the pop-up window on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Submit Filing</p>
         */
        @NameInMap("MainButtonTextCh")
        public String mainButtonTextCh;

        /**
         * <p>The English text of the primary button in the pop-up window on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Report</p>
         */
        @NameInMap("MainButtonTextEn")
        public String mainButtonTextEn;

        /**
         * <p>The scope of the policy. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: The policy takes effect for all users under the current Alibaba Cloud account. You do not need to specify user groups.</li>
         * <li><strong>UserGroupNormal</strong>: The policy takes effect only for users in the user groups specified by UserGroupIds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        @NameInMap("MatchMode")
        public String matchMode;

        /**
         * <p>The Chinese text of the secondary button in the pop-up window on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Got It</p>
         */
        @NameInMap("MinorButtonTextCh")
        public String minorButtonTextCh;

        /**
         * <p>The English text of the secondary button in the pop-up window on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>I know</p>
         */
        @NameInMap("MinorButtonTextEn")
        public String minorButtonTextEn;

        /**
         * <p>The Policy Name of the software disable policy.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest_846acf98</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The object type of the controlled target. Valid values:</p>
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
         * <p>pid-dcbfd33cb004****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The action to take. Valid values:</p>
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
         * <p>The Chinese prompt content displayed in the pop-up window on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("PromptCh")
        public String promptCh;

        /**
         * <p>The English prompt content displayed in the pop-up window on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>L0 auto test prompt</p>
         */
        @NameInMap("PromptEn")
        public String promptEn;

        /**
         * <p>The collection of banned software directly controlled by this policy.</p>
         */
        @NameInMap("SoftwareIds")
        public java.util.List<CreateProhibitedPolicyResponseBodyPolicySoftwareIds> softwareIds;

        /**
         * <p>The collection of banned software tag IDs controlled by this policy.</p>
         */
        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        /**
         * <p>The Chinese title of the pop-up window on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Software Ban Reminder</p>
         */
        @NameInMap("TitleCh")
        public String titleCh;

        /**
         * <p>The English title of the pop-up window on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Software Blocked</p>
         */
        @NameInMap("TitleEn")
        public String titleEn;

        /**
         * <p>The IDs of the user groups to which the policy applies.</p>
         */
        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        /**
         * <p>The list of exempted usernames.</p>
         */
        @NameInMap("Whitelist")
        public java.util.List<String> whitelist;

        public static CreateProhibitedPolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateProhibitedPolicyResponseBodyPolicy self = new CreateProhibitedPolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public CreateProhibitedPolicyResponseBodyPolicy setAllowReport(Boolean allowReport) {
            this.allowReport = allowReport;
            return this;
        }
        public Boolean getAllowReport() {
            return this.allowReport;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setForceKill(Boolean forceKill) {
            this.forceKill = forceKill;
            return this;
        }
        public Boolean getForceKill() {
            return this.forceKill;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setMainButtonTextCh(String mainButtonTextCh) {
            this.mainButtonTextCh = mainButtonTextCh;
            return this;
        }
        public String getMainButtonTextCh() {
            return this.mainButtonTextCh;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setMainButtonTextEn(String mainButtonTextEn) {
            this.mainButtonTextEn = mainButtonTextEn;
            return this;
        }
        public String getMainButtonTextEn() {
            return this.mainButtonTextEn;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setMinorButtonTextCh(String minorButtonTextCh) {
            this.minorButtonTextCh = minorButtonTextCh;
            return this;
        }
        public String getMinorButtonTextCh() {
            return this.minorButtonTextCh;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setMinorButtonTextEn(String minorButtonTextEn) {
            this.minorButtonTextEn = minorButtonTextEn;
            return this;
        }
        public String getMinorButtonTextEn() {
            return this.minorButtonTextEn;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setPromptCh(String promptCh) {
            this.promptCh = promptCh;
            return this;
        }
        public String getPromptCh() {
            return this.promptCh;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setPromptEn(String promptEn) {
            this.promptEn = promptEn;
            return this;
        }
        public String getPromptEn() {
            return this.promptEn;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setSoftwareIds(java.util.List<CreateProhibitedPolicyResponseBodyPolicySoftwareIds> softwareIds) {
            this.softwareIds = softwareIds;
            return this;
        }
        public java.util.List<CreateProhibitedPolicyResponseBodyPolicySoftwareIds> getSoftwareIds() {
            return this.softwareIds;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setTitleCh(String titleCh) {
            this.titleCh = titleCh;
            return this;
        }
        public String getTitleCh() {
            return this.titleCh;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setTitleEn(String titleEn) {
            this.titleEn = titleEn;
            return this;
        }
        public String getTitleEn() {
            return this.titleEn;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public CreateProhibitedPolicyResponseBodyPolicy setWhitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<String> getWhitelist() {
            return this.whitelist;
        }

    }

}
