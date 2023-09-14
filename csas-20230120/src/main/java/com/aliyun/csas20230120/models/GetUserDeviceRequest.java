// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetUserDeviceRequest extends TeaModel {
    @NameInMap("DeviceTag")
    public String deviceTag;

    public static GetUserDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserDeviceRequest self = new GetUserDeviceRequest();
        return TeaModel.build(map, self);
    }

    public GetUserDeviceRequest setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }
    public String getDeviceTag() {
        return this.deviceTag;
    }

}
