// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateProhibitedPolicyRequest extends TeaModel {
    /**
     * <p>Specifies whether endpoint users are allowed to submit a filing request for this policy. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Filing is allowed. A filing entry is provided in the pop-up notification on the endpoint.</li>
     * <li><strong>false</strong>: Filing is not allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowReport")
    public String allowReport;

    /**
     * <p>The description of the software prohibition policy. The description can contain Chinese characters, uppercase and lowercase letters, digits, spaces, periods (.), underscores (_), and hyphens (-). The description can be up to 128 characters in length and can be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>No description</p>
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
     * <p>Policy Name of the software prohibition policy. Policy Name must be 1 to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ProhibitionPolicy</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pid-6a9f6adbee0a****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The action to take. If this parameter is not specified, the original value is retained. Valid values:</p>
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
     * <p>99</p>
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
     * <p>test</p>
     */
    @NameInMap("PromptEn")
    public String promptEn;

    /**
     * <p>The collection of prohibited software directly controlled by this policy.</p>
     */
    @NameInMap("SoftwareIds")
    public java.util.List<UpdateProhibitedPolicyRequestSoftwareIds> softwareIds;

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
     * <p>The collection of user group IDs for which the policy takes effect. Duplicate values are not allowed.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The list of exempted usernames. Duplicate values are not allowed.</p>
     */
    @NameInMap("Whitelist")
    public java.util.List<String> whitelist;

    public static UpdateProhibitedPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProhibitedPolicyRequest self = new UpdateProhibitedPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProhibitedPolicyRequest setAllowReport(String allowReport) {
        this.allowReport = allowReport;
        return this;
    }
    public String getAllowReport() {
        return this.allowReport;
    }

    public UpdateProhibitedPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProhibitedPolicyRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateProhibitedPolicyRequest setForceKill(Boolean forceKill) {
        this.forceKill = forceKill;
        return this;
    }
    public Boolean getForceKill() {
        return this.forceKill;
    }

    public UpdateProhibitedPolicyRequest setMainButtonTextCh(String mainButtonTextCh) {
        this.mainButtonTextCh = mainButtonTextCh;
        return this;
    }
    public String getMainButtonTextCh() {
        return this.mainButtonTextCh;
    }

    public UpdateProhibitedPolicyRequest setMainButtonTextEn(String mainButtonTextEn) {
        this.mainButtonTextEn = mainButtonTextEn;
        return this;
    }
    public String getMainButtonTextEn() {
        return this.mainButtonTextEn;
    }

    public UpdateProhibitedPolicyRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public UpdateProhibitedPolicyRequest setMinorButtonTextCh(String minorButtonTextCh) {
        this.minorButtonTextCh = minorButtonTextCh;
        return this;
    }
    public String getMinorButtonTextCh() {
        return this.minorButtonTextCh;
    }

    public UpdateProhibitedPolicyRequest setMinorButtonTextEn(String minorButtonTextEn) {
        this.minorButtonTextEn = minorButtonTextEn;
        return this;
    }
    public String getMinorButtonTextEn() {
        return this.minorButtonTextEn;
    }

    public UpdateProhibitedPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateProhibitedPolicyRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public UpdateProhibitedPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdateProhibitedPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public UpdateProhibitedPolicyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateProhibitedPolicyRequest setPromptCh(String promptCh) {
        this.promptCh = promptCh;
        return this;
    }
    public String getPromptCh() {
        return this.promptCh;
    }

    public UpdateProhibitedPolicyRequest setPromptEn(String promptEn) {
        this.promptEn = promptEn;
        return this;
    }
    public String getPromptEn() {
        return this.promptEn;
    }

    public UpdateProhibitedPolicyRequest setSoftwareIds(java.util.List<UpdateProhibitedPolicyRequestSoftwareIds> softwareIds) {
        this.softwareIds = softwareIds;
        return this;
    }
    public java.util.List<UpdateProhibitedPolicyRequestSoftwareIds> getSoftwareIds() {
        return this.softwareIds;
    }

    public UpdateProhibitedPolicyRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    public UpdateProhibitedPolicyRequest setTitleCh(String titleCh) {
        this.titleCh = titleCh;
        return this;
    }
    public String getTitleCh() {
        return this.titleCh;
    }

    public UpdateProhibitedPolicyRequest setTitleEn(String titleEn) {
        this.titleEn = titleEn;
        return this;
    }
    public String getTitleEn() {
        return this.titleEn;
    }

    public UpdateProhibitedPolicyRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public UpdateProhibitedPolicyRequest setWhitelist(java.util.List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

    public static class UpdateProhibitedPolicyRequestSoftwareIds extends TeaModel {
        /**
         * <p>Indicates whether the prohibited software is a system built-in entry. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A system built-in prohibited software entry shared across all Alibaba Cloud accounts. It cannot be modified or deleted.</li>
         * <li><strong>false</strong>: A custom prohibited software entry under the current Alibaba Cloud account.</li>
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
         * <p>swb-23d749361c41****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        public static UpdateProhibitedPolicyRequestSoftwareIds build(java.util.Map<String, ?> map) throws Exception {
            UpdateProhibitedPolicyRequestSoftwareIds self = new UpdateProhibitedPolicyRequestSoftwareIds();
            return TeaModel.build(map, self);
        }

        public UpdateProhibitedPolicyRequestSoftwareIds setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public UpdateProhibitedPolicyRequestSoftwareIds setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

    }

}
