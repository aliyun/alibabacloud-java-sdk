// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceDeviceToDeviceGroupRequest extends TeaModel {
    /**
     * <p>The device group ID. You can obtain the ID by calling the AddFaceDeviceGroup operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kvjyhurc</p>
     */
    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    /**
     * <p>The device name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestDevice</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The IoT instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>TestInstanceId</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The isolation ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestIsolationId</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    /**
     * <p>The product key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1Tp7KYZHHK</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static AddFaceDeviceToDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceDeviceToDeviceGroupRequest self = new AddFaceDeviceToDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceDeviceToDeviceGroupRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    public AddFaceDeviceToDeviceGroupRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public AddFaceDeviceToDeviceGroupRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public AddFaceDeviceToDeviceGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public AddFaceDeviceToDeviceGroupRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
