// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateProhibitedPolicyRequest extends TeaModel {
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
    public String allowReport;

    /**
     * <p>The description of the software ban policy. The description can be up to 128 characters in length and can be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>project name pass the check</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the policy is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled. The policy is delivered to the endpoint and takes effect.</li>
     * <li><strong>false</strong>: Disabled. The policy configuration is retained but not delivered to the endpoint.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>Specifies whether to forcefully terminate running software processes. Valid values:</p>
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
     * <p>The scope in which the policy takes effect. Valid values:</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UserGroupAll</p>
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
     * <p>Policy Name of the software ban policy. Policy Name must be 1 to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>autotest_a0344d22</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The object type. Valid values:</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>App</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The action to take. Valid values:</p>
     * <ul>
     * <li><strong>Ban</strong>: Blocks the software from running and displays a pop-up notification to the end user.</li>
     * <li><strong>BanSilent</strong>: Blocks the software from running without notifying the end user (silent blocking).</li>
     * <li><strong>Warn</strong>: Displays a pop-up notification to the end user without blocking the software from running.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Warn</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The policy priority. Valid values: 0 to 99. A smaller value indicates a higher priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The Chinese prompt content displayed in the pop-up window on the endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("PromptCh")
    public String promptCh;

    /**
     * <p>The English prompt content displayed in the pop-up window on the endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Auto test prohibition prompt</p>
     */
    @NameInMap("PromptEn")
    public String promptEn;

    /**
     * <p>The collection of banned software directly controlled by this policy.</p>
     */
    @NameInMap("SoftwareIds")
    public java.util.List<CreateProhibitedPolicyRequestSoftwareIds> softwareIds;

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
     * <p>The collection of user group IDs for which the policy takes effect.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The list of exempted usernames.</p>
     */
    @NameInMap("Whitelist")
    public java.util.List<String> whitelist;

    public static CreateProhibitedPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProhibitedPolicyRequest self = new CreateProhibitedPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateProhibitedPolicyRequest setAllowReport(String allowReport) {
        this.allowReport = allowReport;
        return this;
    }
    public String getAllowReport() {
        return this.allowReport;
    }

    public CreateProhibitedPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProhibitedPolicyRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateProhibitedPolicyRequest setForceKill(Boolean forceKill) {
        this.forceKill = forceKill;
        return this;
    }
    public Boolean getForceKill() {
        return this.forceKill;
    }

    public CreateProhibitedPolicyRequest setMainButtonTextCh(String mainButtonTextCh) {
        this.mainButtonTextCh = mainButtonTextCh;
        return this;
    }
    public String getMainButtonTextCh() {
        return this.mainButtonTextCh;
    }

    public CreateProhibitedPolicyRequest setMainButtonTextEn(String mainButtonTextEn) {
        this.mainButtonTextEn = mainButtonTextEn;
        return this;
    }
    public String getMainButtonTextEn() {
        return this.mainButtonTextEn;
    }

    public CreateProhibitedPolicyRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public CreateProhibitedPolicyRequest setMinorButtonTextCh(String minorButtonTextCh) {
        this.minorButtonTextCh = minorButtonTextCh;
        return this;
    }
    public String getMinorButtonTextCh() {
        return this.minorButtonTextCh;
    }

    public CreateProhibitedPolicyRequest setMinorButtonTextEn(String minorButtonTextEn) {
        this.minorButtonTextEn = minorButtonTextEn;
        return this;
    }
    public String getMinorButtonTextEn() {
        return this.minorButtonTextEn;
    }

    public CreateProhibitedPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProhibitedPolicyRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public CreateProhibitedPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public CreateProhibitedPolicyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateProhibitedPolicyRequest setPromptCh(String promptCh) {
        this.promptCh = promptCh;
        return this;
    }
    public String getPromptCh() {
        return this.promptCh;
    }

    public CreateProhibitedPolicyRequest setPromptEn(String promptEn) {
        this.promptEn = promptEn;
        return this;
    }
    public String getPromptEn() {
        return this.promptEn;
    }

    public CreateProhibitedPolicyRequest setSoftwareIds(java.util.List<CreateProhibitedPolicyRequestSoftwareIds> softwareIds) {
        this.softwareIds = softwareIds;
        return this;
    }
    public java.util.List<CreateProhibitedPolicyRequestSoftwareIds> getSoftwareIds() {
        return this.softwareIds;
    }

    public CreateProhibitedPolicyRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    public CreateProhibitedPolicyRequest setTitleCh(String titleCh) {
        this.titleCh = titleCh;
        return this;
    }
    public String getTitleCh() {
        return this.titleCh;
    }

    public CreateProhibitedPolicyRequest setTitleEn(String titleEn) {
        this.titleEn = titleEn;
        return this;
    }
    public String getTitleEn() {
        return this.titleEn;
    }

    public CreateProhibitedPolicyRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public CreateProhibitedPolicyRequest setWhitelist(java.util.List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

    public static class CreateProhibitedPolicyRequestSoftwareIds extends TeaModel {
        /**
         * <p>Specifies whether the blocked software is a built-in blocked software entry. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A built-in blocked software entry that is shared across all Alibaba Cloud accounts. Built-in entries cannot be modified or deleted.</li>
         * <li><strong>false</strong>: A custom blocked software entry under the current Alibaba Cloud account.</li>
         * </ul>
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
         * <p>swb-df1fa76d889b****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        public static CreateProhibitedPolicyRequestSoftwareIds build(java.util.Map<String, ?> map) throws Exception {
            CreateProhibitedPolicyRequestSoftwareIds self = new CreateProhibitedPolicyRequestSoftwareIds();
            return TeaModel.build(map, self);
        }

        public CreateProhibitedPolicyRequestSoftwareIds setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public CreateProhibitedPolicyRequestSoftwareIds setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

    }

}
