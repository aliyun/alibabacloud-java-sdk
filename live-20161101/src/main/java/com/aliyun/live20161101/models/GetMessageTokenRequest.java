// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageTokenRequest extends TeaModel {
    /**
     * <p>Interactive Messages application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a494caec-***-695ef345db77</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Terminal device ID, uniquely representing a user terminal device, user-defined. It consists of lowercase letters, numbers, underscores (_), and hyphens (-), with a maximum length of 64 characters. Different terminal devices need to use different DeviceIds. We recommend obtaining it from the terminal device and passing it to the server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a494caec-***-695ef345db77</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>Terminal device type. Valid values:</p>
     * <ul>
     * <li><p>ios</p>
     * </li>
     * <li><p>android</p>
     * </li>
     * <li><p>web</p>
     * </li>
     * <li><p>pc</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <p>User UserId, user-defined, unique within the AppId. It consists of lowercase letters, numbers, underscores (_), and periods (.), with a maximum length of 32 characters. Different users need to use different UserIds.</p>
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
