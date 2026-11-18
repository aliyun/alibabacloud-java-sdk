// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class SetAgentSessionModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAgentSessionModelResponseBody body;

    public static SetAgentSessionModelResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAgentSessionModelResponse self = new SetAgentSessionModelResponse();
        return TeaModel.build(map, self);
    }

    public SetAgentSessionModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAgentSessionModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAgentSessionModelResponse setBody(SetAgentSessionModelResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAgentSessionModelResponseBody getBody() {
        return this.body;
    }

}
