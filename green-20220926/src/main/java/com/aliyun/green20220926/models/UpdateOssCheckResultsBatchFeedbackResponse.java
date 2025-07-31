// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateOssCheckResultsBatchFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOssCheckResultsBatchFeedbackResponseBody body;

    public static UpdateOssCheckResultsBatchFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssCheckResultsBatchFeedbackResponse self = new UpdateOssCheckResultsBatchFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOssCheckResultsBatchFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOssCheckResultsBatchFeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOssCheckResultsBatchFeedbackResponse setBody(UpdateOssCheckResultsBatchFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOssCheckResultsBatchFeedbackResponseBody getBody() {
        return this.body;
    }

}
