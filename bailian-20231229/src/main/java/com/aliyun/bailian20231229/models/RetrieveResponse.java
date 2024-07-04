// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class RetrieveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetrieveResponseBody body;

    public static RetrieveResponse build(java.util.Map<String, ?> map) throws Exception {
        RetrieveResponse self = new RetrieveResponse();
        return TeaModel.build(map, self);
    }

    public RetrieveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetrieveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetrieveResponse setBody(RetrieveResponseBody body) {
        this.body = body;
        return this;
    }
    public RetrieveResponseBody getBody() {
        return this.body;
    }

}
