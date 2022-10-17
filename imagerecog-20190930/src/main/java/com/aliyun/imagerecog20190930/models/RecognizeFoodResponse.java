// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeFoodResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeFoodResponseBody body;

    public static RecognizeFoodResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFoodResponse self = new RecognizeFoodResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeFoodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeFoodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeFoodResponse setBody(RecognizeFoodResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeFoodResponseBody getBody() {
        return this.body;
    }

}
