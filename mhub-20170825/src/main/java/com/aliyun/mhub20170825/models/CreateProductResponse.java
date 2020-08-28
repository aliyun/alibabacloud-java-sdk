// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class CreateProductResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateProductResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductResponse self = new CreateProductResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
