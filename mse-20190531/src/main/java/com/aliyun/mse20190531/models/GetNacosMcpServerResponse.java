// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetNacosMcpServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNacosMcpServerResponseBody body;

    public static GetNacosMcpServerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNacosMcpServerResponse self = new GetNacosMcpServerResponse();
        return TeaModel.build(map, self);
    }

    public GetNacosMcpServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNacosMcpServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNacosMcpServerResponse setBody(GetNacosMcpServerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNacosMcpServerResponseBody getBody() {
        return this.body;
    }

}
