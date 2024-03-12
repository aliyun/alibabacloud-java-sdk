// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ClearIntervenesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearIntervenesResponseBody body;

    public static ClearIntervenesResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearIntervenesResponse self = new ClearIntervenesResponse();
        return TeaModel.build(map, self);
    }

    public ClearIntervenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearIntervenesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearIntervenesResponse setBody(ClearIntervenesResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearIntervenesResponseBody getBody() {
        return this.body;
    }

}
