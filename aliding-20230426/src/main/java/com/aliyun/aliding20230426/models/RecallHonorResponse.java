// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RecallHonorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecallHonorResponseBody body;

    public static RecallHonorResponse build(java.util.Map<String, ?> map) throws Exception {
        RecallHonorResponse self = new RecallHonorResponse();
        return TeaModel.build(map, self);
    }

    public RecallHonorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecallHonorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecallHonorResponse setBody(RecallHonorResponseBody body) {
        this.body = body;
        return this;
    }
    public RecallHonorResponseBody getBody() {
        return this.body;
    }

}
