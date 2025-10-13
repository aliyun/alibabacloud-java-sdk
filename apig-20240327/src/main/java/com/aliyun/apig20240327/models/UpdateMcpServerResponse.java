// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateMcpServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMcpServerResponseBody body;

    public static UpdateMcpServerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcpServerResponse self = new UpdateMcpServerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMcpServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMcpServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMcpServerResponse setBody(UpdateMcpServerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMcpServerResponseBody getBody() {
        return this.body;
    }

}
