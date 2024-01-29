// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateZnodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateZnodeResponseBody body;

    public static CreateZnodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateZnodeResponse self = new CreateZnodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateZnodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateZnodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateZnodeResponse setBody(CreateZnodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateZnodeResponseBody getBody() {
        return this.body;
    }

}
