// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ProgressControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ProgressControlResponseBody body;

    public static ProgressControlResponse build(java.util.Map<String, ?> map) throws Exception {
        ProgressControlResponse self = new ProgressControlResponse();
        return TeaModel.build(map, self);
    }

    public ProgressControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProgressControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProgressControlResponse setBody(ProgressControlResponseBody body) {
        this.body = body;
        return this;
    }
    public ProgressControlResponseBody getBody() {
        return this.body;
    }

}
