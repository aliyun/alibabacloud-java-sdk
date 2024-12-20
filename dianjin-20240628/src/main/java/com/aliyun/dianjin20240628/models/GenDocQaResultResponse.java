// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GenDocQaResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenDocQaResultResponseBody body;

    public static GenDocQaResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GenDocQaResultResponse self = new GenDocQaResultResponse();
        return TeaModel.build(map, self);
    }

    public GenDocQaResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenDocQaResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenDocQaResultResponse setBody(GenDocQaResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GenDocQaResultResponseBody getBody() {
        return this.body;
    }

}
