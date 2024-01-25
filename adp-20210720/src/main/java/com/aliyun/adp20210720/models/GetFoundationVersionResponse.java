// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetFoundationVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFoundationVersionResponseBody body;

    public static GetFoundationVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFoundationVersionResponse self = new GetFoundationVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetFoundationVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFoundationVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFoundationVersionResponse setBody(GetFoundationVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFoundationVersionResponseBody getBody() {
        return this.body;
    }

}
