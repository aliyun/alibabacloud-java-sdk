// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class UpdateAlarmShrinkRequest extends TeaModel {
    /**
     * <p>device identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <p>Input parameters for the service request</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public String payloadShrink;

    /**
     * <p>User Identifier Information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static UpdateAlarmShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlarmShrinkRequest self = new UpdateAlarmShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlarmShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public UpdateAlarmShrinkRequest setPayloadShrink(String payloadShrink) {
        this.payloadShrink = payloadShrink;
        return this;
    }
    public String getPayloadShrink() {
        return this.payloadShrink;
    }

    public UpdateAlarmShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
