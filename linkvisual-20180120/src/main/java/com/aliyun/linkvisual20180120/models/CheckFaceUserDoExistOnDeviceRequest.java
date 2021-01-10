// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CheckFaceUserDoExistOnDeviceRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IsolationId")
    public String isolationId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("DeviceName")
    public String deviceName;

    public static CheckFaceUserDoExistOnDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckFaceUserDoExistOnDeviceRequest self = new CheckFaceUserDoExistOnDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CheckFaceUserDoExistOnDeviceRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CheckFaceUserDoExistOnDeviceRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public CheckFaceUserDoExistOnDeviceRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public CheckFaceUserDoExistOnDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CheckFaceUserDoExistOnDeviceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CheckFaceUserDoExistOnDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CheckFaceUserDoExistOnDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

}
