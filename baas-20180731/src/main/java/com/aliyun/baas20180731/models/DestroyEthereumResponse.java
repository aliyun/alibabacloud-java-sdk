// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DestroyEthereumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DestroyEthereumResponseBody body;

    public static DestroyEthereumResponse build(java.util.Map<String, ?> map) throws Exception {
        DestroyEthereumResponse self = new DestroyEthereumResponse();
        return TeaModel.build(map, self);
    }

    public DestroyEthereumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DestroyEthereumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DestroyEthereumResponse setBody(DestroyEthereumResponseBody body) {
        this.body = body;
        return this;
    }
    public DestroyEthereumResponseBody getBody() {
        return this.body;
    }

}
