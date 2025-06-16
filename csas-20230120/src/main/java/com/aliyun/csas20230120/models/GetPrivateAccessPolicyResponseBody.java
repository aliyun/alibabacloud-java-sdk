// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetPrivateAccessPolicyResponseBody extends TeaModel {
    /**
     * <p>Intranet access policy.</p>
     */
    @NameInMap("Policy")
    public GetPrivateAccessPolicyResponseBodyPolicy policy;

    /**
     * <p>The ID of the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>7E9D7ACD-53D5-56EF-A913-79D148D06299</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPrivateAccessPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateAccessPolicyResponseBody self = new GetPrivateAccessPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrivateAccessPolicyResponseBody setPolicy(GetPrivateAccessPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public GetPrivateAccessPolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public GetPrivateAccessPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPrivateAccessPolicyResponseBodyPolicyCustomUserAttributes extends TeaModel {
        /**
         * <p>The identity provider ID for the custom user group. This field is required when the custom user group type is <strong>department</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <p>Custom user group relationship. Values: - <strong>Equal</strong>: Equal to. - <strong>Unequal</strong>: Not equal to.</p>
         * 
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Relation")
        public String relation;

        /**
         * <p>Type of the custom user group. Values:</p>
         * <ul>
         * <li><strong>username</strong>: Username.</li>
         * <li><strong>department</strong>: Department.</li>
         * <li><strong>email</strong>: Email.</li>
         * <li><strong>telephone</strong>: Telephone.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

        /**
         * <p>The value of the custom user group attribute.</p>
         * <ul>
         * <li>When the user group type is <strong>username</strong>, it represents the value of the username. The length should be 1 to 128 characters, supporting Chinese and case-sensitive English letters, and can include numbers, periods (.), underscores (_), and hyphens (-).</li>
         * <li>When the user group type is <strong>department</strong>, it represents the value of the department. For example: OU=Department1,OU=SASE DingTalk.</li>
         * <li>When the user group type is <strong>email</strong>, it represents the value of the email. For example: <a href="mailto:username@example.com">username@example.com</a>.</li>
         * <li>When the user group type is <strong>telephone</strong>, it represents the value of the phone number. For example: 13900001234.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OU=部门1,OU=SASE钉钉</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetPrivateAccessPolicyResponseBodyPolicyCustomUserAttributes build(java.util.Map<String, ?> map) throws Exception {
            GetPrivateAccessPolicyResponseBodyPolicyCustomUserAttributes self = new GetPrivateAccessPolicyResponseBodyPolicyCustomUserAttributes();
            return TeaModel.build(map, self);
        }

        public GetPrivateAccessPolicyResponseBodyPolicyCustomUserAttributes setIdpId(Integer idpId) {
            this.idpId = idpId;
            return this;
        }
        public Integer getIdpId() {
            return this.idpId;
        }

        public GetPrivateAccessPolicyResponseBodyPolicyCustomUserAttributes setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public GetPrivateAccessPolicyResponseBodyPolicyCustomUserAttributes setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public GetPrivateAccessPolicyResponseBodyPolicyCustomUserAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetPrivateAccessPolicyResponseBodyPolicy extends TeaModel {
        /**
         * <p>A collection of application IDs for the private access policy. This field has a value when the application type is Application.</p>
         */
        @NameInMap("ApplicationIds")
        public java.util.List<String> applicationIds;

        /**
         * <p>The application type of the private access policy. Possible values:</p>
         * <ul>
         * <li><strong>Application</strong>: Application.</li>
         * <li><strong>Tag</strong>: Tag.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Application</p>
         */
        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <p>Intranet access policy creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-29 11:26:02</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Collection of custom user group attributes. Multiple custom user group attributes are combined with an OR relationship and take effect as a set.</p>
         */
        @NameInMap("CustomUserAttributes")
        public java.util.List<GetPrivateAccessPolicyResponseBodyPolicyCustomUserAttributes> customUserAttributes;

        /**
         * <p>Intranet access policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The action to take if the security baseline is not met. Possible values:</p>
         * <ul>
         * <li><strong>Block</strong>: Block.</li>
         * <li><strong>Observe</strong>: Observe.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Block</p>
         */
        @NameInMap("DeviceAttributeAction")
        public String deviceAttributeAction;

        /**
         * <p>The ID of the security baseline policy.</p>
         * 
         * <strong>example:</strong>
         * <p>dag-d3f64e8bdd4a****</p>
         */
        @NameInMap("DeviceAttributeId")
        public String deviceAttributeId;

        /**
         * <p>Intranet access policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>private_access_policy_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Intranet access policy action. Values:</p>
         * <ul>
         * <li><strong>Block</strong>: Block.</li>
         * <li><strong>Allow</strong>: Allow.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("PolicyAction")
        public String policyAction;

        /**
         * <p>Intranet access policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-policy-63b2f1844b86****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>Intranet access policy priority. A value of 1 indicates the highest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>Intranet access policy status. Values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>A collection of tag IDs for the private access policy. This field has a value when the application type is Tag.</p>
         */
        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        /**
         * <p>The trigger template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dag-d3f64e8bdd4a****</p>
         */
        @NameInMap("TriggerTemplateId")
        public String triggerTemplateId;

        /**
         * <p>A list of trusted process group IDs.</p>
         */
        @NameInMap("TrustedProcessGroupIds")
        public java.util.List<String> trustedProcessGroupIds;

        /**
         * <p>The status of the trusted process switch. Possible values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("TrustedProcessStatus")
        public String trustedProcessStatus;

        /**
         * <p>A list of trusted software IDs.</p>
         */
        @NameInMap("TrustedSoftwareIds")
        public java.util.List<String> trustedSoftwareIds;

        /**
         * <p>Collection of user group IDs for the intranet access policy. This field is populated when the user group type is Normal.</p>
         */
        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        /**
         * <p>User group type for the intranet access policy. Values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Normal user group.</li>
         * <li><strong>Custom</strong>: Custom user group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("UserGroupMode")
        public String userGroupMode;

        public static GetPrivateAccessPolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetPrivateAccessPolicyResponseBodyPolicy self = new GetPrivateAccessPolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setApplicationIds(java.util.List<String> applicationIds) {
            this.applicationIds = applicationIds;
            return this;
        }
        public java.util.List<String> getApplicationIds() {
            return this.applicationIds;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setCustomUserAttributes(java.util.List<GetPrivateAccessPolicyResponseBodyPolicyCustomUserAttributes> customUserAttributes) {
            this.customUserAttributes = customUserAttributes;
            return this;
        }
        public java.util.List<GetPrivateAccessPolicyResponseBodyPolicyCustomUserAttributes> getCustomUserAttributes() {
            return this.customUserAttributes;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setDeviceAttributeAction(String deviceAttributeAction) {
            this.deviceAttributeAction = deviceAttributeAction;
            return this;
        }
        public String getDeviceAttributeAction() {
            return this.deviceAttributeAction;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setDeviceAttributeId(String deviceAttributeId) {
            this.deviceAttributeId = deviceAttributeId;
            return this;
        }
        public String getDeviceAttributeId() {
            return this.deviceAttributeId;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setPolicyAction(String policyAction) {
            this.policyAction = policyAction;
            return this;
        }
        public String getPolicyAction() {
            return this.policyAction;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setTriggerTemplateId(String triggerTemplateId) {
            this.triggerTemplateId = triggerTemplateId;
            return this;
        }
        public String getTriggerTemplateId() {
            return this.triggerTemplateId;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setTrustedProcessGroupIds(java.util.List<String> trustedProcessGroupIds) {
            this.trustedProcessGroupIds = trustedProcessGroupIds;
            return this;
        }
        public java.util.List<String> getTrustedProcessGroupIds() {
            return this.trustedProcessGroupIds;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setTrustedProcessStatus(String trustedProcessStatus) {
            this.trustedProcessStatus = trustedProcessStatus;
            return this;
        }
        public String getTrustedProcessStatus() {
            return this.trustedProcessStatus;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setTrustedSoftwareIds(java.util.List<String> trustedSoftwareIds) {
            this.trustedSoftwareIds = trustedSoftwareIds;
            return this;
        }
        public java.util.List<String> getTrustedSoftwareIds() {
            return this.trustedSoftwareIds;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public GetPrivateAccessPolicyResponseBodyPolicy setUserGroupMode(String userGroupMode) {
            this.userGroupMode = userGroupMode;
            return this;
        }
        public String getUserGroupMode() {
            return this.userGroupMode;
        }

    }

}
