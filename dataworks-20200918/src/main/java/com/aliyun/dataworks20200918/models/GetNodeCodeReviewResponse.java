// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetNodeCodeReviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNodeCodeReviewResponseBody body;

    public static GetNodeCodeReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeCodeReviewResponse self = new GetNodeCodeReviewResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeCodeReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeCodeReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNodeCodeReviewResponse setBody(GetNodeCodeReviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeCodeReviewResponseBody getBody() {
        return this.body;
    }

}
