// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateLoRaNodesTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLoRaNodesTaskResponseBody body;

    public static CreateLoRaNodesTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLoRaNodesTaskResponse self = new CreateLoRaNodesTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLoRaNodesTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLoRaNodesTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLoRaNodesTaskResponse setBody(CreateLoRaNodesTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLoRaNodesTaskResponseBody getBody() {
        return this.body;
    }

}
