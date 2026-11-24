// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetProhibitedPolicyResponseBody extends TeaModel {
    /**
     * <p>The details of the prohibited software policy.</p>
     */
    @NameInMap("Policy")
    public GetProhibitedPolicyResponseBodyPolicy policy;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E966413B-7538-5332-99B4-C3DA016B9453</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetProhibitedPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProhibitedPolicyResponseBody self = new GetProhibitedPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProhibitedPolicyResponseBody setPolicy(GetProhibitedPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public GetProhibitedPolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public GetProhibitedPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProhibitedPolicyResponseBodyPolicySoftwareIds extends TeaModel {
        /**
         * <p>Indicates whether the prohibited software is a built-in prohibited software. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The software is a built-in prohibited software that is shared by all Alibaba Cloud accounts and cannot be modified or deleted.</li>
         * <li><strong>false</strong>: The software is a custom prohibited software under the current Alibaba Cloud account.</li>
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
         * <p>swb-050216aafaae****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        public static GetProhibitedPolicyResponseBodyPolicySoftwareIds build(java.util.Map<String, ?> map) throws Exception {
            GetProhibitedPolicyResponseBodyPolicySoftwareIds self = new GetProhibitedPolicyResponseBodyPolicySoftwareIds();
            return TeaModel.build(map, self);
        }

        public GetProhibitedPolicyResponseBodyPolicySoftwareIds setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public GetProhibitedPolicyResponseBodyPolicySoftwareIds setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

    }

    public static class GetProhibitedPolicyResponseBodyPolicy extends TeaModel {
        /**
         * <p>Indicates whether terminal users are allowed to submit applications for this policy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Applications are allowed. The terminal pop-up window provides an entry for submitting applications.</li>
         * <li><strong>false</strong>: Applications are not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowReport")
        public Boolean allowReport;

        /**
         * <p>The time when the prohibited software policy was created. The time is displayed in the yyyy-MM-dd HH:mm:ss format and uses the UTC+8 time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-29 11:26:02</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the prohibited software policy.</p>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the policy is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The policy is enabled, delivered to terminals, and takes effect.</li>
         * <li><strong>false</strong>: The policy is disabled. The configuration is retained but not delivered to terminals.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Indicates whether to forcibly terminate running software processes. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The terminal immediately terminates the running processes of the software when the policy is matched.</li>
         * <li><strong>false</strong>: The terminal does not terminate running processes but only prevents subsequent startups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ForceKill")
        public Boolean forceKill;

        /**
         * <p>The Chinese text of the primary button in the terminal pop-up window.</p>
         * 
         * <strong>example:</strong>
         * <p>前往报备</p>
         */
        @NameInMap("MainButtonTextCh")
        public String mainButtonTextCh;

        /**
         * <p>The English text of the primary button in the terminal pop-up window.</p>
         * 
         * <strong>example:</strong>
         * <p>Report</p>
         */
        @NameInMap("MainButtonTextEn")
        public String mainButtonTextEn;

        /**
         * <p>The target matching mode of the policy. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: Applies to all users.</li>
         * <li><strong>UserGroupNormal</strong>: Applies to specific user groups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        @NameInMap("MatchMode")
        public String matchMode;

        /**
         * <p>The Chinese text of the secondary button in the terminal pop-up window.</p>
         * 
         * <strong>example:</strong>
         * <p>我知道了</p>
         */
        @NameInMap("MinorButtonTextCh")
        public String minorButtonTextCh;

        /**
         * <p>The English text of the secondary button in the terminal pop-up window.</p>
         * 
         * <strong>example:</strong>
         * <p>I know</p>
         */
        @NameInMap("MinorButtonTextEn")
        public String minorButtonTextEn;

        /**
         * <p>The name of the prohibited software policy.</p>
         * 
         * <strong>example:</strong>
         * <p>PolicyC</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The managed object type. Valid values:</p>
         * <ul>
         * <li><strong>App</strong>: Managed by prohibited software. The managed objects are specified by SoftwareIds.</li>
         * <li><strong>Tag</strong>: Managed by prohibited software tag. The managed objects are specified by TagIds, and all prohibited software under the tag is managed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>App</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The ID of the prohibited software policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pid-36ee4a5869f3****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The enforcement action. Valid values:</p>
         * <ul>
         * <li><strong>Ban</strong>: Blocks the software from running and displays a pop-up window to notify the terminal user.</li>
         * <li><strong>BanSilent</strong>: Blocks the software from running silently without notifying the terminal user.</li>
         * <li><strong>Warn</strong>: Displays a pop-up window to notify the terminal user without blocking the software from running.</li>
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
         * <p>The Chinese prompt content in the terminal pop-up window.</p>
         * 
         * <strong>example:</strong>
         * <p>该软件已被企业安全策略禁止运行，如需使用请提交报备申请</p>
         */
        @NameInMap("PromptCh")
        public String promptCh;

        /**
         * <p>The English prompt content in the terminal pop-up window.</p>
         * 
         * <strong>example:</strong>
         * <p>This software is blocked by your enterprise security policy.</p>
         */
        @NameInMap("PromptEn")
        public String promptEn;

        /**
         * <p>The ID of the approval process bound to the policy. If no approval process is bound, an empty string is returned, and applications submitted by terminal users are approved by the IT administrator. You can bind an approval process by calling <a href="~~AttachPolicy2ApprovalProcess~~">AttachPolicy2ApprovalProcess</a> and unbind it by calling <a href="~~DetachPolicy2ApprovalProcess~~">DetachPolicy2ApprovalProcess</a>. You can obtain the value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListApprovalProcesses~~">ListApprovalProcesses</a>: Lists approval processes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>approval-process-6c2f8a1b7d3e****</p>
         */
        @NameInMap("ReportProcessId")
        public String reportProcessId;

        /**
         * <p>The list of prohibited software directly managed by the policy.</p>
         */
        @NameInMap("SoftwareIds")
        public java.util.List<GetProhibitedPolicyResponseBodyPolicySoftwareIds> softwareIds;

        /**
         * <p>The list of prohibited software tag IDs managed by the policy.</p>
         */
        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        /**
         * <p>The Chinese title of the terminal pop-up window.</p>
         * 
         * <strong>example:</strong>
         * <p>软件禁用提醒</p>
         */
        @NameInMap("TitleCh")
        public String titleCh;

        /**
         * <p>The English title of the terminal pop-up window.</p>
         * 
         * <strong>example:</strong>
         * <p>Software Blocked</p>
         */
        @NameInMap("TitleEn")
        public String titleEn;

        /**
         * <p>The list of user group IDs to which the policy applies.</p>
         */
        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        /**
         * <p>The list of exempted usernames.</p>
         */
        @NameInMap("Whitelist")
        public java.util.List<String> whitelist;

        public static GetProhibitedPolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetProhibitedPolicyResponseBodyPolicy self = new GetProhibitedPolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public GetProhibitedPolicyResponseBodyPolicy setAllowReport(Boolean allowReport) {
            this.allowReport = allowReport;
            return this;
        }
        public Boolean getAllowReport() {
            return this.allowReport;
        }

        public GetProhibitedPolicyResponseBodyPolicy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProhibitedPolicyResponseBodyPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProhibitedPolicyResponseBodyPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetProhibitedPolicyResponseBodyPolicy setForceKill(Boolean forceKill) {
            this.forceKill = forceKill;
            return this;
        }
        public Boolean getForceKill() {
            return this.forceKill;
        }

        public GetProhibitedPolicyResponseBodyPolicy setMainButtonTextCh(String mainButtonTextCh) {
            this.mainButtonTextCh = mainButtonTextCh;
            return this;
        }
        public String getMainButtonTextCh() {
            return this.mainButtonTextCh;
        }

        public GetProhibitedPolicyResponseBodyPolicy setMainButtonTextEn(String mainButtonTextEn) {
            this.mainButtonTextEn = mainButtonTextEn;
            return this;
        }
        public String getMainButtonTextEn() {
            return this.mainButtonTextEn;
        }

        public GetProhibitedPolicyResponseBodyPolicy setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public GetProhibitedPolicyResponseBodyPolicy setMinorButtonTextCh(String minorButtonTextCh) {
            this.minorButtonTextCh = minorButtonTextCh;
            return this;
        }
        public String getMinorButtonTextCh() {
            return this.minorButtonTextCh;
        }

        public GetProhibitedPolicyResponseBodyPolicy setMinorButtonTextEn(String minorButtonTextEn) {
            this.minorButtonTextEn = minorButtonTextEn;
            return this;
        }
        public String getMinorButtonTextEn() {
            return this.minorButtonTextEn;
        }

        public GetProhibitedPolicyResponseBodyPolicy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProhibitedPolicyResponseBodyPolicy setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public GetProhibitedPolicyResponseBodyPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public GetProhibitedPolicyResponseBodyPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public GetProhibitedPolicyResponseBodyPolicy setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetProhibitedPolicyResponseBodyPolicy setPromptCh(String promptCh) {
            this.promptCh = promptCh;
            return this;
        }
        public String getPromptCh() {
            return this.promptCh;
        }

        public GetProhibitedPolicyResponseBodyPolicy setPromptEn(String promptEn) {
            this.promptEn = promptEn;
            return this;
        }
        public String getPromptEn() {
            return this.promptEn;
        }

        public GetProhibitedPolicyResponseBodyPolicy setReportProcessId(String reportProcessId) {
            this.reportProcessId = reportProcessId;
            return this;
        }
        public String getReportProcessId() {
            return this.reportProcessId;
        }

        public GetProhibitedPolicyResponseBodyPolicy setSoftwareIds(java.util.List<GetProhibitedPolicyResponseBodyPolicySoftwareIds> softwareIds) {
            this.softwareIds = softwareIds;
            return this;
        }
        public java.util.List<GetProhibitedPolicyResponseBodyPolicySoftwareIds> getSoftwareIds() {
            return this.softwareIds;
        }

        public GetProhibitedPolicyResponseBodyPolicy setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        public GetProhibitedPolicyResponseBodyPolicy setTitleCh(String titleCh) {
            this.titleCh = titleCh;
            return this;
        }
        public String getTitleCh() {
            return this.titleCh;
        }

        public GetProhibitedPolicyResponseBodyPolicy setTitleEn(String titleEn) {
            this.titleEn = titleEn;
            return this;
        }
        public String getTitleEn() {
            return this.titleEn;
        }

        public GetProhibitedPolicyResponseBodyPolicy setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public GetProhibitedPolicyResponseBodyPolicy setWhitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<String> getWhitelist() {
            return this.whitelist;
        }

    }

}
