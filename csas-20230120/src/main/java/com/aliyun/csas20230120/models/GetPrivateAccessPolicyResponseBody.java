// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetPrivateAccessPolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    public GetPrivateAccessPolicyResponseBodyPolicy policy;

    /**
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
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Relation")
        public String relation;

        /**
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

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
        @NameInMap("ApplicationIds")
        public java.util.List<String> applicationIds;

        /**
         * <strong>example:</strong>
         * <p>Application</p>
         */
        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <strong>example:</strong>
         * <p>2021-07-29 11:26:02</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomUserAttributes")
        public java.util.List<GetPrivateAccessPolicyResponseBodyPolicyCustomUserAttributes> customUserAttributes;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceAttributeAction")
        public String deviceAttributeAction;

        @NameInMap("DeviceAttributeId")
        public String deviceAttributeId;

        /**
         * <strong>example:</strong>
         * <p>private_access_policy_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("PolicyAction")
        public String policyAction;

        /**
         * <strong>example:</strong>
         * <p>pa-policy-63b2f1844b86****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        @NameInMap("TriggerTemplateId")
        public String triggerTemplateId;

        @NameInMap("TrustedProcessGroupIds")
        public java.util.List<String> trustedProcessGroupIds;

        @NameInMap("TrustedProcessStatus")
        public String trustedProcessStatus;

        @NameInMap("TrustedSoftwareIds")
        public java.util.List<String> trustedSoftwareIds;

        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        /**
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
