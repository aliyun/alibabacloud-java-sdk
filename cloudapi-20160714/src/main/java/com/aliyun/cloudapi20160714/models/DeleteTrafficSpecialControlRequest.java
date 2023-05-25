// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteTrafficSpecialControlRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>*   This API is intended for API providers.</p>
     * <p>*   You can obtain the input parameters required in this operation by calling other APIs.</p>
     */
    @NameInMap("SpecialKey")
    public String specialKey;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("SpecialType")
    public String specialType;

    /**
     * <p>The ID of the app or Alibaba Cloud account. You can view your account ID on the [Account Management](https://account.console.aliyun.com/?spm=a2c4g.11186623.2.15.343130a8sDi8cO#/secure) page.</p>
     */
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
