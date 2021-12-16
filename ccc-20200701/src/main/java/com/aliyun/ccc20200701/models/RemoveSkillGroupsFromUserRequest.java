// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemoveSkillGroupsFromUserRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillGroupIdList")
    public String skillGroupIdList;

    @NameInMap("UserId")
    public String userId;

    public static RemoveSkillGroupsFromUserRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSkillGroupsFromUserRequest self = new RemoveSkillGroupsFromUserRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSkillGroupsFromUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveSkillGroupsFromUserRequest setSkillGroupIdList(String skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    public RemoveSkillGroupsFromUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
