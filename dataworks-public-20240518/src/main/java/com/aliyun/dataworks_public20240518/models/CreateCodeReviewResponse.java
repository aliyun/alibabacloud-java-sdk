// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateCodeReviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCodeReviewResponseBody body;

    public static CreateCodeReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCodeReviewResponse self = new CreateCodeReviewResponse();
        return TeaModel.build(map, self);
    }

    public CreateCodeReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCodeReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCodeReviewResponse setBody(CreateCodeReviewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCodeReviewResponseBody getBody() {
        return this.body;
    }

}
