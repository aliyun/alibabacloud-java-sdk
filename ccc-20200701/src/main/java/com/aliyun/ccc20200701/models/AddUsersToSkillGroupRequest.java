// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddUsersToSkillGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    @NameInMap("UserSkillLevelList")
    public String userSkillLevelList;

    public static AddUsersToSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUsersToSkillGroupRequest self = new AddUsersToSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddUsersToSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddUsersToSkillGroupRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public AddUsersToSkillGroupRequest setUserSkillLevelList(String userSkillLevelList) {
        this.userSkillLevelList = userSkillLevelList;
        return this;
    }
    public String getUserSkillLevelList() {
        return this.userSkillLevelList;
    }

}
