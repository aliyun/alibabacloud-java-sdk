// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class RemoveFaceDeviceFromDeviceGroupRequest extends TeaModel {
    @NameInMap("IsolationId")
    @Validation(required = true)
    public String isolationId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("DeviceName")
    @Validation(required = true)
    public String deviceName;

    @NameInMap("DeviceGroupId")
    @Validation(required = true)
    public String deviceGroupId;

    public static RemoveFaceDeviceFromDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveFaceDeviceFromDeviceGroupRequest self = new RemoveFaceDeviceFromDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveFaceDeviceFromDeviceGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public RemoveFaceDeviceFromDeviceGroupRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public RemoveFaceDeviceFromDeviceGroupRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public RemoveFaceDeviceFromDeviceGroupRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public RemoveFaceDeviceFromDeviceGroupRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

}
