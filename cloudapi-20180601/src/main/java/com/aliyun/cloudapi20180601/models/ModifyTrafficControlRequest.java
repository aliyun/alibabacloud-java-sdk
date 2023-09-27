// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class ModifyTrafficControlRequest extends TeaModel {
    @NameInMap("ApiDefault")
    public Integer apiDefault;

    @NameInMap("AppDefault")
    public Integer appDefault;

    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("TrafficControlId")
    public String trafficControlId;

    @NameInMap("TrafficControlName")
    public String trafficControlName;

    @NameInMap("TrafficControlUnit")
    public String trafficControlUnit;

    @NameInMap("UserDefault")
    public Integer userDefault;

    public static ModifyTrafficControlRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrafficControlRequest self = new ModifyTrafficControlRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTrafficControlRequest setApiDefault(Integer apiDefault) {
        this.apiDefault = apiDefault;
        return this;
    }
    public Integer getApiDefault() {
        return this.apiDefault;
    }

    public ModifyTrafficControlRequest setAppDefault(Integer appDefault) {
        this.appDefault = appDefault;
        return this;
    }
    public Integer getAppDefault() {
        return this.appDefault;
    }

    public ModifyTrafficControlRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyTrafficControlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyTrafficControlRequest setTrafficControlId(String trafficControlId) {
        this.trafficControlId = trafficControlId;
        return this;
    }
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

    public ModifyTrafficControlRequest setTrafficControlName(String trafficControlName) {
        this.trafficControlName = trafficControlName;
        return this;
    }
    public String getTrafficControlName() {
        return this.trafficControlName;
    }

    public ModifyTrafficControlRequest setTrafficControlUnit(String trafficControlUnit) {
        this.trafficControlUnit = trafficControlUnit;
        return this;
    }
    public String getTrafficControlUnit() {
        return this.trafficControlUnit;
    }

    public ModifyTrafficControlRequest setUserDefault(Integer userDefault) {
        this.userDefault = userDefault;
        return this;
    }
    public Integer getUserDefault() {
        return this.userDefault;
    }

}
