// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FeedbackDialogueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FeedbackDialogueResponseBody body;

    public static FeedbackDialogueResponse build(java.util.Map<String, ?> map) throws Exception {
        FeedbackDialogueResponse self = new FeedbackDialogueResponse();
        return TeaModel.build(map, self);
    }

    public FeedbackDialogueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FeedbackDialogueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FeedbackDialogueResponse setBody(FeedbackDialogueResponseBody body) {
        this.body = body;
        return this;
    }
    public FeedbackDialogueResponseBody getBody() {
        return this.body;
    }

}
