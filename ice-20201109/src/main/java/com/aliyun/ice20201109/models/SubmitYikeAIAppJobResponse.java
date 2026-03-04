// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitYikeAIAppJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitYikeAIAppJobResponseBody body;

    public static SubmitYikeAIAppJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeAIAppJobResponse self = new SubmitYikeAIAppJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitYikeAIAppJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitYikeAIAppJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitYikeAIAppJobResponse setBody(SubmitYikeAIAppJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitYikeAIAppJobResponseBody getBody() {
        return this.body;
    }

}
