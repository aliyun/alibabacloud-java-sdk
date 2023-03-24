// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessPolicyShrinkRequest extends TeaModel {
    @NameInMap("ApplicationIds")
    public String applicationIdsShrink;

    @NameInMap("ApplicationType")
    public String applicationType;

    @NameInMap("CustomUserAttributes")
    public String customUserAttributesShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("PolicyAction")
    public String policyAction;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("Status")
    public String status;

    @NameInMap("TagIds")
    public String tagIdsShrink;

    @NameInMap("UserGroupIds")
    public String userGroupIdsShrink;

    @NameInMap("UserGroupMode")
    public String userGroupMode;

    public static UpdatePrivateAccessPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateAccessPolicyShrinkRequest self = new UpdatePrivateAccessPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateAccessPolicyShrinkRequest setApplicationIdsShrink(String applicationIdsShrink) {
        this.applicationIdsShrink = applicationIdsShrink;
        return this;
    }
    public String getApplicationIdsShrink() {
        return this.applicationIdsShrink;
    }

    public UpdatePrivateAccessPolicyShrinkRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public UpdatePrivateAccessPolicyShrinkRequest setCustomUserAttributesShrink(String customUserAttributesShrink) {
        this.customUserAttributesShrink = customUserAttributesShrink;
        return this;
    }
    public String getCustomUserAttributesShrink() {
        return this.customUserAttributesShrink;
    }

    public UpdatePrivateAccessPolicyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePrivateAccessPolicyShrinkRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public UpdatePrivateAccessPolicyShrinkRequest setPolicyAction(String policyAction) {
        this.policyAction = policyAction;
        return this;
    }
    public String getPolicyAction() {
        return this.policyAction;
    }

    public UpdatePrivateAccessPolicyShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdatePrivateAccessPolicyShrinkRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdatePrivateAccessPolicyShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdatePrivateAccessPolicyShrinkRequest setTagIdsShrink(String tagIdsShrink) {
        this.tagIdsShrink = tagIdsShrink;
        return this;
    }
    public String getTagIdsShrink() {
        return this.tagIdsShrink;
    }

    public UpdatePrivateAccessPolicyShrinkRequest setUserGroupIdsShrink(String userGroupIdsShrink) {
        this.userGroupIdsShrink = userGroupIdsShrink;
        return this;
    }
    public String getUserGroupIdsShrink() {
        return this.userGroupIdsShrink;
    }

    public UpdatePrivateAccessPolicyShrinkRequest setUserGroupMode(String userGroupMode) {
        this.userGroupMode = userGroupMode;
        return this;
    }
    public String getUserGroupMode() {
        return this.userGroupMode;
    }

}
