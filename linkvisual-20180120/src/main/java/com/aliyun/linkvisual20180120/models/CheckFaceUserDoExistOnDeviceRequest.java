// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CheckFaceUserDoExistOnDeviceRequest extends TeaModel {
    /**
     * <p>The device name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestDeviceName</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The isolation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>TestIotInstanceId</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The isolation ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a103lZ86ovStDMnU</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    /**
     * <p>The ProductKey of the IoT Platform product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1654Sr4Y3f</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tibce3fsgqelezk8</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static CheckFaceUserDoExistOnDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckFaceUserDoExistOnDeviceRequest self = new CheckFaceUserDoExistOnDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CheckFaceUserDoExistOnDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CheckFaceUserDoExistOnDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CheckFaceUserDoExistOnDeviceRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public CheckFaceUserDoExistOnDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CheckFaceUserDoExistOnDeviceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
