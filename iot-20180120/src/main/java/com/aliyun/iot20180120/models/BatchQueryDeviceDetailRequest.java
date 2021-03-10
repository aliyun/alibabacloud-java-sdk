// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchQueryDeviceDetailRequest extends TeaModel {
    @NameInMap("DeviceName")
    @Validation(required = true)
    public java.util.List<String> deviceName;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchQueryDeviceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryDeviceDetailRequest self = new BatchQueryDeviceDetailRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryDeviceDetailRequest setDeviceName(java.util.List<String> deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    public BatchQueryDeviceDetailRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public BatchQueryDeviceDetailRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
