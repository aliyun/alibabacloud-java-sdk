// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AddAndRemoveFavoriteContentShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OpenAddAndRemoveFavoriteContentRequest")
    public String openAddAndRemoveFavoriteContentRequestShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static AddAndRemoveFavoriteContentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAndRemoveFavoriteContentShrinkRequest self = new AddAndRemoveFavoriteContentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddAndRemoveFavoriteContentShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public AddAndRemoveFavoriteContentShrinkRequest setOpenAddAndRemoveFavoriteContentRequestShrink(String openAddAndRemoveFavoriteContentRequestShrink) {
        this.openAddAndRemoveFavoriteContentRequestShrink = openAddAndRemoveFavoriteContentRequestShrink;
        return this;
    }
    public String getOpenAddAndRemoveFavoriteContentRequestShrink() {
        return this.openAddAndRemoveFavoriteContentRequestShrink;
    }

    public AddAndRemoveFavoriteContentShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
