// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateAlidingAssistantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAlidingAssistantResponseBody body;

    public static UpdateAlidingAssistantResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlidingAssistantResponse self = new UpdateAlidingAssistantResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlidingAssistantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlidingAssistantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlidingAssistantResponse setBody(UpdateAlidingAssistantResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlidingAssistantResponseBody getBody() {
        return this.body;
    }

}
