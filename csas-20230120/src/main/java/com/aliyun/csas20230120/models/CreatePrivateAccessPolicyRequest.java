// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessPolicyRequest extends TeaModel {
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    @NameInMap("CustomUserAttributes")
    public java.util.List<CreatePrivateAccessPolicyRequestCustomUserAttributes> customUserAttributes;

    @NameInMap("Description")
    public String description;

    @NameInMap("DeviceAttributeId")
    public String deviceAttributeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyAction")
    public String policyAction;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>内网访问标签ID集合。最多可输入100个内网访问标签ID。当**ApplicationType**为**Tag时**，必填。和**ApplicationIds**互斥。</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>内网访问策略的用户组类型。取值：</p>
     * <p>- **Normal**：普通用户组。</p>
     * <p>- **Custom**：自定义用户组。</p>
     * <br>
     * <p>This parameter is required.</p>
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
        @NameInMap("IdpId")
        public Integer idpId;

        @NameInMap("Relation")
        public String relation;

        @NameInMap("UserGroupType")
        public String userGroupType;

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
