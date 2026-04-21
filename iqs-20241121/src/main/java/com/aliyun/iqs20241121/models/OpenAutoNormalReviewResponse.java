// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class OpenAutoNormalReviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperationResult body;

    public static OpenAutoNormalReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenAutoNormalReviewResponse self = new OpenAutoNormalReviewResponse();
        return TeaModel.build(map, self);
    }

    public OpenAutoNormalReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenAutoNormalReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenAutoNormalReviewResponse setBody(OperationResult body) {
        this.body = body;
        return this;
    }
    public OperationResult getBody() {
        return this.body;
    }

}
