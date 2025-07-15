// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageTokenRequest extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a494caec-***-695ef345db77</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the device. Each device has a unique ID. You can specify a custom ID. The ID can be up to 64 characters in length and can contain lowercase letters, digits, underscores (_), and hyphen (-). You can specify multiple device IDs. We recommend that you obtain the IDs from the devices and pass the IDs to the server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a494caec-***-695ef345db77</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>The type of the device. Valid values:</p>
     * <ul>
     * <li>ios</li>
     * <li>android</li>
     * <li>web</li>
     * <li>pc</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <p>The ID of the user. Each user has a unique ID in the application. The ID can be up to 32 characters in length and can contain lowercase letters, digits, underscores (_), and periods (.). You can specify multiple user IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de1**a0</p>
     */
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
