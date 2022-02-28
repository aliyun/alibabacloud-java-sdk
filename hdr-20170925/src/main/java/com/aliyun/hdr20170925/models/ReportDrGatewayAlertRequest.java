// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportDrGatewayAlertRequest extends TeaModel {
    @NameInMap("AlertTime")
    public String alertTime;

    @NameInMap("AlertValue")
    public String alertValue;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Level")
    public String level;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("UserUid")
    public Long userUid;

    public static ReportDrGatewayAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportDrGatewayAlertRequest self = new ReportDrGatewayAlertRequest();
        return TeaModel.build(map, self);
    }

    public ReportDrGatewayAlertRequest setAlertTime(String alertTime) {
        this.alertTime = alertTime;
        return this;
    }
    public String getAlertTime() {
        return this.alertTime;
    }

    public ReportDrGatewayAlertRequest setAlertValue(String alertValue) {
        this.alertValue = alertValue;
        return this;
    }
    public String getAlertValue() {
        return this.alertValue;
    }

    public ReportDrGatewayAlertRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public ReportDrGatewayAlertRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportDrGatewayAlertRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public ReportDrGatewayAlertRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportDrGatewayAlertRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
