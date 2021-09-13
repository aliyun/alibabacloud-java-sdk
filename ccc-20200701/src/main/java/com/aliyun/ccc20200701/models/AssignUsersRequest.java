// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AssignUsersRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RoleId")
    public String roleId;

    @NameInMap("SkillLevelList")
    public String skillLevelList;

    @NameInMap("RamIdList")
    public String ramIdList;

    @NameInMap("WorkMode")
    public String workMode;

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

    public AssignUsersRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public AssignUsersRequest setSkillLevelList(String skillLevelList) {
        this.skillLevelList = skillLevelList;
        return this;
    }
    public String getSkillLevelList() {
        return this.skillLevelList;
    }

    public AssignUsersRequest setRamIdList(String ramIdList) {
        this.ramIdList = ramIdList;
        return this;
    }
    public String getRamIdList() {
        return this.ramIdList;
    }

    public AssignUsersRequest setWorkMode(String workMode) {
        this.workMode = workMode;
        return this;
    }
    public String getWorkMode() {
        return this.workMode;
    }

}
