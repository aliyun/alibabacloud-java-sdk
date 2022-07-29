// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListSubShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("Page")
    public String pageShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static ListSubShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubShrinkRequest self = new ListSubShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSubShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public ListSubShrinkRequest setPageShrink(String pageShrink) {
        this.pageShrink = pageShrink;
        return this;
    }
    public String getPageShrink() {
        return this.pageShrink;
    }

    public ListSubShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
