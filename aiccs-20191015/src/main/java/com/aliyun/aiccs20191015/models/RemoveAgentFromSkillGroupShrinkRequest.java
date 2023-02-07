// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class RemoveAgentFromSkillGroupShrinkRequest extends TeaModel {
    @NameInMap("AgentIds")
    public String agentIdsShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillGroupId")
    public Long skillGroupId;

    public static RemoveAgentFromSkillGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAgentFromSkillGroupShrinkRequest self = new RemoveAgentFromSkillGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAgentFromSkillGroupShrinkRequest setAgentIdsShrink(String agentIdsShrink) {
        this.agentIdsShrink = agentIdsShrink;
        return this;
    }
    public String getAgentIdsShrink() {
        return this.agentIdsShrink;
    }

    public RemoveAgentFromSkillGroupShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveAgentFromSkillGroupShrinkRequest setSkillGroupId(Long skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public Long getSkillGroupId() {
        return this.skillGroupId;
    }

}
