// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryAutoTaskInfoRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("AgentId")
    public Long agentId;

    public static QueryAutoTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAutoTaskInfoRequest self = new QueryAutoTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAutoTaskInfoRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public QueryAutoTaskInfoRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

}
