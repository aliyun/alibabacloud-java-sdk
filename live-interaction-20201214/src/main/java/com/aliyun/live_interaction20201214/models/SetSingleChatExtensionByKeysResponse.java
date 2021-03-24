// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetSingleChatExtensionByKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetSingleChatExtensionByKeysResponseBody body;

    public static SetSingleChatExtensionByKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSingleChatExtensionByKeysResponse self = new SetSingleChatExtensionByKeysResponse();
        return TeaModel.build(map, self);
    }

    public SetSingleChatExtensionByKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSingleChatExtensionByKeysResponse setBody(SetSingleChatExtensionByKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSingleChatExtensionByKeysResponseBody getBody() {
        return this.body;
    }

}
