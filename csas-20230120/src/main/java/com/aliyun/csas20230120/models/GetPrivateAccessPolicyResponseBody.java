// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetPrivateAccessPolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    public GetPrivateAccessPolicyResponseBodyPolicy policy;

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
        @NameInMap("IdpId")
        public Integer idpId;

        @NameInMap("Relation")
        public String relation;

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

        @NameInMap("ApplicationType")
        public String applicationType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomUserAttributes")
        public java.util.List<GetPrivateAccessPolicyResponseBodyPolicyCustomUserAttributes> customUserAttributes;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceAttributeId")
        public String deviceAttributeId;

        @NameInMap("Name")
        public String name;

        @NameInMap("PolicyAction")
        public String policyAction;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Status")
        public String status;

        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

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
