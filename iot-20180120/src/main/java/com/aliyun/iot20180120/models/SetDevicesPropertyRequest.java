// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDevicesPropertyRequest extends TeaModel {
    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Items")
    public String items;

    @NameInMap("ProductKey")
    public String productKey;

    public static SetDevicesPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDevicesPropertyRequest self = new SetDevicesPropertyRequest();
        return TeaModel.build(map, self);
    }

    public SetDevicesPropertyRequest setDeviceName(java.util.List<String> deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    public SetDevicesPropertyRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SetDevicesPropertyRequest setItems(String items) {
        this.items = items;
        return this;
    }
    public String getItems() {
        return this.items;
    }

    public SetDevicesPropertyRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
