// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class AppUseTimeReportShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("Payload")
    public String payloadShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static AppUseTimeReportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AppUseTimeReportShrinkRequest self = new AppUseTimeReportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AppUseTimeReportShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public AppUseTimeReportShrinkRequest setPayloadShrink(String payloadShrink) {
        this.payloadShrink = payloadShrink;
        return this;
    }
    public String getPayloadShrink() {
        return this.payloadShrink;
    }

    public AppUseTimeReportShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
