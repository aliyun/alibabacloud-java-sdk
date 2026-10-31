// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ReviewRectifyFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReviewRectifyFlowResponseBody body;

    public static ReviewRectifyFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ReviewRectifyFlowResponse self = new ReviewRectifyFlowResponse();
        return TeaModel.build(map, self);
    }

    public ReviewRectifyFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReviewRectifyFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReviewRectifyFlowResponse setBody(ReviewRectifyFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ReviewRectifyFlowResponseBody getBody() {
        return this.body;
    }

}
