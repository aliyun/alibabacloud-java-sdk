// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyUserRequest extends TeaModel {
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Email")
    public String email;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("PrivateOutboundNumberId")
    public String privateOutboundNumberId;

    @NameInMap("RoleId")
    public java.util.List<String> roleId;

    @NameInMap("SkillGroupId")
    public java.util.List<String> skillGroupId;

    @NameInMap("SkillLevel")
    public java.util.List<Integer> skillLevel;

    @NameInMap("UserId")
    public String userId;

    public static ModifyUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserRequest self = new ModifyUserRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ModifyUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ModifyUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ModifyUserRequest setPrivateOutboundNumberId(String privateOutboundNumberId) {
        this.privateOutboundNumberId = privateOutboundNumberId;
        return this;
    }
    public String getPrivateOutboundNumberId() {
        return this.privateOutboundNumberId;
    }

    public ModifyUserRequest setRoleId(java.util.List<String> roleId) {
        this.roleId = roleId;
        return this;
    }
    public java.util.List<String> getRoleId() {
        return this.roleId;
    }

    public ModifyUserRequest setSkillGroupId(java.util.List<String> skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public java.util.List<String> getSkillGroupId() {
        return this.skillGroupId;
    }

    public ModifyUserRequest setSkillLevel(java.util.List<Integer> skillLevel) {
        this.skillLevel = skillLevel;
        return this;
    }
    public java.util.List<Integer> getSkillLevel() {
        return this.skillLevel;
    }

    public ModifyUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
