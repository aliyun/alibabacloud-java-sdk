// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIMRobotRequest extends TeaModel {
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
    public Long robotId;

    // 告警机器人名称
    @NameInMap("RobotName")
    public String robotName;

    // 告警机器人类型:dingding/wechat
    @NameInMap("Type")
    public String type;

    public static CreateOrUpdateIMRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateIMRobotRequest self = new CreateOrUpdateIMRobotRequest();
        return TeaModel.build(map, self);
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

    public CreateOrUpdateIMRobotRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
