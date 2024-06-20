// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddSkillGroupsToUserRequest extends TeaModel {
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
     * <p>[{&quot;skillGroupId&quot;:&quot;test1@ccc-test&quot;,&quot;skillLevel&quot;:5},{&quot;skillGroupId&quot;:&quot;test2@ccc-test&quot;,&quot;skillLevel&quot;:5}]</p>
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

    public static AddSkillGroupsToUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSkillGroupsToUserRequest self = new AddSkillGroupsToUserRequest();
        return TeaModel.build(map, self);
    }

    public AddSkillGroupsToUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSkillGroupsToUserRequest setSkillLevelList(String skillLevelList) {
        this.skillLevelList = skillLevelList;
        return this;
    }
    public String getSkillLevelList() {
        return this.skillLevelList;
    }

    public AddSkillGroupsToUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
