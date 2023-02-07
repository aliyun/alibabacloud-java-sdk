// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class FetchCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FetchCallResponseBody body;

    public static FetchCallResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchCallResponse self = new FetchCallResponse();
        return TeaModel.build(map, self);
    }

    public FetchCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchCallResponse setBody(FetchCallResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchCallResponseBody getBody() {
        return this.body;
    }

}
