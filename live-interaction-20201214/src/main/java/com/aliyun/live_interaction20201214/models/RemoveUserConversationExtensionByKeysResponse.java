// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveUserConversationExtensionByKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveUserConversationExtensionByKeysResponseBody body;

    public static RemoveUserConversationExtensionByKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserConversationExtensionByKeysResponse self = new RemoveUserConversationExtensionByKeysResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUserConversationExtensionByKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUserConversationExtensionByKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveUserConversationExtensionByKeysResponse setBody(RemoveUserConversationExtensionByKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUserConversationExtensionByKeysResponseBody getBody() {
        return this.body;
    }

}
