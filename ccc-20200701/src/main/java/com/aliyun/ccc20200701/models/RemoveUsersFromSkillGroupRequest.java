// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemoveUsersFromSkillGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserIdList")
    public String userIdList;

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

    public RemoveUsersFromSkillGroupRequest setUserIdList(String userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public String getUserIdList() {
        return this.userIdList;
    }

}
