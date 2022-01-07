// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchRegisterDeviceRequest extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    public static BatchRegisterDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRegisterDeviceRequest self = new BatchRegisterDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BatchRegisterDeviceRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public BatchRegisterDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchRegisterDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
