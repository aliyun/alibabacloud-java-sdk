// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetBotKnowledgeStatDataRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RobotInstanceId")
    public String robotInstanceId;

    @NameInMap("StartTime")
    public String startTime;

    public static GetBotKnowledgeStatDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBotKnowledgeStatDataRequest self = new GetBotKnowledgeStatDataRequest();
        return TeaModel.build(map, self);
    }

    public GetBotKnowledgeStatDataRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetBotKnowledgeStatDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetBotKnowledgeStatDataRequest setRobotInstanceId(String robotInstanceId) {
        this.robotInstanceId = robotInstanceId;
        return this;
    }
    public String getRobotInstanceId() {
        return this.robotInstanceId;
    }

    public GetBotKnowledgeStatDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
