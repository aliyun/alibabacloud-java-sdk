// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReleaseProductRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    public static ReleaseProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseProductRequest self = new ReleaseProductRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseProductRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ReleaseProductRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
