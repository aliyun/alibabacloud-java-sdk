// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIMRobotResponseBody extends TeaModel {
    @NameInMap("AlertRobot")
    public CreateOrUpdateIMRobotResponseBodyAlertRobot alertRobot;

    // Id of the request
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
        // 是否发送每日统计信息
        @NameInMap("DailyNoc")
        public Boolean dailyNoc;

        // 每日统计发送时间
        @NameInMap("DailyNocTime")
        public String dailyNocTime;

        // 告警机器人地址
        @NameInMap("RobotAddress")
        public String robotAddress;

        // 告警机器人ID
        @NameInMap("RobotId")
        public Float robotId;

        // 告警机器人名称
        @NameInMap("RobotName")
        public String robotName;

        // 告警机器人类型:dingding/wechat
        @NameInMap("Type")
        public String type;

        public static CreateOrUpdateIMRobotResponseBodyAlertRobot build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIMRobotResponseBodyAlertRobot self = new CreateOrUpdateIMRobotResponseBodyAlertRobot();
            return TeaModel.build(map, self);
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

        public CreateOrUpdateIMRobotResponseBodyAlertRobot setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
