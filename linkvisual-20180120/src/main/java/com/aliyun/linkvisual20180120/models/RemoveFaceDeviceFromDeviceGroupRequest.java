// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class RemoveFaceDeviceFromDeviceGroupRequest extends TeaModel {
    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("IsolationId")
    public String isolationId;

    @NameInMap("ProductKey")
    public String productKey;

    public static RemoveFaceDeviceFromDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveFaceDeviceFromDeviceGroupRequest self = new RemoveFaceDeviceFromDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveFaceDeviceFromDeviceGroupRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    public RemoveFaceDeviceFromDeviceGroupRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public RemoveFaceDeviceFromDeviceGroupRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public RemoveFaceDeviceFromDeviceGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public RemoveFaceDeviceFromDeviceGroupRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
