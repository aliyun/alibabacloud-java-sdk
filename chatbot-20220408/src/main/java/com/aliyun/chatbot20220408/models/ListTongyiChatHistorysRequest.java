// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListTongyiChatHistorysRequest extends TeaModel {
    /**
     * <p>The key of the business space. If this parameter is not specified, the default business space is accessed. You can obtain the key value on the business management page of the primary account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The end time of the query. The time is in the yyyy-MM-dd HH:mm:ss format, such as 2024-04-01 08:00:00.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-01 08:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of data entries. Default value: 30. Maximum value: 500.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The ID of the robot instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-7QuUfaqMQe</p>
     */
    @NameInMap("RobotInstanceId")
    public String robotInstanceId;

    /**
     * <p>The start time of the query. The time is in the yyyy-MM-dd HH:mm:ss format, such as 2024-04-01 00:00:00.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-01 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListTongyiChatHistorysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTongyiChatHistorysRequest self = new ListTongyiChatHistorysRequest();
        return TeaModel.build(map, self);
    }

    public ListTongyiChatHistorysRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListTongyiChatHistorysRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTongyiChatHistorysRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListTongyiChatHistorysRequest setRobotInstanceId(String robotInstanceId) {
        this.robotInstanceId = robotInstanceId;
        return this;
    }
    public String getRobotInstanceId() {
        return this.robotInstanceId;
    }

    public ListTongyiChatHistorysRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
