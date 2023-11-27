// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ImportGroupChatConversationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ImportGroupChatConversationResponseBody body;

    public static ImportGroupChatConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportGroupChatConversationResponse self = new ImportGroupChatConversationResponse();
        return TeaModel.build(map, self);
    }

    public ImportGroupChatConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportGroupChatConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportGroupChatConversationResponse setBody(ImportGroupChatConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportGroupChatConversationResponseBody getBody() {
        return this.body;
    }

}
