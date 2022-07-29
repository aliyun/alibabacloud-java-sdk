// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListPlayHistoryShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("Request")
    public String requestShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static ListPlayHistoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPlayHistoryShrinkRequest self = new ListPlayHistoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPlayHistoryShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public ListPlayHistoryShrinkRequest setRequestShrink(String requestShrink) {
        this.requestShrink = requestShrink;
        return this;
    }
    public String getRequestShrink() {
        return this.requestShrink;
    }

    public ListPlayHistoryShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
