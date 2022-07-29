// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListRecommendContentShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("Request")
    public String requestShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static ListRecommendContentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecommendContentShrinkRequest self = new ListRecommendContentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListRecommendContentShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public ListRecommendContentShrinkRequest setRequestShrink(String requestShrink) {
        this.requestShrink = requestShrink;
        return this;
    }
    public String getRequestShrink() {
        return this.requestShrink;
    }

    public ListRecommendContentShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
