// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotColdDsDatasRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("RobotInstanceId")
    public String robotInstanceId;

    @NameInMap("StartTime")
    public String startTime;

    public static ListBotColdDsDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBotColdDsDatasRequest self = new ListBotColdDsDatasRequest();
        return TeaModel.build(map, self);
    }

    public ListBotColdDsDatasRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListBotColdDsDatasRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListBotColdDsDatasRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListBotColdDsDatasRequest setRobotInstanceId(String robotInstanceId) {
        this.robotInstanceId = robotInstanceId;
        return this;
    }
    public String getRobotInstanceId() {
        return this.robotInstanceId;
    }

    public ListBotColdDsDatasRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
