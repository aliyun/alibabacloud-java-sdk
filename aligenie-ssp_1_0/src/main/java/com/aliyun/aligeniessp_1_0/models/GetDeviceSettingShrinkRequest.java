// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceSettingShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("Keys")
    public String keysShrink;

    public static GetDeviceSettingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceSettingShrinkRequest self = new GetDeviceSettingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceSettingShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public GetDeviceSettingShrinkRequest setKeysShrink(String keysShrink) {
        this.keysShrink = keysShrink;
        return this;
    }
    public String getKeysShrink() {
        return this.keysShrink;
    }

}
