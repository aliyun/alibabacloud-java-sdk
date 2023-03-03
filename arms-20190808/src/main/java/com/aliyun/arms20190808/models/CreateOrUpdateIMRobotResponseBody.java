// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIMRobotResponseBody extends TeaModel {
    /**
     * <p>Returns an AlertRobot object.</p>
     */
    @NameInMap("AlertRobot")
    public CreateOrUpdateIMRobotResponseBodyAlertRobot alertRobot;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The configurations of the alert card template.</p>
         */
        @NameInMap("CardTemplate")
        public String cardTemplate;

        /**
         * <p>Specifies whether to send daily statistics.</p>
         * <br>
         * <p>*   `false` (default): does not send statistics.</p>
         * <p>*   `true`: sends statistics.</p>
         */
        @NameInMap("DailyNoc")
        public Boolean dailyNoc;

        /**
         * <p>The time when the daily statistics are sent. ARMS Alert Management sends the total number of alerts generated today, the number of resolved alerts, and the number of pending alerts at the specified time point.</p>
         */
        @NameInMap("DailyNocTime")
        public String dailyNocTime;

        /**
         * <p>Indicates whether the Outgoing feature is enabled.</p>
         */
        @NameInMap("EnableOutgoing")
        public Boolean enableOutgoing;

        /**
         * <p>The webhook address of the IM bot.</p>
         */
        @NameInMap("RobotAddress")
        public String robotAddress;

        /**
         * <p>The ID of the IM bot.</p>
         */
        @NameInMap("RobotId")
        public Float robotId;

        /**
         * <p>The name of the IM robot.</p>
         */
        @NameInMap("RobotName")
        public String robotName;

        /**
         * <p>The token required to enable the Outgoing feature.</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>IM Robot Type:</p>
         * <br>
         * <p>*   `dingding`: DingTalk robot.</p>
         * <p>*   `wechat`: Enterprise WeChat Robot.</p>
         */
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
