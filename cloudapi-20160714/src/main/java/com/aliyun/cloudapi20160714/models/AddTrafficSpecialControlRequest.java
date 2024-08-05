// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AddTrafficSpecialControlRequest extends TeaModel {
    /**
     * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
     * 
     * <strong>example:</strong>
     * <p>fa876ffb-caab-4f0a-93b3-3409f2fa5199</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the app or Alibaba Cloud account. Specify this parameter based on the value of the <strong>SpecialType</strong> parameter. You can view your account ID on the <a href="https://account.console.aliyun.com/?spm=a2c4g.11186623.2.15.3f053654YpMPwo#/secure">Account Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3382463</p>
     */
    @NameInMap("SpecialKey")
    public String specialKey;

    /**
     * <p>The type of the special throttling policy. Valid values:</p>
     * <ul>
     * <li><strong>APP</strong></li>
     * <li><strong>USER</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APP</p>
     */
    @NameInMap("SpecialType")
    public String specialType;

    /**
     * <p>The ID of the specified throttling policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tf123456</p>
     */
    @NameInMap("TrafficControlId")
    public String trafficControlId;

    /**
     * <p>The special throttling value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
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
