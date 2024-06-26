// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AddEthereumNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddEthereumNodeResponseBody body;

    public static AddEthereumNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEthereumNodeResponse self = new AddEthereumNodeResponse();
        return TeaModel.build(map, self);
    }

    public AddEthereumNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEthereumNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddEthereumNodeResponse setBody(AddEthereumNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEthereumNodeResponseBody getBody() {
        return this.body;
    }

}
