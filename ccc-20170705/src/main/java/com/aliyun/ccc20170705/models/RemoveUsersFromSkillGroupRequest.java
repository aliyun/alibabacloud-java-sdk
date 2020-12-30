// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class RemoveUsersFromSkillGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    @NameInMap("UserId")
    public java.util.List<String> userId;

    public static RemoveUsersFromSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersFromSkillGroupRequest self = new RemoveUsersFromSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUsersFromSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveUsersFromSkillGroupRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public RemoveUsersFromSkillGroupRequest setUserId(java.util.List<String> userId) {
        this.userId = userId;
        return this;
    }
    public java.util.List<String> getUserId() {
        return this.userId;
    }

}
