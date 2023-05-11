// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGrayMigrationDeviceRequest extends TeaModel {
    @NameInMap("DeviceNames")
    public java.util.List<String> deviceNames;

    @NameInMap("ProductKey")
    public String productKey;

    public static BatchGrayMigrationDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGrayMigrationDeviceRequest self = new BatchGrayMigrationDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BatchGrayMigrationDeviceRequest setDeviceNames(java.util.List<String> deviceNames) {
        this.deviceNames = deviceNames;
        return this;
    }
    public java.util.List<String> getDeviceNames() {
        return this.deviceNames;
    }

    public BatchGrayMigrationDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
