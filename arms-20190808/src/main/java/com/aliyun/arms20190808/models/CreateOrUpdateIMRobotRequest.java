// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIMRobotRequest extends TeaModel {
    @NameInMap("CardTemplate")
    public String cardTemplate;

    // Specifies whether to send daily statistics.
    // 
    // *   `false` (default): does not send statistics.
    // *   `true`: sends statistics. After you select `true`, **DailyNocTime** parameters are required.
    @NameInMap("DailyNoc")
    public Boolean dailyNoc;

    // The time point at which the daily statistics are sent. Separate multiple sending time points with commas (,). The time point is in the HH:SS format. ARMS Alert Management sends the total number of alerts generated today, the number of resolved alerts, and the number of pending alerts at the specified time point.
    @NameInMap("DailyNocTime")
    public String dailyNocTime;

    @NameInMap("DingSignKey")
    public String dingSignKey;

    @NameInMap("EnableOutgoing")
    public Boolean enableOutgoing;

    // The webhook address of the IM bot.
    @NameInMap("RobotAddress")
    public String robotAddress;

    // The ID of the IM bot.
    // 
    // *   If you do not specify this parameter, a new IM bot is created.
    // *   Enter information that represents modifying the specified IM bot.
    @NameInMap("RobotId")
    public Long robotId;

    // The name of the IM robot.
    @NameInMap("RobotName")
    public String robotName;

    @NameInMap("Token")
    public String token;

    // IM Robot Type:
    // 
    // *   `dingding`: DingTalk robot.
    // *   `wechat`: Enterprise WeChat Robot.
    @NameInMap("Type")
    public String type;

    public static CreateOrUpdateIMRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateIMRobotRequest self = new CreateOrUpdateIMRobotRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateIMRobotRequest setCardTemplate(String cardTemplate) {
        this.cardTemplate = cardTemplate;
        return this;
    }
    public String getCardTemplate() {
        return this.cardTemplate;
    }

    public CreateOrUpdateIMRobotRequest setDailyNoc(Boolean dailyNoc) {
        this.dailyNoc = dailyNoc;
        return this;
    }
    public Boolean getDailyNoc() {
        return this.dailyNoc;
    }

    public CreateOrUpdateIMRobotRequest setDailyNocTime(String dailyNocTime) {
        this.dailyNocTime = dailyNocTime;
        return this;
    }
    public String getDailyNocTime() {
        return this.dailyNocTime;
    }

    public CreateOrUpdateIMRobotRequest setDingSignKey(String dingSignKey) {
        this.dingSignKey = dingSignKey;
        return this;
    }
    public String getDingSignKey() {
        return this.dingSignKey;
    }

    public CreateOrUpdateIMRobotRequest setEnableOutgoing(Boolean enableOutgoing) {
        this.enableOutgoing = enableOutgoing;
        return this;
    }
    public Boolean getEnableOutgoing() {
        return this.enableOutgoing;
    }

    public CreateOrUpdateIMRobotRequest setRobotAddress(String robotAddress) {
        this.robotAddress = robotAddress;
        return this;
    }
    public String getRobotAddress() {
        return this.robotAddress;
    }

    public CreateOrUpdateIMRobotRequest setRobotId(Long robotId) {
        this.robotId = robotId;
        return this;
    }
    public Long getRobotId() {
        return this.robotId;
    }

    public CreateOrUpdateIMRobotRequest setRobotName(String robotName) {
        this.robotName = robotName;
        return this;
    }
    public String getRobotName() {
        return this.robotName;
    }

    public CreateOrUpdateIMRobotRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateOrUpdateIMRobotRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
