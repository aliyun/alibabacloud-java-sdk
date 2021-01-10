// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetDeviceStateRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    @NameInMap("IotId")
    public java.util.List<String> iotId;

    public static BatchGetDeviceStateRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetDeviceStateRequest self = new BatchGetDeviceStateRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetDeviceStateRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public BatchGetDeviceStateRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public BatchGetDeviceStateRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchGetDeviceStateRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public BatchGetDeviceStateRequest setDeviceName(java.util.List<String> deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    public BatchGetDeviceStateRequest setIotId(java.util.List<String> iotId) {
        this.iotId = iotId;
        return this;
    }
    public java.util.List<String> getIotId() {
        return this.iotId;
    }

}
