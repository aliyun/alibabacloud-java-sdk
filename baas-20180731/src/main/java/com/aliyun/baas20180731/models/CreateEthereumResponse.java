// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateEthereumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEthereumResponseBody body;

    public static CreateEthereumResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEthereumResponse self = new CreateEthereumResponse();
        return TeaModel.build(map, self);
    }

    public CreateEthereumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEthereumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEthereumResponse setBody(CreateEthereumResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEthereumResponseBody getBody() {
        return this.body;
    }

}
