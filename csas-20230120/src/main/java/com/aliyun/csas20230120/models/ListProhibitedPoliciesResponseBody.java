// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListProhibitedPoliciesResponseBody extends TeaModel {
    /**
     * <p>The list of software prohibition policies, sorted by priority from highest to lowest.</p>
     */
    @NameInMap("Policies")
    public java.util.List<ListProhibitedPoliciesResponseBodyPolicies> policies;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>03362EE0-C6F7-51ED-91FF-0BFFA5A2AB67</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of software prohibition policies.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    public static ListProhibitedPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProhibitedPoliciesResponseBody self = new ListProhibitedPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProhibitedPoliciesResponseBody setPolicies(java.util.List<ListProhibitedPoliciesResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<ListProhibitedPoliciesResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public ListProhibitedPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProhibitedPoliciesResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class ListProhibitedPoliciesResponseBodyPoliciesSoftwareIds extends TeaModel {
        /**
         * <p>Indicates whether the prohibited software is a system built-in entry. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A system built-in prohibited software entry shared by all Alibaba Cloud accounts. Modification and deletion are not supported.</li>
         * <li><strong>false</strong>: Custom prohibited software under the current Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The prohibited software ID.</p>
         * 
         * <strong>example:</strong>
         * <p>swb-9a0bfde19662****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        public static ListProhibitedPoliciesResponseBodyPoliciesSoftwareIds build(java.util.Map<String, ?> map) throws Exception {
            ListProhibitedPoliciesResponseBodyPoliciesSoftwareIds self = new ListProhibitedPoliciesResponseBodyPoliciesSoftwareIds();
            return TeaModel.build(map, self);
        }

        public ListProhibitedPoliciesResponseBodyPoliciesSoftwareIds setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListProhibitedPoliciesResponseBodyPoliciesSoftwareIds setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

    }

    public static class ListProhibitedPoliciesResponseBodyPolicies extends TeaModel {
        /**
         * <p>Indicates whether endpoint users are allowed to submit a filing request for this policy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Filing is allowed. The endpoint pop-up notification provides a filing entry.</li>
         * <li><strong>false</strong>: Filing is not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowReport")
        public Boolean allowReport;

        /**
         * <p>The creation time of the software prohibition policy, in the format of yyyy-MM-dd HH:mm:ss, using the UTC+8 time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-16 17:18:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the software prohibition policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <li><strong>true</strong>: The endpoint immediately terminates the running processes of the software when the policy is matched.</li>
         * <li><strong>false</strong>: Running processes are not terminated. Only subsequent launches are blocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ForceKill")
        public Boolean forceKill;

        /**
         * <p>The Chinese text of the primary button in the endpoint pop-up notification.</p>
         * 
         * <strong>example:</strong>
         * <p>去报备</p>
         */
        @NameInMap("MainButtonTextCh")
        public String mainButtonTextCh;

        /**
         * <p>The English text of the primary button in the endpoint pop-up notification.</p>
         * 
         * <strong>example:</strong>
         * <p>Report</p>
         */
        @NameInMap("MainButtonTextEn")
        public String mainButtonTextEn;

        /**
         * <p>The policy matching target type. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: Associated with all users.</li>
         * <li><strong>UserGroupNormal</strong>: Associated with specific user groups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        @NameInMap("MatchMode")
        public String matchMode;

        /**
         * <p>The Chinese text of the secondary button in the endpoint pop-up notification.</p>
         * 
         * <strong>example:</strong>
         * <p>我知道了</p>
         */
        @NameInMap("MinorButtonTextCh")
        public String minorButtonTextCh;

        /**
         * <p>The English text of the secondary button in the endpoint pop-up notification.</p>
         * 
         * <strong>example:</strong>
         * <p>Got it</p>
         */
        @NameInMap("MinorButtonTextEn")
        public String minorButtonTextEn;

        /**
         * <p>The name of the software prohibition policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The object type of the controlled target. Valid values:</p>
         * <ul>
         * <li><strong>App</strong>: Controls by prohibited software. The controlled objects are specified by SoftwareIds.</li>
         * <li><strong>Tag</strong>: Controls by prohibited software tag. The controlled objects are specified by TagIds. All prohibited software under the tag is controlled.</li>
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
         * <p>pid-42f19f1b6a3e****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The action to take. Valid values:</p>
         * <ul>
         * <li><strong>Ban</strong>: Blocks the software from running and displays a pop-up notification on the endpoint to alert the user.</li>
         * <li><strong>BanSilent</strong>: Blocks the software from running without notifying the user. The blocking is silent.</li>
         * <li><strong>Warn</strong>: Only displays a pop-up notification on the endpoint to alert the user without blocking the software from running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Warn</p>
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
         * <p>The Chinese prompt content displayed in the endpoint pop-up notification.</p>
         * 
         * <strong>example:</strong>
         * <p>This software has been blocked by the enterprise security policy. To use it, submit an approval request</p>
         */
        @NameInMap("PromptCh")
        public String promptCh;

        /**
         * <p>The English prompt content displayed in the endpoint pop-up notification.</p>
         * 
         * <strong>example:</strong>
         * <p>This software is blocked by your enterprise security policy.</p>
         */
        @NameInMap("PromptEn")
        public String promptEn;

        /**
         * <p>The collection of prohibited software directly controlled by this policy.</p>
         */
        @NameInMap("SoftwareIds")
        public java.util.List<ListProhibitedPoliciesResponseBodyPoliciesSoftwareIds> softwareIds;

        /**
         * <p>The collection of prohibited software tag IDs controlled by this policy.</p>
         */
        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        /**
         * <p>The Chinese title of the endpoint pop-up notification.</p>
         * 
         * <strong>example:</strong>
         * <p>软件禁用提醒</p>
         */
        @NameInMap("TitleCh")
        public String titleCh;

        /**
         * <p>The English title of the endpoint pop-up notification.</p>
         * 
         * <strong>example:</strong>
         * <p>Software Blocked</p>
         */
        @NameInMap("TitleEn")
        public String titleEn;

        /**
         * <p>The collection of user group IDs to which this policy applies.</p>
         */
        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        /**
         * <p>The list of exempted usernames.</p>
         */
        @NameInMap("Whitelist")
        public java.util.List<String> whitelist;

        public static ListProhibitedPoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListProhibitedPoliciesResponseBodyPolicies self = new ListProhibitedPoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListProhibitedPoliciesResponseBodyPolicies setAllowReport(Boolean allowReport) {
            this.allowReport = allowReport;
            return this;
        }
        public Boolean getAllowReport() {
            return this.allowReport;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setForceKill(Boolean forceKill) {
            this.forceKill = forceKill;
            return this;
        }
        public Boolean getForceKill() {
            return this.forceKill;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setMainButtonTextCh(String mainButtonTextCh) {
            this.mainButtonTextCh = mainButtonTextCh;
            return this;
        }
        public String getMainButtonTextCh() {
            return this.mainButtonTextCh;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setMainButtonTextEn(String mainButtonTextEn) {
            this.mainButtonTextEn = mainButtonTextEn;
            return this;
        }
        public String getMainButtonTextEn() {
            return this.mainButtonTextEn;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setMinorButtonTextCh(String minorButtonTextCh) {
            this.minorButtonTextCh = minorButtonTextCh;
            return this;
        }
        public String getMinorButtonTextCh() {
            return this.minorButtonTextCh;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setMinorButtonTextEn(String minorButtonTextEn) {
            this.minorButtonTextEn = minorButtonTextEn;
            return this;
        }
        public String getMinorButtonTextEn() {
            return this.minorButtonTextEn;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setPromptCh(String promptCh) {
            this.promptCh = promptCh;
            return this;
        }
        public String getPromptCh() {
            return this.promptCh;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setPromptEn(String promptEn) {
            this.promptEn = promptEn;
            return this;
        }
        public String getPromptEn() {
            return this.promptEn;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setSoftwareIds(java.util.List<ListProhibitedPoliciesResponseBodyPoliciesSoftwareIds> softwareIds) {
            this.softwareIds = softwareIds;
            return this;
        }
        public java.util.List<ListProhibitedPoliciesResponseBodyPoliciesSoftwareIds> getSoftwareIds() {
            return this.softwareIds;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setTitleCh(String titleCh) {
            this.titleCh = titleCh;
            return this;
        }
        public String getTitleCh() {
            return this.titleCh;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setTitleEn(String titleEn) {
            this.titleEn = titleEn;
            return this;
        }
        public String getTitleEn() {
            return this.titleEn;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public ListProhibitedPoliciesResponseBodyPolicies setWhitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<String> getWhitelist() {
            return this.whitelist;
        }

    }

}
