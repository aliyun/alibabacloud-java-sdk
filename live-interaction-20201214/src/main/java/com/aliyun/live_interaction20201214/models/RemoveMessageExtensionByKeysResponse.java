// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveMessageExtensionByKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveMessageExtensionByKeysResponseBody body;

    public static RemoveMessageExtensionByKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveMessageExtensionByKeysResponse self = new RemoveMessageExtensionByKeysResponse();
        return TeaModel.build(map, self);
    }

    public RemoveMessageExtensionByKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveMessageExtensionByKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveMessageExtensionByKeysResponse setBody(RemoveMessageExtensionByKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveMessageExtensionByKeysResponseBody getBody() {
        return this.body;
    }

}
