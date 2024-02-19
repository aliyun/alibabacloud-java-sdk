// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeleteTrafficSpecialControlRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SpecialKey")
    public String specialKey;

    @NameInMap("SpecialType")
    public String specialType;

    @NameInMap("TrafficControlId")
    public String trafficControlId;

    public static DeleteTrafficSpecialControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficSpecialControlRequest self = new DeleteTrafficSpecialControlRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficSpecialControlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteTrafficSpecialControlRequest setSpecialKey(String specialKey) {
        this.specialKey = specialKey;
        return this;
    }
    public String getSpecialKey() {
        return this.specialKey;
    }

    public DeleteTrafficSpecialControlRequest setSpecialType(String specialType) {
        this.specialType = specialType;
        return this;
    }
    public String getSpecialType() {
        return this.specialType;
    }

    public DeleteTrafficSpecialControlRequest setTrafficControlId(String trafficControlId) {
        this.trafficControlId = trafficControlId;
        return this;
    }
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

}
