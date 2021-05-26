// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAutoTaskRequest extends TeaModel {
    @NameInMap("TaskRuleGroupData")
    public String taskRuleGroupData;

    @NameInMap("AgentId")
    public Long agentId;

    public static CreateOrUpdateAutoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAutoTaskRequest self = new CreateOrUpdateAutoTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAutoTaskRequest setTaskRuleGroupData(String taskRuleGroupData) {
        this.taskRuleGroupData = taskRuleGroupData;
        return this;
    }
    public String getTaskRuleGroupData() {
        return this.taskRuleGroupData;
    }

    public CreateOrUpdateAutoTaskRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

}
