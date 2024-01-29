// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteSolutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSolutionResponseBody body;

    public static DeleteSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSolutionResponse self = new DeleteSolutionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSolutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSolutionResponse setBody(DeleteSolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSolutionResponseBody getBody() {
        return this.body;
    }

}
