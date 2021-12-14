// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetAuthTokenRequest extends TeaModel {
    // 用户的应用ID，在控制台创建应用时生成
    @NameInMap("AppId")
    public String appId;

    // 终端设备类型,通过控制台创建和查询
    @NameInMap("AppKey")
    public String appKey;

    // 终端设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // cn-shanghai
    @NameInMap("RegionId")
    public String regionId;

    // 用户UserId,在AppId下单独唯一
    @NameInMap("UserId")
    public String userId;

    public static GetAuthTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTokenRequest self = new GetAuthTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthTokenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAuthTokenRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public GetAuthTokenRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetAuthTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAuthTokenRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
