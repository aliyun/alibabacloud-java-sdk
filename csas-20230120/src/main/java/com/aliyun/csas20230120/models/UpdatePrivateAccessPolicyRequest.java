// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessPolicyRequest extends TeaModel {
    /**
     * <p>Set of application IDs for the private access policy. A single policy supports up to 100 private access application IDs.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>Application type of the private access policy. Values:</p>
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
     * <p>Set of custom user attributes for the private access policy, required when the user group type is <strong>Custom</strong>. Mutually exclusive with the user group ID set. The total number of custom user groups is limited to 10.</p>
     */
    @NameInMap("CustomUserAttributes")
    public java.util.List<UpdatePrivateAccessPolicyRequestCustomUserAttributes> customUserAttributes;

    /**
     * <p>Description of the private access policy. Length should be 1 to 128 characters, supporting Chinese and English letters (both uppercase and lowercase), and can include numbers, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The execution strategy for not meeting the security baseline. Values:</p>
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
     * <p>The modification type of the private access policy. Values:</p>
     * <ul>
     * <li><strong>Cover</strong> (default): Use the values of <strong>ApplicationIds</strong>, <strong>UserGroupIds</strong>, and <strong>CustomUserAttributes</strong> to overwrite the original application ID set, user group ID set, and custom user attribute set, respectively.</li>
     * <li><strong>Append</strong>: Add the values provided in <strong>ApplicationIds</strong>, <strong>UserGroupIds</strong>, and <strong>CustomUserAttributes</strong> to the original application ID set, user group ID set, and custom user attribute set, respectively.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>Action of the private access policy. Values:</p>
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
     * <p>ID of the private access policy. Value sources:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessPolicies~~">ListPrivateAccessPolicies</a>: Batch query for private access policies.</li>
     * <li><a href="~~CreatePrivateAccessPolicy~~">CreatePrivateAccessPolicy</a>: Create a private access policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-policy-63b2f1844b86****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The priority of the private access policy. The number 1 indicates the highest priority. Range: 1~1000, with the maximum value being the total number of private access policies minus one.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The status of the private access policy. Values:</p>
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
     * <p>Set of tag IDs for the private access policy. A single policy supports up to 100 private access tag IDs.</p>
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
     * <p>Trusted process group ID.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("TrustedProcessGroupIds")
    public java.util.List<String> trustedProcessGroupIds;

    /**
     * <p>Trusted process switch status. Values: </p>
     * <ul>
     * <li><p><strong>Enabled</strong>: On. </p>
     * </li>
     * <li><p><strong>Disabled</strong>: Off.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("TrustedProcessStatus")
    public String trustedProcessStatus;

    /**
     * <p>Trusted Software ID.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("TrustedSoftwareIds")
    public java.util.List<String> trustedSoftwareIds;

    /**
     * <p>Set of user group IDs for the private access policy, required when the user group type is <strong>Normal</strong>. Mutually exclusive with the custom user group set. A single policy supports up to 10,000 user groups, and a maximum of 2,000 user group IDs can be modified at once.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>User group type of the private access policy. Values:</p>
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

    public static UpdatePrivateAccessPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateAccessPolicyRequest self = new UpdatePrivateAccessPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateAccessPolicyRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public UpdatePrivateAccessPolicyRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public UpdatePrivateAccessPolicyRequest setCustomUserAttributes(java.util.List<UpdatePrivateAccessPolicyRequestCustomUserAttributes> customUserAttributes) {
        this.customUserAttributes = customUserAttributes;
        return this;
    }
    public java.util.List<UpdatePrivateAccessPolicyRequestCustomUserAttributes> getCustomUserAttributes() {
        return this.customUserAttributes;
    }

    public UpdatePrivateAccessPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePrivateAccessPolicyRequest setDeviceAttributeAction(String deviceAttributeAction) {
        this.deviceAttributeAction = deviceAttributeAction;
        return this;
    }
    public String getDeviceAttributeAction() {
        return this.deviceAttributeAction;
    }

    public UpdatePrivateAccessPolicyRequest setDeviceAttributeId(String deviceAttributeId) {
        this.deviceAttributeId = deviceAttributeId;
        return this;
    }
    public String getDeviceAttributeId() {
        return this.deviceAttributeId;
    }

    public UpdatePrivateAccessPolicyRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public UpdatePrivateAccessPolicyRequest setPolicyAction(String policyAction) {
        this.policyAction = policyAction;
        return this;
    }
    public String getPolicyAction() {
        return this.policyAction;
    }

    public UpdatePrivateAccessPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdatePrivateAccessPolicyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdatePrivateAccessPolicyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdatePrivateAccessPolicyRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    public UpdatePrivateAccessPolicyRequest setTriggerTemplateId(String triggerTemplateId) {
        this.triggerTemplateId = triggerTemplateId;
        return this;
    }
    public String getTriggerTemplateId() {
        return this.triggerTemplateId;
    }

    public UpdatePrivateAccessPolicyRequest setTrustedProcessGroupIds(java.util.List<String> trustedProcessGroupIds) {
        this.trustedProcessGroupIds = trustedProcessGroupIds;
        return this;
    }
    public java.util.List<String> getTrustedProcessGroupIds() {
        return this.trustedProcessGroupIds;
    }

    public UpdatePrivateAccessPolicyRequest setTrustedProcessStatus(String trustedProcessStatus) {
        this.trustedProcessStatus = trustedProcessStatus;
        return this;
    }
    public String getTrustedProcessStatus() {
        return this.trustedProcessStatus;
    }

    public UpdatePrivateAccessPolicyRequest setTrustedSoftwareIds(java.util.List<String> trustedSoftwareIds) {
        this.trustedSoftwareIds = trustedSoftwareIds;
        return this;
    }
    public java.util.List<String> getTrustedSoftwareIds() {
        return this.trustedSoftwareIds;
    }

    public UpdatePrivateAccessPolicyRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public UpdatePrivateAccessPolicyRequest setUserGroupMode(String userGroupMode) {
        this.userGroupMode = userGroupMode;
        return this;
    }
    public String getUserGroupMode() {
        return this.userGroupMode;
    }

    public static class UpdatePrivateAccessPolicyRequestCustomUserAttributes extends TeaModel {
        /**
         * <p>The identity source ID of the custom user group. Required when the custom user group type is <strong>department</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <p>Relation of the custom user group. Values:</p>
         * <ul>
         * <li><strong>Equal</strong>: Equal.</li>
         * <li><strong>Unequal</strong>: Not equal.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

        /**
         * <p>Custom user group attribute values. - When the user group type is <strong>username</strong>, it represents the value of the username. The length should be 1 to 128 characters, supporting Chinese and case-sensitive English letters, and can include numbers, half-width periods (.), underscores (_), hyphens (-), asterisks (*), at symbols (@), and spaces. - When the user group type is <strong>department</strong>, it represents the value of the department. For example: OU=Department1,OU=SASE DingTalk. - When the user group type is <strong>email</strong>, it represents the value of the email. For example: <a href="mailto:username@example.com">username@example.com</a>. - When the user group type is <strong>telephone</strong>, it represents the value of the mobile phone. For example: 13900001234.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OU=部门1,OU=SASE钉钉</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdatePrivateAccessPolicyRequestCustomUserAttributes build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivateAccessPolicyRequestCustomUserAttributes self = new UpdatePrivateAccessPolicyRequestCustomUserAttributes();
            return TeaModel.build(map, self);
        }

        public UpdatePrivateAccessPolicyRequestCustomUserAttributes setIdpId(Integer idpId) {
            this.idpId = idpId;
            return this;
        }
        public Integer getIdpId() {
            return this.idpId;
        }

        public UpdatePrivateAccessPolicyRequestCustomUserAttributes setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public UpdatePrivateAccessPolicyRequestCustomUserAttributes setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public UpdatePrivateAccessPolicyRequestCustomUserAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
