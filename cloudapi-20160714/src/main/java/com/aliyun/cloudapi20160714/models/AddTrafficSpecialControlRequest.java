// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AddTrafficSpecialControlRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("SpecialKey")
    public String specialKey;

    /**
     * <p>The special throttling value.</p>
     */
    @NameInMap("SpecialType")
    public String specialType;

    /**
     * <p>The ID of the app or Alibaba Cloud account. Specify this parameter based on the value of the **SpecialType** parameter. You can view your account ID on the [Account Management](https://account.console.aliyun.com/?spm=a2c4g.11186623.2.15.3f053654YpMPwo#/secure) page.</p>
     */
    @NameInMap("TrafficControlId")
    public String trafficControlId;

    /**
     * <p>*   This API is intended for API providers.</p>
     * <p>*   If the input SpecialKey already exists, the previous configuration is overwritten. Use caution when calling this operation.</p>
     * <p>*   Special throttling policies must be added to an existing throttling policy, and can take effect on all the APIs to which the throttling policy is bound.</p>
     */
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
