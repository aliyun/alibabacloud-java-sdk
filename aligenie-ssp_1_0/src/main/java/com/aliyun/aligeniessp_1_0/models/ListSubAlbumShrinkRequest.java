// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListSubAlbumShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <p>request</p>
     */
    @NameInMap("QuerySubscriptionAlbumRequest")
    public String querySubscriptionAlbumRequestShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static ListSubAlbumShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubAlbumShrinkRequest self = new ListSubAlbumShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSubAlbumShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public ListSubAlbumShrinkRequest setQuerySubscriptionAlbumRequestShrink(String querySubscriptionAlbumRequestShrink) {
        this.querySubscriptionAlbumRequestShrink = querySubscriptionAlbumRequestShrink;
        return this;
    }
    public String getQuerySubscriptionAlbumRequestShrink() {
        return this.querySubscriptionAlbumRequestShrink;
    }

    public ListSubAlbumShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
