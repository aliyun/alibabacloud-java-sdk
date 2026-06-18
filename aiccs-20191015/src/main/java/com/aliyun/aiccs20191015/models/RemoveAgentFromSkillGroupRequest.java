// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class RemoveAgentFromSkillGroupRequest extends TeaModel {
    /**
     * <p>A list of agent IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentIds")
    public java.util.List<Long> agentIds;

    /**
     * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-78v1gnp97002</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Skill group ID.  </p>
     * <p>You can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> API and view the <strong>SkillGroupId</strong> in the response parameters to obtain the skill group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1146****</p>
     */
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
