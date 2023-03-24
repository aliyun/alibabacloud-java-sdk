// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessPolicyShrinkRequest extends TeaModel {
    @NameInMap("ApplicationIds")
    public String applicationIdsShrink;

    @NameInMap("ApplicationType")
    public String applicationType;

    @NameInMap("CustomUserAttributes")
    public String customUserAttributesShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("PolicyAction")
    public String policyAction;

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

    public static CreatePrivateAccessPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateAccessPolicyShrinkRequest self = new CreatePrivateAccessPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrivateAccessPolicyShrinkRequest setApplicationIdsShrink(String applicationIdsShrink) {
        this.applicationIdsShrink = applicationIdsShrink;
        return this;
    }
    public String getApplicationIdsShrink() {
        return this.applicationIdsShrink;
    }

    public CreatePrivateAccessPolicyShrinkRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public CreatePrivateAccessPolicyShrinkRequest setCustomUserAttributesShrink(String customUserAttributesShrink) {
        this.customUserAttributesShrink = customUserAttributesShrink;
        return this;
    }
    public String getCustomUserAttributesShrink() {
        return this.customUserAttributesShrink;
    }

    public CreatePrivateAccessPolicyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePrivateAccessPolicyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePrivateAccessPolicyShrinkRequest setPolicyAction(String policyAction) {
        this.policyAction = policyAction;
        return this;
    }
    public String getPolicyAction() {
        return this.policyAction;
    }

    public CreatePrivateAccessPolicyShrinkRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreatePrivateAccessPolicyShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreatePrivateAccessPolicyShrinkRequest setTagIdsShrink(String tagIdsShrink) {
        this.tagIdsShrink = tagIdsShrink;
        return this;
    }
    public String getTagIdsShrink() {
        return this.tagIdsShrink;
    }

    public CreatePrivateAccessPolicyShrinkRequest setUserGroupIdsShrink(String userGroupIdsShrink) {
        this.userGroupIdsShrink = userGroupIdsShrink;
        return this;
    }
    public String getUserGroupIdsShrink() {
        return this.userGroupIdsShrink;
    }

    public CreatePrivateAccessPolicyShrinkRequest setUserGroupMode(String userGroupMode) {
        this.userGroupMode = userGroupMode;
        return this;
    }
    public String getUserGroupMode() {
        return this.userGroupMode;
    }

}
