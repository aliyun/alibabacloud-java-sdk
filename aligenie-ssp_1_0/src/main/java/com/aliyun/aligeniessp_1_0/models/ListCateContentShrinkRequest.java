// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListCateContentShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("Request")
    public String requestShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static ListCateContentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCateContentShrinkRequest self = new ListCateContentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCateContentShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public ListCateContentShrinkRequest setRequestShrink(String requestShrink) {
        this.requestShrink = requestShrink;
        return this;
    }
    public String getRequestShrink() {
        return this.requestShrink;
    }

    public ListCateContentShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
