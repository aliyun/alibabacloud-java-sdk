// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AssignUsersRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserRamId")
    public java.util.List<String> userRamId;

    @NameInMap("RoleId")
    public java.util.List<String> roleId;

    @NameInMap("SkillGroupId")
    public java.util.List<String> skillGroupId;

    @NameInMap("SkillLevel")
    public java.util.List<Integer> skillLevel;

    public static AssignUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignUsersRequest self = new AssignUsersRequest();
        return TeaModel.build(map, self);
    }

    public AssignUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssignUsersRequest setUserRamId(java.util.List<String> userRamId) {
        this.userRamId = userRamId;
        return this;
    }
    public java.util.List<String> getUserRamId() {
        return this.userRamId;
    }

    public AssignUsersRequest setRoleId(java.util.List<String> roleId) {
        this.roleId = roleId;
        return this;
    }
    public java.util.List<String> getRoleId() {
        return this.roleId;
    }

    public AssignUsersRequest setSkillGroupId(java.util.List<String> skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public java.util.List<String> getSkillGroupId() {
        return this.skillGroupId;
    }

    public AssignUsersRequest setSkillLevel(java.util.List<Integer> skillLevel) {
        this.skillLevel = skillLevel;
        return this;
    }
    public java.util.List<Integer> getSkillLevel() {
        return this.skillLevel;
    }

}
