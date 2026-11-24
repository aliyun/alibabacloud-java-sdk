// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateProductResponseBody extends TeaModel {
    @NameInMap("ProductId")
    public String productId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProductResponseBody self = new CreateProductResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProductResponseBody setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
