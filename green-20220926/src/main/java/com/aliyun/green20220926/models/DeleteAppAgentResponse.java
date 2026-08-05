// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DeleteAppAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppAgentResponseBody body;

    public static DeleteAppAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppAgentResponse self = new DeleteAppAgentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppAgentResponse setBody(DeleteAppAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppAgentResponseBody getBody() {
        return this.body;
    }

}
