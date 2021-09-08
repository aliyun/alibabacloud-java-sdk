// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelReleaseProductRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    public static CancelReleaseProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelReleaseProductRequest self = new CancelReleaseProductRequest();
        return TeaModel.build(map, self);
    }

    public CancelReleaseProductRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CancelReleaseProductRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
