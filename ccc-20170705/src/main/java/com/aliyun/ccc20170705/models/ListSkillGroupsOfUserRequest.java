// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupsOfUserRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserId")
    public String userId;

    public static ListSkillGroupsOfUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupsOfUserRequest self = new ListSkillGroupsOfUserRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupsOfUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSkillGroupsOfUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
