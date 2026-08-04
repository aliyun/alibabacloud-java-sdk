// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListAlbumIsAddedShrinkRequest extends TeaModel {
    /**
     * <p>Album ID list</p>
     */
    @NameInMap("AlbumIdList")
    public String albumIdListShrink;

    /**
     * <p>Device Information</p>
     */
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <p>User information</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static ListAlbumIsAddedShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlbumIsAddedShrinkRequest self = new ListAlbumIsAddedShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAlbumIsAddedShrinkRequest setAlbumIdListShrink(String albumIdListShrink) {
        this.albumIdListShrink = albumIdListShrink;
        return this;
    }
    public String getAlbumIdListShrink() {
        return this.albumIdListShrink;
    }

    public ListAlbumIsAddedShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public ListAlbumIsAddedShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
