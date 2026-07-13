// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class DeleteModelProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModelProviderResponseBody body;

    public static DeleteModelProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelProviderResponse self = new DeleteModelProviderResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModelProviderResponse setBody(DeleteModelProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModelProviderResponseBody getBody() {
        return this.body;
    }

}
