// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyUserLevelsOfSkillGroupRequest extends TeaModel {
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
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;userId&quot;:&quot;agent1@ccc-test&quot;,&quot;skillLevel&quot;:1},{&quot;userId&quot;:&quot;agent2@ccc-test&quot;,&quot;skillLevel&quot;:10}]</p>
     */
    @NameInMap("UserLevelList")
    public String userLevelList;

    public static ModifyUserLevelsOfSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserLevelsOfSkillGroupRequest self = new ModifyUserLevelsOfSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserLevelsOfSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyUserLevelsOfSkillGroupRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public ModifyUserLevelsOfSkillGroupRequest setUserLevelList(String userLevelList) {
        this.userLevelList = userLevelList;
        return this;
    }
    public String getUserLevelList() {
        return this.userLevelList;
    }

}
