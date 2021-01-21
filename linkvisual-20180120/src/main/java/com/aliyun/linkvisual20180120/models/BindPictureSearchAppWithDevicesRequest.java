// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class BindPictureSearchAppWithDevicesRequest extends TeaModel {
    @NameInMap("AppInstanceId")
    @Validation(required = true)
    public String appInstanceId;

    @NameInMap("DeviceIotIds")
    @Validation(required = true)
    public java.util.List<String> deviceIotIds;

    public static BindPictureSearchAppWithDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        BindPictureSearchAppWithDevicesRequest self = new BindPictureSearchAppWithDevicesRequest();
        return TeaModel.build(map, self);
    }

    public BindPictureSearchAppWithDevicesRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public BindPictureSearchAppWithDevicesRequest setDeviceIotIds(java.util.List<String> deviceIotIds) {
        this.deviceIotIds = deviceIotIds;
        return this;
    }
    public java.util.List<String> getDeviceIotIds() {
        return this.deviceIotIds;
    }

}
