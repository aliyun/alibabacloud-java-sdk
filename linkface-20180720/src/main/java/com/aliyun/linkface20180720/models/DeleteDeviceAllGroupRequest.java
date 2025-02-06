// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class DeleteDeviceAllGroupRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("ProductKey")
    public String productKey;

    public static DeleteDeviceAllGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceAllGroupRequest self = new DeleteDeviceAllGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceAllGroupRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public DeleteDeviceAllGroupRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public DeleteDeviceAllGroupRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
