// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceStatusDetailShrinkRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("Keys")
    public String keysShrink;

    public static GetDeviceStatusDetailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatusDetailShrinkRequest self = new GetDeviceStatusDetailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatusDetailShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public GetDeviceStatusDetailShrinkRequest setKeysShrink(String keysShrink) {
        this.keysShrink = keysShrink;
        return this;
    }
    public String getKeysShrink() {
        return this.keysShrink;
    }

}
