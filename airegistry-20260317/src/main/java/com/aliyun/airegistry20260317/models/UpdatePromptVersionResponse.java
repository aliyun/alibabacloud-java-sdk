// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdatePromptVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePromptVersionResponseBody body;

    public static UpdatePromptVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePromptVersionResponse self = new UpdatePromptVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePromptVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePromptVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePromptVersionResponse setBody(UpdatePromptVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePromptVersionResponseBody getBody() {
        return this.body;
    }

}
