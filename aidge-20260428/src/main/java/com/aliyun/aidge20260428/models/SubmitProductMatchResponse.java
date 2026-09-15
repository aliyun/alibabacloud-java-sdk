// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class SubmitProductMatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitProductMatchResponseBody body;

    public static SubmitProductMatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitProductMatchResponse self = new SubmitProductMatchResponse();
        return TeaModel.build(map, self);
    }

    public SubmitProductMatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitProductMatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitProductMatchResponse setBody(SubmitProductMatchResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitProductMatchResponseBody getBody() {
        return this.body;
    }

}
