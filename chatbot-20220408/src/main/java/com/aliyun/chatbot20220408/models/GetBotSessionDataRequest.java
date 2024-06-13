// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetBotSessionDataRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RobotInstanceId")
    public String robotInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetBotSessionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBotSessionDataRequest self = new GetBotSessionDataRequest();
        return TeaModel.build(map, self);
    }

    public GetBotSessionDataRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetBotSessionDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetBotSessionDataRequest setRobotInstanceId(String robotInstanceId) {
        this.robotInstanceId = robotInstanceId;
        return this;
    }
    public String getRobotInstanceId() {
        return this.robotInstanceId;
    }

    public GetBotSessionDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
