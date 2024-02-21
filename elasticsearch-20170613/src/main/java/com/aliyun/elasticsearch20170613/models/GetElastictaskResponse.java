// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetElastictaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetElastictaskResponseBody body;

    public static GetElastictaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetElastictaskResponse self = new GetElastictaskResponse();
        return TeaModel.build(map, self);
    }

    public GetElastictaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetElastictaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetElastictaskResponse setBody(GetElastictaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetElastictaskResponseBody getBody() {
        return this.body;
    }

}
