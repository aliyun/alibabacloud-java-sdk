// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteAiModelProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAiModelProviderResponseBody body;

    public static DeleteAiModelProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiModelProviderResponse self = new DeleteAiModelProviderResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAiModelProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAiModelProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAiModelProviderResponse setBody(DeleteAiModelProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAiModelProviderResponseBody getBody() {
        return this.body;
    }

}
