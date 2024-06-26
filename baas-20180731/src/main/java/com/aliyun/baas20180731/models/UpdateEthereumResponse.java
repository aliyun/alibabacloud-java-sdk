// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateEthereumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEthereumResponseBody body;

    public static UpdateEthereumResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEthereumResponse self = new UpdateEthereumResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEthereumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEthereumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEthereumResponse setBody(UpdateEthereumResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEthereumResponseBody getBody() {
        return this.body;
    }

}
