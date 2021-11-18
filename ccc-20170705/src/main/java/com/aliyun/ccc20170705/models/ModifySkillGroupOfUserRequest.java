// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifySkillGroupOfUserRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RoleId")
    public java.util.List<String> roleId;

    @NameInMap("SkillGroupId")
    public java.util.List<String> skillGroupId;

    @NameInMap("SkillLevel")
    public java.util.List<Integer> skillLevel;

    @NameInMap("UserId")
    public String userId;

    public static ModifySkillGroupOfUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySkillGroupOfUserRequest self = new ModifySkillGroupOfUserRequest();
        return TeaModel.build(map, self);
    }

    public ModifySkillGroupOfUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifySkillGroupOfUserRequest setRoleId(java.util.List<String> roleId) {
        this.roleId = roleId;
        return this;
    }
    public java.util.List<String> getRoleId() {
        return this.roleId;
    }

    public ModifySkillGroupOfUserRequest setSkillGroupId(java.util.List<String> skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public java.util.List<String> getSkillGroupId() {
        return this.skillGroupId;
    }

    public ModifySkillGroupOfUserRequest setSkillLevel(java.util.List<Integer> skillLevel) {
        this.skillLevel = skillLevel;
        return this;
    }
    public java.util.List<Integer> getSkillLevel() {
        return this.skillLevel;
    }

    public ModifySkillGroupOfUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
