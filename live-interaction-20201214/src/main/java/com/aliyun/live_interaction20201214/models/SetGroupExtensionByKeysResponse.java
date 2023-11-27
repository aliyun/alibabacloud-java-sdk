// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetGroupExtensionByKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetGroupExtensionByKeysResponseBody body;

    public static SetGroupExtensionByKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGroupExtensionByKeysResponse self = new SetGroupExtensionByKeysResponse();
        return TeaModel.build(map, self);
    }

    public SetGroupExtensionByKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetGroupExtensionByKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetGroupExtensionByKeysResponse setBody(SetGroupExtensionByKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGroupExtensionByKeysResponseBody getBody() {
        return this.body;
    }

}
