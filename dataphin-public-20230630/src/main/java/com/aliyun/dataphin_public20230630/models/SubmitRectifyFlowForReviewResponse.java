// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitRectifyFlowForReviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitRectifyFlowForReviewResponseBody body;

    public static SubmitRectifyFlowForReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitRectifyFlowForReviewResponse self = new SubmitRectifyFlowForReviewResponse();
        return TeaModel.build(map, self);
    }

    public SubmitRectifyFlowForReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitRectifyFlowForReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitRectifyFlowForReviewResponse setBody(SubmitRectifyFlowForReviewResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitRectifyFlowForReviewResponseBody getBody() {
        return this.body;
    }

}
