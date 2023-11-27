// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveSingleChatExtensionByKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveSingleChatExtensionByKeysResponseBody body;

    public static RemoveSingleChatExtensionByKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSingleChatExtensionByKeysResponse self = new RemoveSingleChatExtensionByKeysResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSingleChatExtensionByKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSingleChatExtensionByKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveSingleChatExtensionByKeysResponse setBody(RemoveSingleChatExtensionByKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSingleChatExtensionByKeysResponseBody getBody() {
        return this.body;
    }

}
