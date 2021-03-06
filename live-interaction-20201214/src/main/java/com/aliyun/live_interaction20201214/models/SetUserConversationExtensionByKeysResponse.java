// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetUserConversationExtensionByKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetUserConversationExtensionByKeysResponseBody body;

    public static SetUserConversationExtensionByKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        SetUserConversationExtensionByKeysResponse self = new SetUserConversationExtensionByKeysResponse();
        return TeaModel.build(map, self);
    }

    public SetUserConversationExtensionByKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetUserConversationExtensionByKeysResponse setBody(SetUserConversationExtensionByKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public SetUserConversationExtensionByKeysResponseBody getBody() {
        return this.body;
    }

}
