// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateScanResultFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateScanResultFeedbackResponseBody body;

    public static UpdateScanResultFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScanResultFeedbackResponse self = new UpdateScanResultFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScanResultFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScanResultFeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateScanResultFeedbackResponse setBody(UpdateScanResultFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScanResultFeedbackResponseBody getBody() {
        return this.body;
    }

}
