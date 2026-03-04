// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetYikeAIAppJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYikeAIAppJobResponseBody body;

    public static GetYikeAIAppJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYikeAIAppJobResponse self = new GetYikeAIAppJobResponse();
        return TeaModel.build(map, self);
    }

    public GetYikeAIAppJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYikeAIAppJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYikeAIAppJobResponse setBody(GetYikeAIAppJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYikeAIAppJobResponseBody getBody() {
        return this.body;
    }

}
