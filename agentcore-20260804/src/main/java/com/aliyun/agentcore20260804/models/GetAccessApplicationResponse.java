// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAccessApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccessApplicationResponseBody body;

    public static GetAccessApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessApplicationResponse self = new GetAccessApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccessApplicationResponse setBody(GetAccessApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessApplicationResponseBody getBody() {
        return this.body;
    }

}
