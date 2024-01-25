// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class FeedbackAlertAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FeedbackAlertAlgorithmResponseBody body;

    public static FeedbackAlertAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        FeedbackAlertAlgorithmResponse self = new FeedbackAlertAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public FeedbackAlertAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FeedbackAlertAlgorithmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FeedbackAlertAlgorithmResponse setBody(FeedbackAlertAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public FeedbackAlertAlgorithmResponseBody getBody() {
        return this.body;
    }

}
