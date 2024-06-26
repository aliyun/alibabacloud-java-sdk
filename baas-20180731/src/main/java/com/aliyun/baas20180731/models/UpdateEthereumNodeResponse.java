// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateEthereumNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEthereumNodeResponseBody body;

    public static UpdateEthereumNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEthereumNodeResponse self = new UpdateEthereumNodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEthereumNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEthereumNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEthereumNodeResponse setBody(UpdateEthereumNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEthereumNodeResponseBody getBody() {
        return this.body;
    }

}
