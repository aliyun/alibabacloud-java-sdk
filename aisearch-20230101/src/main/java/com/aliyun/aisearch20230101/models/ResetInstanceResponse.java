// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class ResetInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResetInstanceResponseBody body;

    public static ResetInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetInstanceResponse self = new ResetInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ResetInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetInstanceResponse setBody(ResetInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetInstanceResponseBody getBody() {
        return this.body;
    }

}
