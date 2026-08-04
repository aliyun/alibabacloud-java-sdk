// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CreatePlayingListOAuth2ShrinkRequest extends TeaModel {
    /**
     * <p>Device identification information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <p>Business parameters</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OpenCreatePlayingListRequest")
    public String openCreatePlayingListRequestShrink;

    public static CreatePlayingListOAuth2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePlayingListOAuth2ShrinkRequest self = new CreatePlayingListOAuth2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePlayingListOAuth2ShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public CreatePlayingListOAuth2ShrinkRequest setOpenCreatePlayingListRequestShrink(String openCreatePlayingListRequestShrink) {
        this.openCreatePlayingListRequestShrink = openCreatePlayingListRequestShrink;
        return this;
    }
    public String getOpenCreatePlayingListRequestShrink() {
        return this.openCreatePlayingListRequestShrink;
    }

}
