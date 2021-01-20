// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateCmsSmspackageOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCmsSmspackageOrderResponseBody body;

    public static CreateCmsSmspackageOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCmsSmspackageOrderResponse self = new CreateCmsSmspackageOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateCmsSmspackageOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCmsSmspackageOrderResponse setBody(CreateCmsSmspackageOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCmsSmspackageOrderResponseBody getBody() {
        return this.body;
    }

}
