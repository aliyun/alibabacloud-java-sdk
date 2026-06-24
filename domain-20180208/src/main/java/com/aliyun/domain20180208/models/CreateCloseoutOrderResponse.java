// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CreateCloseoutOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloseoutOrderResponseBody body;

    public static CreateCloseoutOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloseoutOrderResponse self = new CreateCloseoutOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloseoutOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloseoutOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloseoutOrderResponse setBody(CreateCloseoutOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloseoutOrderResponseBody getBody() {
        return this.body;
    }

}
