// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class AgentsTask extends TeaModel {
    // 操作类型
    @NameInMap("ActionType")
    public String actionType;

    // 探针类型
    @NameInMap("AgentType")
    public String agentType;

    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 更新时间
    @NameInMap("GmtModify")
    public String gmtModify;

    // 任务参数
    @NameInMap("Params")
    public String params;

    // 任务状态
    @NameInMap("Status")
    public String status;

    // 任务ID
    @NameInMap("AgentsTaskId")
    public String agentsTaskId;

    public static AgentsTask build(java.util.Map<String, ?> map) throws Exception {
        AgentsTask self = new AgentsTask();
        return TeaModel.build(map, self);
    }

    public AgentsTask setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public AgentsTask setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public AgentsTask setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AgentsTask setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }
    public String getGmtModify() {
        return this.gmtModify;
    }

    public AgentsTask setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public AgentsTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AgentsTask setAgentsTaskId(String agentsTaskId) {
        this.agentsTaskId = agentsTaskId;
        return this;
    }
    public String getAgentsTaskId() {
        return this.agentsTaskId;
    }

}
