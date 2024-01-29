// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateSolutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSolutionResponseBody body;

    public static UpdateSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSolutionResponse self = new UpdateSolutionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSolutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSolutionResponse setBody(UpdateSolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSolutionResponseBody getBody() {
        return this.body;
    }

}
