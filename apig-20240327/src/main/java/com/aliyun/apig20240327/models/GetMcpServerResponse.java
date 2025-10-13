// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetMcpServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMcpServerResponseBody body;

    public static GetMcpServerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMcpServerResponse self = new GetMcpServerResponse();
        return TeaModel.build(map, self);
    }

    public GetMcpServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMcpServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMcpServerResponse setBody(GetMcpServerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMcpServerResponseBody getBody() {
        return this.body;
    }

}
