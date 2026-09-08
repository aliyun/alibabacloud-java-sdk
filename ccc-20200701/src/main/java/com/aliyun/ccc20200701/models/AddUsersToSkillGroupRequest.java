// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddUsersToSkillGroupRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Skill group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1@ccc-test</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    /**
     * <p>A list of agent skill levels in the skill group, formatted as a JSON array string. Each array element is an object containing two fields: userId and skillLevel. The userId field specifies the ID of the agent to be added, and the skillLevel field specifies the agent\&quot;s skill level after joining the skill group. Skill levels range from 1 to 10; a lower value indicates stronger service capability and the ability to handle more calls per unit time.</p>
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
