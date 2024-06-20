// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddUsersToSkillGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1@ccc-test</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;userId&quot;:&quot;agent1@ccc-test&quot;,&quot;skillLevel&quot;:10},{&quot;userId&quot;:&quot;agent2@ccc-test&quot;,&quot;skillLevel&quot;:10}]</p>
     */
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
