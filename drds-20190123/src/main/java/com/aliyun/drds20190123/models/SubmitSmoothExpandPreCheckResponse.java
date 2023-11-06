// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSmoothExpandPreCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitSmoothExpandPreCheckResponseBody body;

    public static SubmitSmoothExpandPreCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmoothExpandPreCheckResponse self = new SubmitSmoothExpandPreCheckResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSmoothExpandPreCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSmoothExpandPreCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSmoothExpandPreCheckResponse setBody(SubmitSmoothExpandPreCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSmoothExpandPreCheckResponseBody getBody() {
        return this.body;
    }

}
