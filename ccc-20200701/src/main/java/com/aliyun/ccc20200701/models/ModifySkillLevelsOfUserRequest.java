// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifySkillLevelsOfUserRequest extends TeaModel {
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
     * <p>[{&quot;skillGroupId&quot;:&quot;skillgroup1@ccc-test&quot;,&quot;skillLevel&quot;:1},{&quot;skillGroupId&quot;:&quot;skillgroup2@ccc-test&quot;,&quot;skillLevel&quot;:10}]</p>
     */
    @NameInMap("SkillLevelList")
    public String skillLevelList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
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
