// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateCodeReviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCodeReviewResponseBody body;

    public static UpdateCodeReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCodeReviewResponse self = new UpdateCodeReviewResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCodeReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCodeReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCodeReviewResponse setBody(UpdateCodeReviewResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCodeReviewResponseBody getBody() {
        return this.body;
    }

}
