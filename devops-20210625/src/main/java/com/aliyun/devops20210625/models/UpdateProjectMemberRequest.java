// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProjectMemberRequest extends TeaModel {
    @NameInMap("roleIdentifier")
    public String roleIdentifier;

    @NameInMap("targetIdentifier")
    public String targetIdentifier;

    @NameInMap("targetType")
    public String targetType;

    @NameInMap("userIdentifier")
    public String userIdentifier;

    @NameInMap("userType")
    public String userType;

    public static UpdateProjectMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectMemberRequest self = new UpdateProjectMemberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectMemberRequest setRoleIdentifier(String roleIdentifier) {
        this.roleIdentifier = roleIdentifier;
        return this;
    }
    public String getRoleIdentifier() {
        return this.roleIdentifier;
    }

    public UpdateProjectMemberRequest setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
        return this;
    }
    public String getTargetIdentifier() {
        return this.targetIdentifier;
    }

    public UpdateProjectMemberRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public UpdateProjectMemberRequest setUserIdentifier(String userIdentifier) {
        this.userIdentifier = userIdentifier;
        return this;
    }
    public String getUserIdentifier() {
        return this.userIdentifier;
    }

    public UpdateProjectMemberRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
