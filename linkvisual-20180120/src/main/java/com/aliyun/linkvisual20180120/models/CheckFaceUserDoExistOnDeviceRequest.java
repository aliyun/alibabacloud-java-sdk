// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CheckFaceUserDoExistOnDeviceRequest extends TeaModel {
    @NameInMap("IsolationId")
    @Validation(required = true)
    public String isolationId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("UserId")
    @Validation(required = true)
    public String userId;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("DeviceName")
    @Validation(required = true)
    public String deviceName;

    public static CheckFaceUserDoExistOnDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckFaceUserDoExistOnDeviceRequest self = new CheckFaceUserDoExistOnDeviceRequest();
        return TeaModel.build(map, self);
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
