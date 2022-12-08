// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class ClearFaceDeviceDBRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("IsolationId")
    public String isolationId;

    @NameInMap("ProductKey")
    public String productKey;

    public static ClearFaceDeviceDBRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearFaceDeviceDBRequest self = new ClearFaceDeviceDBRequest();
        return TeaModel.build(map, self);
    }

    public ClearFaceDeviceDBRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public ClearFaceDeviceDBRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ClearFaceDeviceDBRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public ClearFaceDeviceDBRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
