// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceByUserIdShrinkRequest extends TeaModel {
    // 用户标识信息
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static ListDeviceByUserIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceByUserIdShrinkRequest self = new ListDeviceByUserIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceByUserIdShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
