// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveGroupExtensionByKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveGroupExtensionByKeysResponseBody body;

    public static RemoveGroupExtensionByKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupExtensionByKeysResponse self = new RemoveGroupExtensionByKeysResponse();
        return TeaModel.build(map, self);
    }

    public RemoveGroupExtensionByKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveGroupExtensionByKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveGroupExtensionByKeysResponse setBody(RemoveGroupExtensionByKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveGroupExtensionByKeysResponseBody getBody() {
        return this.body;
    }

}
