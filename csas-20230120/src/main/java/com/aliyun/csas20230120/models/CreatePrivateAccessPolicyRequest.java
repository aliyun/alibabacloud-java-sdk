// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessPolicyRequest extends TeaModel {
    /**
     * <p>Set of application IDs for the private access policy. Up to 100 application IDs can be entered. Required when <strong>ApplicationType</strong> is <strong>Application</strong>. Mutually exclusive with <strong>TagIds</strong>.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>Application type of the private access policy. Values:</p>
     * <ul>
     * <li><strong>Application</strong>: Application.</li>
     * <li><strong>Tag</strong>: Tag.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Application</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>Set of custom user groups for the private access policy. Required when the user group type is <strong>Custom</strong>. Mutually exclusive with the user group ID set. Up to 10 custom user groups can be entered.</p>
     */
    @NameInMap("CustomUserAttributes")
    public java.util.List<CreatePrivateAccessPolicyRequestCustomUserAttributes> customUserAttributes;

    /**
     * <p>Description of the private access policy. The length is 1 to 128 characters, supporting Chinese and uppercase and lowercase English letters, and can include numbers, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The execution policy for not meeting the security baseline. Values:</p>
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
     * <p>Name of the private access policy. The length is 1 to 128 characters, supporting Chinese and uppercase and lowercase English letters, and can include numbers, periods (.), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>private_access_policy_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Action of the private access policy. Values:</p>
     * <ul>
     * <li><strong>Block</strong>: Block.</li>
     * <li><strong>Allow</strong>: Allow.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Allow</p>
     */
    @NameInMap("PolicyAction")
    public String policyAction;

    /**
     * <p>The priority of the private access policy. The number 1 indicates the highest priority. Range: 1~1000, with the maximum value being the total number of private access policies.</p>
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Set of tag IDs for the private access policy. Up to 100 tag IDs can be entered. Required when <strong>ApplicationType</strong> is <strong>Tag</strong>. Mutually exclusive with <strong>ApplicationIds</strong>.</p>
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
     * <p>The ID of the trusted process group.</p>
     */
    @NameInMap("TrustedProcessGroupIds")
    public java.util.List<String> trustedProcessGroupIds;

    /**
     * <p>The switch status of the trusted process. Values:</p>
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
     * <p>The ID of the trusted software.</p>
     */
    @NameInMap("TrustedSoftwareIds")
    public java.util.List<String> trustedSoftwareIds;

    /**
     * <p>Set of user group IDs for the private access policy. Required when the user group type is <strong>Normal</strong>. Mutually exclusive with the custom user group set. Up to 2000 user group IDs can be entered.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>User group type of the private access policy. Values:</p>
     * <ul>
     * <li><strong>Normal</strong>: Normal user group.</li>
     * <li><strong>Custom</strong>: Custom user group.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("UserGroupMode")
    public String userGroupMode;

    public static CreatePrivateAccessPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateAccessPolicyRequest self = new CreatePrivateAccessPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrivateAccessPolicyRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public CreatePrivateAccessPolicyRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public CreatePrivateAccessPolicyRequest setCustomUserAttributes(java.util.List<CreatePrivateAccessPolicyRequestCustomUserAttributes> customUserAttributes) {
        this.customUserAttributes = customUserAttributes;
        return this;
    }
    public java.util.List<CreatePrivateAccessPolicyRequestCustomUserAttributes> getCustomUserAttributes() {
        return this.customUserAttributes;
    }

    public CreatePrivateAccessPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePrivateAccessPolicyRequest setDeviceAttributeAction(String deviceAttributeAction) {
        this.deviceAttributeAction = deviceAttributeAction;
        return this;
    }
    public String getDeviceAttributeAction() {
        return this.deviceAttributeAction;
    }

    public CreatePrivateAccessPolicyRequest setDeviceAttributeId(String deviceAttributeId) {
        this.deviceAttributeId = deviceAttributeId;
        return this;
    }
    public String getDeviceAttributeId() {
        return this.deviceAttributeId;
    }

    public CreatePrivateAccessPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePrivateAccessPolicyRequest setPolicyAction(String policyAction) {
        this.policyAction = policyAction;
        return this;
    }
    public String getPolicyAction() {
        return this.policyAction;
    }

    public CreatePrivateAccessPolicyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreatePrivateAccessPolicyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreatePrivateAccessPolicyRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    public CreatePrivateAccessPolicyRequest setTriggerTemplateId(String triggerTemplateId) {
        this.triggerTemplateId = triggerTemplateId;
        return this;
    }
    public String getTriggerTemplateId() {
        return this.triggerTemplateId;
    }

    public CreatePrivateAccessPolicyRequest setTrustedProcessGroupIds(java.util.List<String> trustedProcessGroupIds) {
        this.trustedProcessGroupIds = trustedProcessGroupIds;
        return this;
    }
    public java.util.List<String> getTrustedProcessGroupIds() {
        return this.trustedProcessGroupIds;
    }

    public CreatePrivateAccessPolicyRequest setTrustedProcessStatus(String trustedProcessStatus) {
        this.trustedProcessStatus = trustedProcessStatus;
        return this;
    }
    public String getTrustedProcessStatus() {
        return this.trustedProcessStatus;
    }

    public CreatePrivateAccessPolicyRequest setTrustedSoftwareIds(java.util.List<String> trustedSoftwareIds) {
        this.trustedSoftwareIds = trustedSoftwareIds;
        return this;
    }
    public java.util.List<String> getTrustedSoftwareIds() {
        return this.trustedSoftwareIds;
    }

    public CreatePrivateAccessPolicyRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public CreatePrivateAccessPolicyRequest setUserGroupMode(String userGroupMode) {
        this.userGroupMode = userGroupMode;
        return this;
    }
    public String getUserGroupMode() {
        return this.userGroupMode;
    }

    public static class CreatePrivateAccessPolicyRequestCustomUserAttributes extends TeaModel {
        /**
         * <p>The ID of the identity source for the custom user group. Required when the custom user group type is <strong>department</strong>.</p>
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
         * <p>Value of the custom user group attribute.</p>
         * <ul>
         * <li>When the user group type is <strong>username</strong>, it represents the value of the username. The length is 1 to 128 characters, supporting Chinese and uppercase and lowercase English letters, and can include numbers, periods (.), underscores (_), hyphens (-), asterisks (*), at (@) symbols, and spaces.</li>
         * <li>When the user group type is <strong>department</strong>, it represents the value of the department. For example: OU=Department1,OU=SASE DingTalk.</li>
         * <li>When the user group type is <strong>email</strong>, it represents the value of the email. For example: <a href="mailto:username@example.com">username@example.com</a>.</li>
         * <li>When the user group type is <strong>telephone</strong>, it represents the value of the telephone. For example: 13900001234.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OU=部门1,OU=SASE钉钉</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePrivateAccessPolicyRequestCustomUserAttributes build(java.util.Map<String, ?> map) throws Exception {
            CreatePrivateAccessPolicyRequestCustomUserAttributes self = new CreatePrivateAccessPolicyRequestCustomUserAttributes();
            return TeaModel.build(map, self);
        }

        public CreatePrivateAccessPolicyRequestCustomUserAttributes setIdpId(Integer idpId) {
            this.idpId = idpId;
            return this;
        }
        public Integer getIdpId() {
            return this.idpId;
        }

        public CreatePrivateAccessPolicyRequestCustomUserAttributes setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public CreatePrivateAccessPolicyRequestCustomUserAttributes setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public CreatePrivateAccessPolicyRequestCustomUserAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
