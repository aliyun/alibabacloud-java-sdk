// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class PrecheckYikeAIAppJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PrecheckYikeAIAppJobResponseBody body;

    public static PrecheckYikeAIAppJobResponse build(java.util.Map<String, ?> map) throws Exception {
        PrecheckYikeAIAppJobResponse self = new PrecheckYikeAIAppJobResponse();
        return TeaModel.build(map, self);
    }

    public PrecheckYikeAIAppJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrecheckYikeAIAppJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PrecheckYikeAIAppJobResponse setBody(PrecheckYikeAIAppJobResponseBody body) {
        this.body = body;
        return this;
    }
    public PrecheckYikeAIAppJobResponseBody getBody() {
        return this.body;
    }

}
