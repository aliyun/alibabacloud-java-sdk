// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDevicePropertyRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Items")
    public String items;

    @NameInMap("ProductKey")
    public String productKey;

    public static SetDevicePropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDevicePropertyRequest self = new SetDevicePropertyRequest();
        return TeaModel.build(map, self);
    }

    public SetDevicePropertyRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public SetDevicePropertyRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public SetDevicePropertyRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SetDevicePropertyRequest setItems(String items) {
        this.items = items;
        return this;
    }
    public String getItems() {
        return this.items;
    }

    public SetDevicePropertyRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
