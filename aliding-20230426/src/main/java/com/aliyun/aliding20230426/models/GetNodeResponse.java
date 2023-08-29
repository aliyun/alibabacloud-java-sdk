// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetNodeResponseBody body;

    public static GetNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeResponse self = new GetNodeResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNodeResponse setBody(GetNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeResponseBody getBody() {
        return this.body;
    }

}
