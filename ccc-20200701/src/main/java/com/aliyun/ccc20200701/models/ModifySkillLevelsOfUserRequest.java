// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifySkillLevelsOfUserRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillLevelList")
    public String skillLevelList;

    @NameInMap("UserId")
    public String userId;

    public static ModifySkillLevelsOfUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySkillLevelsOfUserRequest self = new ModifySkillLevelsOfUserRequest();
        return TeaModel.build(map, self);
    }

    public ModifySkillLevelsOfUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifySkillLevelsOfUserRequest setSkillLevelList(String skillLevelList) {
        this.skillLevelList = skillLevelList;
        return this;
    }
    public String getSkillLevelList() {
        return this.skillLevelList;
    }

    public ModifySkillLevelsOfUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
