// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdatePromptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePromptResponseBody body;

    public static UpdatePromptResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePromptResponse self = new UpdatePromptResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePromptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePromptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePromptResponse setBody(UpdatePromptResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePromptResponseBody getBody() {
        return this.body;
    }

}
