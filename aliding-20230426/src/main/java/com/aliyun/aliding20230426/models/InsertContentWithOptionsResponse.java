// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertContentWithOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertContentWithOptionsResponseBody body;

    public static InsertContentWithOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertContentWithOptionsResponse self = new InsertContentWithOptionsResponse();
        return TeaModel.build(map, self);
    }

    public InsertContentWithOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertContentWithOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertContentWithOptionsResponse setBody(InsertContentWithOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertContentWithOptionsResponseBody getBody() {
        return this.body;
    }

}
