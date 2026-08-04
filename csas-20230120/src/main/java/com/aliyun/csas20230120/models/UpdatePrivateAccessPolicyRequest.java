// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessPolicyRequest extends TeaModel {
    /**
     * <p>The IDs of applications associated with the internal network access policy. A single policy supports up to 100 application IDs.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>The application type for the internal network access policy. Valid values:</p>
     * <ul>
     * <li><p><strong>Application</strong>: Application.</p>
     * </li>
     * <li><p><strong>Tag</strong>: Tag.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Application</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>This parameter specifies a collection of custom user groups for the private network access policy. It is required when the user group type is <strong>Custom</strong>. This collection is mutually exclusive with the user group ID collection, and you can specify a maximum of 10 custom user groups.</p>
     */
    @NameInMap("CustomUserAttributes")
    public java.util.List<UpdatePrivateAccessPolicyRequestCustomUserAttributes> customUserAttributes;

    /**
     * <p>A description of the internal network access policy. The description must be 1 to 128 characters in length. It can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一条内网访问策略</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The action taken when a device does not meet the security baseline. Valid values:</p>
     * <ul>
     * <li><p><strong>Block</strong>: Block access.</p>
     * </li>
     * <li><p><strong>Observe</strong>: Monitor access.</p>
     * </li>
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
     * <p>The method used to update the internal network access policy. Valid values:</p>
     * <ul>
     * <li><p><strong>Cover</strong> (default): Replace the existing application IDs, user group IDs, and custom user attributes with the values specified in <strong>ApplicationIds</strong>, <strong>UserGroupIds</strong>, and <strong>CustomUserAttributes</strong>.</p>
     * </li>
     * <li><p><strong>Append</strong>: Add the values specified in <strong>ApplicationIds</strong>, <strong>UserGroupIds</strong>, and <strong>CustomUserAttributes</strong> to the existing application IDs, user group IDs, and custom user attributes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("Name")
    public String name;

    /**
     * <p>The action that the internal network access policy takes. Valid values:</p>
     * <ul>
     * <li><p><strong>Block</strong>: Block access.</p>
     * </li>
     * <li><p><strong>Allow</strong>: Allow access.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Allow</p>
     */
    @NameInMap("PolicyAction")
    public String policyAction;

    /**
     * <p>The ID of the internal network access policy. Get this value from one of the following operations:</p>
     * <ul>
     * <li><p><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: List internal network access policies in batches.</p>
     * </li>
     * <li><p><a href="~~CreatePrivateAccessPolicy~~">CreatePrivateAccessPolicy</a>: Create an internal network access policy.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-policy-63b2f1844b86****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The priority of the internal network access policy. Priority 1 is the highest. Valid values: 1 to 1000. The maximum value is the total number of internal network access policies minus 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The status of the internal network access policy. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The IDs of tags associated with the internal network access policy. A single policy supports up to 100 tag IDs.</p>
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
     * <p>The IDs of trusted process groups.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("TrustedProcessGroupIds")
    public java.util.List<String> trustedProcessGroupIds;

    /**
     * <p>The status of the trusted process feature. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("TrustedProcessStatus")
    public String trustedProcessStatus;

    /**
     * <p>The IDs of trusted software.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("TrustedSoftwareIds")
    public java.util.List<String> trustedSoftwareIds;

    /**
     * <p>The IDs of user groups associated with the internal network access policy. This parameter is required when UserGroupMode is set to Normal. This parameter is mutually exclusive with <strong>CustomUserAttributes</strong>. A single policy supports up to 10,000 user groups. You can update up to 2,000 user group IDs at a time.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The user group type for the internal network access policy. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: Regular user group.</p>
     * </li>
     * <li><p><strong>Custom</strong>: Custom user group.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("UserGroupMode")
    public String userGroupMode;

    /**
     * <p>The start time of the zero-trust policy\&quot;s effective period, in seconds since the Unix epoch.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ValidFrom")
    public Long validFrom;

    /**
     * <p>The status of the effective time feature. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("ValidTimeStatus")
    public String validTimeStatus;

    /**
     * <p>The end time of the zero-trust policy\&quot;s effective period, in seconds since the Unix epoch.</p>
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
         * <p>The identity provider ID for the custom user attribute. This parameter is required when UserGroupType is <strong>department</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <p>The relation used to match the custom user attribute. Valid values:</p>
         * <ul>
         * <li><p><strong>Equal</strong>: Equal to.</p>
         * </li>
         * <li><p><strong>Unequal</strong>: Not equal to.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Relation")
        public String relation;

        /**
         * <p>The type of the custom user attribute. Valid values:</p>
         * <ul>
         * <li><p><strong>username</strong>: Username.</p>
         * </li>
         * <li><p><strong>department</strong>: Department.</p>
         * </li>
         * <li><p><strong>email</strong>: Email address.</p>
         * </li>
         * <li><p><strong>telephone</strong>: Phone number.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

        /**
         * <p>The value of the custom user attribute.</p>
         * <ul>
         * <li><p>If UserGroupType is <strong>username</strong>, this is the username. The value must be 1 to 128 characters in length. It can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), asterisks (\*), at signs (@), and spaces.</p>
         * </li>
         * <li><p>If UserGroupType is <strong>department</strong>, this is the department name. Example: OU=Department 1,OU=SASE DingTalk.</p>
         * </li>
         * <li><p>If UserGroupType is <strong>email</strong>, this is the email address. Example: username\@example.com.</p>
         * </li>
         * <li><p>If UserGroupType is <strong>telephone</strong>, this is the phone number. Example: 13900001234.</p>
         * </li>
         * </ul>
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
