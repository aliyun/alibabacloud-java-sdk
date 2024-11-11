// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetWeatherShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Payload")
    public String payloadShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static GetWeatherShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWeatherShrinkRequest self = new GetWeatherShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetWeatherShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public GetWeatherShrinkRequest setPayloadShrink(String payloadShrink) {
        this.payloadShrink = payloadShrink;
        return this;
    }
    public String getPayloadShrink() {
        return this.payloadShrink;
    }

    public GetWeatherShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
