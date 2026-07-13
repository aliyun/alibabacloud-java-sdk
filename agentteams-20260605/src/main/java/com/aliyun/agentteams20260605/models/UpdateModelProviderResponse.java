// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateModelProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModelProviderResponseBody body;

    public static UpdateModelProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelProviderResponse self = new UpdateModelProviderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelProviderResponse setBody(UpdateModelProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelProviderResponseBody getBody() {
        return this.body;
    }

}
