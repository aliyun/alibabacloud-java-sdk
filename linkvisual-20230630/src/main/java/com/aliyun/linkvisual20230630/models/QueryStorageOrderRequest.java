// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryStorageOrderRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DeviceNoOwner")
    public Boolean deviceNoOwner;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("ProductKey")
    public String productKey;

    public static QueryStorageOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStorageOrderRequest self = new QueryStorageOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryStorageOrderRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryStorageOrderRequest setDeviceNoOwner(Boolean deviceNoOwner) {
        this.deviceNoOwner = deviceNoOwner;
        return this;
    }
    public Boolean getDeviceNoOwner() {
        return this.deviceNoOwner;
    }

    public QueryStorageOrderRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryStorageOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryStorageOrderRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
