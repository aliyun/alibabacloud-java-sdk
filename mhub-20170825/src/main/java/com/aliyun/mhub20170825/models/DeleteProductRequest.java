// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class DeleteProductRequest extends TeaModel {
    @NameInMap("ProductId")
    @Validation(required = true)
    public String productId;

    public static DeleteProductRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductRequest self = new DeleteProductRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
