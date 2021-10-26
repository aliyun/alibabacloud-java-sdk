// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreatePartProductResponseBody extends TeaModel {
    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreatePartProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePartProductResponseBody self = new CreatePartProductResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePartProductResponseBody setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public CreatePartProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
