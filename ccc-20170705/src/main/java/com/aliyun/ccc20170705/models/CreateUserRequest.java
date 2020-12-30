// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LoginName")
    public String loginName;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("Email")
    public String email;

    @NameInMap("PrivateOutboundNumberId")
    public String privateOutboundNumberId;

    @NameInMap("RoleId")
    public java.util.List<String> roleId;

    @NameInMap("SkillGroupId")
    public java.util.List<String> skillGroupId;

    @NameInMap("SkillLevel")
    public java.util.List<Integer> skillLevel;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateUserRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public CreateUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateUserRequest setPrivateOutboundNumberId(String privateOutboundNumberId) {
        this.privateOutboundNumberId = privateOutboundNumberId;
        return this;
    }
    public String getPrivateOutboundNumberId() {
        return this.privateOutboundNumberId;
    }

    public CreateUserRequest setRoleId(java.util.List<String> roleId) {
        this.roleId = roleId;
        return this;
    }
    public java.util.List<String> getRoleId() {
        return this.roleId;
    }

    public CreateUserRequest setSkillGroupId(java.util.List<String> skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public java.util.List<String> getSkillGroupId() {
        return this.skillGroupId;
    }

    public CreateUserRequest setSkillLevel(java.util.List<Integer> skillLevel) {
        this.skillLevel = skillLevel;
        return this;
    }
    public java.util.List<Integer> getSkillLevel() {
        return this.skillLevel;
    }

}
