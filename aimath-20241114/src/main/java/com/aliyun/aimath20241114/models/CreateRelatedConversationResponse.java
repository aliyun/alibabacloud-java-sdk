// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class CreateRelatedConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRelatedConversationResponseBody body;

    public static CreateRelatedConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRelatedConversationResponse self = new CreateRelatedConversationResponse();
        return TeaModel.build(map, self);
    }

    public CreateRelatedConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRelatedConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRelatedConversationResponse setBody(CreateRelatedConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRelatedConversationResponseBody getBody() {
        return this.body;
    }

}
