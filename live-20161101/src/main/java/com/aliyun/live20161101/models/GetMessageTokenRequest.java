// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageTokenRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("UserId")
    public String userId;

    public static GetMessageTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessageTokenRequest self = new GetMessageTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetMessageTokenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMessageTokenRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetMessageTokenRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public GetMessageTokenRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
