// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetIdeNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIdeNodeResponseBody body;

    public static GetIdeNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdeNodeResponse self = new GetIdeNodeResponse();
        return TeaModel.build(map, self);
    }

    public GetIdeNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdeNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdeNodeResponse setBody(GetIdeNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIdeNodeResponseBody getBody() {
        return this.body;
    }

}
