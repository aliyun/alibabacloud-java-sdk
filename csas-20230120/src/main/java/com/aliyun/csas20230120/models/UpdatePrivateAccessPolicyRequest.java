// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessPolicyRequest extends TeaModel {
    /**
     * <p>The IDs of the applications in the private access policy. A single policy supports up to 100 private access application IDs.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>The application type of the private access policy. Valid values:</p>
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
     * <p>The custom user groups in the private access policy. This parameter is required when the user group type is <strong>Custom</strong>. This parameter is mutually exclusive with the user group IDs. You can specify up to 10 custom user groups.</p>
     */
    @NameInMap("CustomUserAttributes")
    public java.util.List<UpdatePrivateAccessPolicyRequestCustomUserAttributes> customUserAttributes;

    /**
     * <p>The description of the private access policy. The description must be 1 to 128 characters in length, and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a private access policy</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The action to take when the security baseline is not met. Valid values:</p>
     * <ul>
     * <li><strong>Block</strong>: Blocks.</li>
     * <li><strong>Observe</strong>: Observes.</li>
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
     * <p>The modification type of the private access policy. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong> (default): Overwrites the original application IDs, user group IDs, and custom user groups with the values of the <strong>ApplicationIds</strong>, <strong>UserGroupIds</strong>, and <strong>CustomUserAttributes</strong> parameters.</li>
     * <li><strong>Append</strong>: Appends the values of the <strong>ApplicationIds</strong>, <strong>UserGroupIds</strong>, and <strong>CustomUserAttributes</strong> parameters to the original application IDs, user group IDs, and custom user groups.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The Policy Name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The action of the private access policy. Valid values:</p>
     * <ul>
     * <li><strong>Block</strong>: Blocks.</li>
     * <li><strong>Allow</strong>: Allows.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Allow</p>
     */
    @NameInMap("PolicyAction")
    public String policyAction;

    /**
     * <p>The ID of the private access policy. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: Queries private access policies.</li>
     * <li><a href="~~CreatePrivateAccessPolicy~~">CreatePrivateAccessPolicy</a>: Creates a private access policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-policy-63b2f1844b86****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The policy priority of the internal network access policy. A value of 1 indicates the highest priority. Valid values: 1 to 1000. The maximum value is the total number of internal network access policies minus one.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The status of the private access policy. Valid values:</p>
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
     * <p>The IDs of the tags in the private access policy. A single policy supports up to 100 private access tag IDs.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    /**
     * <p>The ID of the trigger template.</p>
     * 
     * <strong>example:</strong>
     * <p>dag-d3f64e8bdd4a****</p>
     */
    @NameInMap("TriggerTemplateId")
    public String triggerTemplateId;

    /**
     * <p>The IDs of the trusted process groups.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("TrustedProcessGroupIds")
    public java.util.List<String> trustedProcessGroupIds;

    /**
     * <p>The status of the trusted process switch. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: Enabled.</li>
     * <li><strong>Disabled</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("TrustedProcessStatus")
    public String trustedProcessStatus;

    /**
     * <p>The IDs of the trusted software.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("TrustedSoftwareIds")
    public java.util.List<String> trustedSoftwareIds;

    /**
     * <p>The IDs of the user groups in the private access policy. This parameter is required when the user group type is <strong>Normal</strong>. This parameter is mutually exclusive with the custom user groups. A single policy supports up to 10,000 user groups, and you can modify up to 2,000 user group IDs at a time.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The user group type of the private access policy. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: Regular user group.</li>
     * <li><strong>Custom</strong>: Custom user group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("UserGroupMode")
    public String userGroupMode;

    /**
     * <p>The start time when the zero trust policy takes effect. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ValidFrom")
    public Long validFrom;

    /**
     * <p>The status of the effective period switch. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: Enabled.</li>
     * <li><strong>Disabled</strong>: Shutdown.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("ValidTimeStatus")
    public String validTimeStatus;

    /**
     * <p>The end time when the zero trust policy takes effect. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1764727544</p>
     */
    @NameInMap("ValidUntil")
    public Long validUntil;

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

    public UpdatePrivateAccessPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public UpdatePrivateAccessPolicyRequest setValidFrom(Long validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    public Long getValidFrom() {
        return this.validFrom;
    }

    public UpdatePrivateAccessPolicyRequest setValidTimeStatus(String validTimeStatus) {
        this.validTimeStatus = validTimeStatus;
        return this;
    }
    public String getValidTimeStatus() {
        return this.validTimeStatus;
    }

    public UpdatePrivateAccessPolicyRequest setValidUntil(Long validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    public Long getValidUntil() {
        return this.validUntil;
    }

    public static class UpdatePrivateAccessPolicyRequestCustomUserAttributes extends TeaModel {
        /**
         * <p>The ID of the identity source for the custom user group. This parameter is required when the custom user group type is <strong>department</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <p>The relation of the custom user group. Valid values:</p>
         * <ul>
         * <li><strong>Equal</strong>: Equal to.</li>
         * <li><strong>Unequal</strong>: Not equal to.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Relation")
        public String relation;

        /**
         * <p>The type of the custom user group. Valid values:</p>
         * <ul>
         * <li><strong>username</strong>: Username.</li>
         * <li><strong>department</strong>: Department.</li>
         * <li><strong>email</strong>: Email address.</li>
         * <li><strong>telephone</strong>: Mobile phone number.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

        /**
         * <p>The value of the custom user group attribute.</p>
         * <ul>
         * <li>If the user group type is <strong>username</strong>, this parameter specifies the username. The value must be 1 to 128 characters in length, and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), asterisks (*), at signs (@), and spaces.</li>
         * <li>If the user group type is <strong>department</strong>, this parameter specifies the department. Example: OU=Department 1,OU=SASE DingTalk.</li>
         * <li>If the user group type is <strong>email</strong>, this parameter specifies the email address. Example: <a href="mailto:username@example.com">username@example.com</a>.</li>
         * <li>If the user group type is <strong>telephone</strong>, this parameter specifies the mobile phone number. Example: 13900001234.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OU=Department 1,OU=SASE DingTalk</p>
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
