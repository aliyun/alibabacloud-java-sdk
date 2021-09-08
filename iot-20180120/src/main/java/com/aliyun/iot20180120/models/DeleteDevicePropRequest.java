// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDevicePropRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("PropKey")
    public String propKey;

    @NameInMap("IotId")
    public String iotId;

    public static DeleteDevicePropRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevicePropRequest self = new DeleteDevicePropRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDevicePropRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteDevicePropRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public DeleteDevicePropRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public DeleteDevicePropRequest setPropKey(String propKey) {
        this.propKey = propKey;
        return this;
    }
    public String getPropKey() {
        return this.propKey;
    }

    public DeleteDevicePropRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

}
