// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class CreatePlayingListShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OpenCreatePlayingListRequest")
    public String openCreatePlayingListRequestShrink;

    public static CreatePlayingListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePlayingListShrinkRequest self = new CreatePlayingListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePlayingListShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public CreatePlayingListShrinkRequest setOpenCreatePlayingListRequestShrink(String openCreatePlayingListRequestShrink) {
        this.openCreatePlayingListRequestShrink = openCreatePlayingListRequestShrink;
        return this;
    }
    public String getOpenCreatePlayingListRequestShrink() {
        return this.openCreatePlayingListRequestShrink;
    }

}
