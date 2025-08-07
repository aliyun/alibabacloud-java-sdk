// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateAlidingAssistantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAlidingAssistantResponseBody body;

    public static CreateAlidingAssistantResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlidingAssistantResponse self = new CreateAlidingAssistantResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlidingAssistantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlidingAssistantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAlidingAssistantResponse setBody(CreateAlidingAssistantResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlidingAssistantResponseBody getBody() {
        return this.body;
    }

}
