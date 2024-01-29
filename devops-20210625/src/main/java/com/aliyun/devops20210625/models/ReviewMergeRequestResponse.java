// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ReviewMergeRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReviewMergeRequestResponseBody body;

    public static ReviewMergeRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        ReviewMergeRequestResponse self = new ReviewMergeRequestResponse();
        return TeaModel.build(map, self);
    }

    public ReviewMergeRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReviewMergeRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReviewMergeRequestResponse setBody(ReviewMergeRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public ReviewMergeRequestResponseBody getBody() {
        return this.body;
    }

}
