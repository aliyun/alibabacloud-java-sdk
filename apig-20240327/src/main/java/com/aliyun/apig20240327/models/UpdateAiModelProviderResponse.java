// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAiModelProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAiModelProviderResponseBody body;

    public static UpdateAiModelProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiModelProviderResponse self = new UpdateAiModelProviderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAiModelProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAiModelProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAiModelProviderResponse setBody(UpdateAiModelProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAiModelProviderResponseBody getBody() {
        return this.body;
    }

}
