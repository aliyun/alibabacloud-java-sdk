// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessPolicesResponseBody extends TeaModel {
    /**
     * <p>The list of private access policies.</p>
     */
    @NameInMap("Polices")
    public java.util.List<ListPrivateAccessPolicesResponseBodyPolices> polices;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>748CFDC7-1EB6-5B8B-9405-DA76ED5BB60D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of private access policies.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListPrivateAccessPolicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessPolicesResponseBody self = new ListPrivateAccessPolicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessPolicesResponseBody setPolices(java.util.List<ListPrivateAccessPolicesResponseBodyPolices> polices) {
        this.polices = polices;
        return this;
    }
    public java.util.List<ListPrivateAccessPolicesResponseBodyPolices> getPolices() {
        return this.polices;
    }

    public ListPrivateAccessPolicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrivateAccessPolicesResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes extends TeaModel {
        /**
         * <p>The identity provider ID of the user group. This value exists when the custom user group type is <strong>department</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <p>The relation of the user group. Valid values:</p>
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
         * <p>The type of the user group. Valid values:</p>
         * <ul>
         * <li><strong>username</strong>: Username.</li>
         * <li><strong>department</strong>: Department.</li>
         * <li><strong>email</strong>: Email.</li>
         * <li><strong>telephone</strong>: Mobile phone.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

        /**
         * <p>The value of the user group attribute.</p>
         * <ul>
         * <li>When the user group type is <strong>username</strong>, this indicates the value of the username. The value must be 1 to 128 characters in length and supports Chinese characters and uppercase and lowercase English letters. It can contain digits, periods (.), underscores (_), and hyphens (-).</li>
         * <li>When the user group type is <strong>department</strong>, this indicates the value of the department. For example: OU=Department1,OU=SASE DingTalk.</li>
         * <li>When the user group type is <strong>email</strong>, this indicates the value of the email. For example: <a href="mailto:username@example.com">username@example.com</a>.</li>
         * <li>When the user group type is <strong>telephone</strong>, this indicates the value of the mobile phone. For example: 13900001234.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OU=部门1,OU=SASE钉钉</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes self = new ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes setIdpId(Integer idpId) {
            this.idpId = idpId;
            return this;
        }
        public Integer getIdpId() {
            return this.idpId;
        }

        public ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPrivateAccessPolicesResponseBodyPolices extends TeaModel {
        /**
         * <p>The collection of application IDs of the private access policy. This field has a value when the application type is <strong>Application</strong>.</p>
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
         * <p>The creation time of the private access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-10 15:50:23</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The collection of custom user group attributes. Multiple custom user group attributes have an OR relationship and take effect by union.</p>
         */
        @NameInMap("CustomUserAttributes")
        public java.util.List<ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes> customUserAttributes;

        /**
         * <p>The description of the private access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条内网访问策略</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The action to take when the security baseline is not met. Valid values:</p>
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
         * <p>The name of the private access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>private_access_policy_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The action of the private access policy. Valid values:</p>
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
         * <p>The ID of the private access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-policy-63b2f1844b86****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The priority of the private access policy. A value of 1 indicates the highest priority.</p>
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
         * <p>The collection of tag IDs of the private access policy. This field has a value when the application type is <strong>Tag</strong>.</p>
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
         * <p>The list of trusted process group IDs.</p>
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
         * <p>Enabled</p>
         */
        @NameInMap("TrustedProcessStatus")
        public String trustedProcessStatus;

        /**
         * <p>The list of trusted software IDs.</p>
         */
        @NameInMap("TrustedSoftwareIds")
        public java.util.List<String> trustedSoftwareIds;

        /**
         * <p>The collection of user group IDs for the private access policy. This field has a value when the user group type is <strong>Normal</strong>.</p>
         */
        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        /**
         * <p>The user group type of the private access policy. Valid values:</p>
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

        /**
         * <p>The effective start time of the zero trust policy, in second-level Unix timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ValidFrom")
        public Long validFrom;

        /**
         * <p>The status of the effective time switch. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("ValidTimeStatus")
        public String validTimeStatus;

        /**
         * <p>The effective end time of the zero trust policy, in second-level Unix timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1764727544</p>
         */
        @NameInMap("ValidUntil")
        public Long validUntil;

        public static ListPrivateAccessPolicesResponseBodyPolices build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessPolicesResponseBodyPolices self = new ListPrivateAccessPolicesResponseBodyPolices();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessPolicesResponseBodyPolices setApplicationIds(java.util.List<String> applicationIds) {
            this.applicationIds = applicationIds;
            return this;
        }
        public java.util.List<String> getApplicationIds() {
            return this.applicationIds;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setCustomUserAttributes(java.util.List<ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes> customUserAttributes) {
            this.customUserAttributes = customUserAttributes;
            return this;
        }
        public java.util.List<ListPrivateAccessPolicesResponseBodyPolicesCustomUserAttributes> getCustomUserAttributes() {
            return this.customUserAttributes;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setDeviceAttributeAction(String deviceAttributeAction) {
            this.deviceAttributeAction = deviceAttributeAction;
            return this;
        }
        public String getDeviceAttributeAction() {
            return this.deviceAttributeAction;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setDeviceAttributeId(String deviceAttributeId) {
            this.deviceAttributeId = deviceAttributeId;
            return this;
        }
        public String getDeviceAttributeId() {
            return this.deviceAttributeId;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setPolicyAction(String policyAction) {
            this.policyAction = policyAction;
            return this;
        }
        public String getPolicyAction() {
            return this.policyAction;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setTriggerTemplateId(String triggerTemplateId) {
            this.triggerTemplateId = triggerTemplateId;
            return this;
        }
        public String getTriggerTemplateId() {
            return this.triggerTemplateId;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setTrustedProcessGroupIds(java.util.List<String> trustedProcessGroupIds) {
            this.trustedProcessGroupIds = trustedProcessGroupIds;
            return this;
        }
        public java.util.List<String> getTrustedProcessGroupIds() {
            return this.trustedProcessGroupIds;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setTrustedProcessStatus(String trustedProcessStatus) {
            this.trustedProcessStatus = trustedProcessStatus;
            return this;
        }
        public String getTrustedProcessStatus() {
            return this.trustedProcessStatus;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setTrustedSoftwareIds(java.util.List<String> trustedSoftwareIds) {
            this.trustedSoftwareIds = trustedSoftwareIds;
            return this;
        }
        public java.util.List<String> getTrustedSoftwareIds() {
            return this.trustedSoftwareIds;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setUserGroupMode(String userGroupMode) {
            this.userGroupMode = userGroupMode;
            return this;
        }
        public String getUserGroupMode() {
            return this.userGroupMode;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setValidFrom(Long validFrom) {
            this.validFrom = validFrom;
            return this;
        }
        public Long getValidFrom() {
            return this.validFrom;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setValidTimeStatus(String validTimeStatus) {
            this.validTimeStatus = validTimeStatus;
            return this;
        }
        public String getValidTimeStatus() {
            return this.validTimeStatus;
        }

        public ListPrivateAccessPolicesResponseBodyPolices setValidUntil(Long validUntil) {
            this.validUntil = validUntil;
            return this;
        }
        public Long getValidUntil() {
            return this.validUntil;
        }

    }

}
