// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class SearchContentShrinkRequest extends TeaModel {
    /**
     * <p>Device identification information</p>
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
     * <p>User identification information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static SearchContentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchContentShrinkRequest self = new SearchContentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchContentShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public SearchContentShrinkRequest setRequestShrink(String requestShrink) {
        this.requestShrink = requestShrink;
        return this;
    }
    public String getRequestShrink() {
        return this.requestShrink;
    }

    public SearchContentShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
