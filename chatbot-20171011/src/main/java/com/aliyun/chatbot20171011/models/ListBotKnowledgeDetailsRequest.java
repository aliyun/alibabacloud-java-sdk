// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotKnowledgeDetailsRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Limit")
    public String limit;

    @NameInMap("RobotInstanceId")
    public String robotInstanceId;

    @NameInMap("StartTime")
    public String startTime;

    public static ListBotKnowledgeDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBotKnowledgeDetailsRequest self = new ListBotKnowledgeDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListBotKnowledgeDetailsRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListBotKnowledgeDetailsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListBotKnowledgeDetailsRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public ListBotKnowledgeDetailsRequest setRobotInstanceId(String robotInstanceId) {
        this.robotInstanceId = robotInstanceId;
        return this;
    }
    public String getRobotInstanceId() {
        return this.robotInstanceId;
    }

    public ListBotKnowledgeDetailsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
