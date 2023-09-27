// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class AddTrafficSpecialControlRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SpecialKey")
    public String specialKey;

    @NameInMap("SpecialType")
    public String specialType;

    @NameInMap("TrafficControlId")
    public String trafficControlId;

    @NameInMap("TrafficValue")
    public Integer trafficValue;

    public static AddTrafficSpecialControlRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTrafficSpecialControlRequest self = new AddTrafficSpecialControlRequest();
        return TeaModel.build(map, self);
    }

    public AddTrafficSpecialControlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddTrafficSpecialControlRequest setSpecialKey(String specialKey) {
        this.specialKey = specialKey;
        return this;
    }
    public String getSpecialKey() {
        return this.specialKey;
    }

    public AddTrafficSpecialControlRequest setSpecialType(String specialType) {
        this.specialType = specialType;
        return this;
    }
    public String getSpecialType() {
        return this.specialType;
    }

    public AddTrafficSpecialControlRequest setTrafficControlId(String trafficControlId) {
        this.trafficControlId = trafficControlId;
        return this;
    }
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

    public AddTrafficSpecialControlRequest setTrafficValue(Integer trafficValue) {
        this.trafficValue = trafficValue;
        return this;
    }
    public Integer getTrafficValue() {
        return this.trafficValue;
    }

}
