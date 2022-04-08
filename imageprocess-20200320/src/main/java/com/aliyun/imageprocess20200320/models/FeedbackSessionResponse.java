// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class FeedbackSessionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FeedbackSessionResponseBody body;

    public static FeedbackSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        FeedbackSessionResponse self = new FeedbackSessionResponse();
        return TeaModel.build(map, self);
    }

    public FeedbackSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FeedbackSessionResponse setBody(FeedbackSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public FeedbackSessionResponseBody getBody() {
        return this.body;
    }

}
