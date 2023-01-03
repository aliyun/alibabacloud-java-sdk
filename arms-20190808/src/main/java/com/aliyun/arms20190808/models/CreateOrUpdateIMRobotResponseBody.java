// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIMRobotResponseBody extends TeaModel {
    // Returns an AlertRobot object.
    @NameInMap("AlertRobot")
    public CreateOrUpdateIMRobotResponseBodyAlertRobot alertRobot;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrUpdateIMRobotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateIMRobotResponseBody self = new CreateOrUpdateIMRobotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateIMRobotResponseBody setAlertRobot(CreateOrUpdateIMRobotResponseBodyAlertRobot alertRobot) {
        this.alertRobot = alertRobot;
        return this;
    }
    public CreateOrUpdateIMRobotResponseBodyAlertRobot getAlertRobot() {
        return this.alertRobot;
    }

    public CreateOrUpdateIMRobotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOrUpdateIMRobotResponseBodyAlertRobot extends TeaModel {
        @NameInMap("CardTemplate")
        public String cardTemplate;

        // Specifies whether to send daily statistics.
        // 
        // *   `false` (default): does not send statistics.
        // *   `true`: sends statistics.
        @NameInMap("DailyNoc")
        public Boolean dailyNoc;

        // The time when the daily statistics are sent. ARMS Alert Management sends the total number of alerts generated today, the number of resolved alerts, and the number of pending alerts at the specified time point.
        @NameInMap("DailyNocTime")
        public String dailyNocTime;

        @NameInMap("EnableOutgoing")
        public Boolean enableOutgoing;

        // The webhook address of the IM bot.
        @NameInMap("RobotAddress")
        public String robotAddress;

        // The ID of the IM bot.
        @NameInMap("RobotId")
        public Float robotId;

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

        public static CreateOrUpdateIMRobotResponseBodyAlertRobot build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIMRobotResponseBodyAlertRobot self = new CreateOrUpdateIMRobotResponseBodyAlertRobot();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIMRobotResponseBodyAlertRobot setCardTemplate(String cardTemplate) {
            this.cardTemplate = cardTemplate;
            return this;
        }
        public String getCardTemplate() {
            return this.cardTemplate;
        }

        public CreateOrUpdateIMRobotResponseBodyAlertRobot setDailyNoc(Boolean dailyNoc) {
            this.dailyNoc = dailyNoc;
            return this;
        }
        public Boolean getDailyNoc() {
            return this.dailyNoc;
        }

        public CreateOrUpdateIMRobotResponseBodyAlertRobot setDailyNocTime(String dailyNocTime) {
            this.dailyNocTime = dailyNocTime;
            return this;
        }
        public String getDailyNocTime() {
            return this.dailyNocTime;
        }

        public CreateOrUpdateIMRobotResponseBodyAlertRobot setEnableOutgoing(Boolean enableOutgoing) {
            this.enableOutgoing = enableOutgoing;
            return this;
        }
        public Boolean getEnableOutgoing() {
            return this.enableOutgoing;
        }

        public CreateOrUpdateIMRobotResponseBodyAlertRobot setRobotAddress(String robotAddress) {
            this.robotAddress = robotAddress;
            return this;
        }
        public String getRobotAddress() {
            return this.robotAddress;
        }

        public CreateOrUpdateIMRobotResponseBodyAlertRobot setRobotId(Float robotId) {
            this.robotId = robotId;
            return this;
        }
        public Float getRobotId() {
            return this.robotId;
        }

        public CreateOrUpdateIMRobotResponseBodyAlertRobot setRobotName(String robotName) {
            this.robotName = robotName;
            return this;
        }
        public String getRobotName() {
            return this.robotName;
        }

        public CreateOrUpdateIMRobotResponseBodyAlertRobot setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public CreateOrUpdateIMRobotResponseBodyAlertRobot setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
