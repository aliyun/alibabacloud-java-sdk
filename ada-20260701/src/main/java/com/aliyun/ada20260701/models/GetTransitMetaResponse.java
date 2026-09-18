// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class GetTransitMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTransitMetaResponseBody body;

    public static GetTransitMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTransitMetaResponse self = new GetTransitMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetTransitMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTransitMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTransitMetaResponse setBody(GetTransitMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTransitMetaResponseBody getBody() {
        return this.body;
    }

}
