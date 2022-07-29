// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIMRobotRequest extends TeaModel {
    @NameInMap("CardTemplate")
    public String cardTemplate;

    @NameInMap("DailyNoc")
    public Boolean dailyNoc;

    @NameInMap("DailyNocTime")
    public String dailyNocTime;

    @NameInMap("EnableOutgoing")
    public Boolean enableOutgoing;

    @NameInMap("RobotAddress")
    public String robotAddress;

    @NameInMap("RobotId")
    public Long robotId;

    @NameInMap("RobotName")
    public String robotName;

    @NameInMap("Token")
    public String token;

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
