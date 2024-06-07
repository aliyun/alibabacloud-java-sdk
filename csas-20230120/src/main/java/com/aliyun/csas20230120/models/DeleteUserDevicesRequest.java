// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteUserDevicesRequest extends TeaModel {
    @NameInMap("DeviceTags")
    public java.util.List<String> deviceTags;

    public static DeleteUserDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDevicesRequest self = new DeleteUserDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserDevicesRequest setDeviceTags(java.util.List<String> deviceTags) {
        this.deviceTags = deviceTags;
        return this;
    }
    public java.util.List<String> getDeviceTags() {
        return this.deviceTags;
    }

}
