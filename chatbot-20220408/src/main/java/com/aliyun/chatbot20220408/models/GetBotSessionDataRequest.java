// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetBotSessionDataRequest extends TeaModel {
    /**
     * <p>The key for the workspace. If you omit this parameter, the operation uses the default workspace. You can find the key on the business management page of your main account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The end time for the query. The format must be <code>yyyyMMdd</code>. For example: <code>20240605</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20240605</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the bot instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-7QuUfaqMQe</p>
     */
    @NameInMap("RobotInstanceId")
    public String robotInstanceId;

    /**
     * <p>The start time for the query. The format must be <code>yyyyMMdd</code>. For example: <code>20240505</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20240505</p>
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
