// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class RemoveAgentFromSkillGroupRequest extends TeaModel {
    // 坐席列表
    @NameInMap("AgentIds")
    public java.util.List<Long> agentIds;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 技能组id
    @NameInMap("SkillGroupId")
    public Long skillGroupId;

    public static RemoveAgentFromSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAgentFromSkillGroupRequest self = new RemoveAgentFromSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAgentFromSkillGroupRequest setAgentIds(java.util.List<Long> agentIds) {
        this.agentIds = agentIds;
        return this;
    }
    public java.util.List<Long> getAgentIds() {
        return this.agentIds;
    }

    public RemoveAgentFromSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveAgentFromSkillGroupRequest setSkillGroupId(Long skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public Long getSkillGroupId() {
        return this.skillGroupId;
    }

}
