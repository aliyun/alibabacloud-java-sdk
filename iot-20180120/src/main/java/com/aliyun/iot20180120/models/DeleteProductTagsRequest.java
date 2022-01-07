// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteProductTagsRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ProductTagKey")
    public java.util.List<String> productTagKey;

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

    public DeleteProductTagsRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public DeleteProductTagsRequest setProductTagKey(java.util.List<String> productTagKey) {
        this.productTagKey = productTagKey;
        return this;
    }
    public java.util.List<String> getProductTagKey() {
        return this.productTagKey;
    }

}
