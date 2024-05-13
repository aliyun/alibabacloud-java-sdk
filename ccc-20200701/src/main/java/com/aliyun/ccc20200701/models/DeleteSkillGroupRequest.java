// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteSkillGroupRequest extends TeaModel {
    @NameInMap("Force")
    public Boolean force;

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

    public static DeleteSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSkillGroupRequest self = new DeleteSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSkillGroupRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteSkillGroupRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
