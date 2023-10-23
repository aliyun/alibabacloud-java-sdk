// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class FreezeFreeStorageRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("ProductKey")
    public String productKey;

    public static FreezeFreeStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        FreezeFreeStorageRequest self = new FreezeFreeStorageRequest();
        return TeaModel.build(map, self);
    }

    public FreezeFreeStorageRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public FreezeFreeStorageRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public FreezeFreeStorageRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
