// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class FeedbackAlertAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public FeedbackAlertAlgorithmResponse setBody(FeedbackAlertAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public FeedbackAlertAlgorithmResponseBody getBody() {
        return this.body;
    }

}
