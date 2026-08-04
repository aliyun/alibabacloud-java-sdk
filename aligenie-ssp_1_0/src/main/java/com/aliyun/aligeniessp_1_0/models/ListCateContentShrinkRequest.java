// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListCateContentShrinkRequest extends TeaModel {
    /**
     * <p>Device identifier information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <p>Request Parameters</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Request")
    public String requestShrink;

    /**
     * <p>User identifier information</p>
     * <p>This parameter is required.</p>
     */
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
