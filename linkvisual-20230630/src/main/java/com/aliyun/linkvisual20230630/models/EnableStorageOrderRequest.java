// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class EnableStorageOrderRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("ProductKey")
    public String productKey;

    public static EnableStorageOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableStorageOrderRequest self = new EnableStorageOrderRequest();
        return TeaModel.build(map, self);
    }

    public EnableStorageOrderRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public EnableStorageOrderRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public EnableStorageOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public EnableStorageOrderRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
