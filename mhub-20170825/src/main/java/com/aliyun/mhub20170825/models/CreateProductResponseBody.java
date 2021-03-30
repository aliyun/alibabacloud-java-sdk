// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class CreateProductResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProductId")
    public Long productId;

    public static CreateProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProductResponseBody self = new CreateProductResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProductResponseBody setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

}
