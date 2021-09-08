// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteProductTagsRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductTagKey")
    @Validation(required = true)
    public java.util.List<String> productTagKey;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    public static DeleteProductTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductTagsRequest self = new DeleteProductTagsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProductTagsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteProductTagsRequest setProductTagKey(java.util.List<String> productTagKey) {
        this.productTagKey = productTagKey;
        return this;
    }
    public java.util.List<String> getProductTagKey() {
        return this.productTagKey;
    }

    public DeleteProductTagsRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
