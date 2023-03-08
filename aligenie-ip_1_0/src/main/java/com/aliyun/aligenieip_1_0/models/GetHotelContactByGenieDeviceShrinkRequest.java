// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelContactByGenieDeviceShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static GetHotelContactByGenieDeviceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelContactByGenieDeviceShrinkRequest self = new GetHotelContactByGenieDeviceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelContactByGenieDeviceShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public GetHotelContactByGenieDeviceShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
