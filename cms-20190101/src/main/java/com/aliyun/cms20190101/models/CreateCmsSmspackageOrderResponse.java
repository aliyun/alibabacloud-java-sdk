// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateCmsSmspackageOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateCmsSmspackageOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCmsSmspackageOrderResponse setBody(CreateCmsSmspackageOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCmsSmspackageOrderResponseBody getBody() {
        return this.body;
    }

}
