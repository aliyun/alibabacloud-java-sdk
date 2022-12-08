// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UnbindPictureSearchAppWithDevicesRequest extends TeaModel {
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    @NameInMap("DeviceIotIds")
    public java.util.List<String> deviceIotIds;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static UnbindPictureSearchAppWithDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindPictureSearchAppWithDevicesRequest self = new UnbindPictureSearchAppWithDevicesRequest();
        return TeaModel.build(map, self);
    }

    public UnbindPictureSearchAppWithDevicesRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public UnbindPictureSearchAppWithDevicesRequest setDeviceIotIds(java.util.List<String> deviceIotIds) {
        this.deviceIotIds = deviceIotIds;
        return this;
    }
    public java.util.List<String> getDeviceIotIds() {
        return this.deviceIotIds;
    }

    public UnbindPictureSearchAppWithDevicesRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
