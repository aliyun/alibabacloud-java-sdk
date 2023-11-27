// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetMessageExtensionByKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetMessageExtensionByKeysResponseBody body;

    public static SetMessageExtensionByKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        SetMessageExtensionByKeysResponse self = new SetMessageExtensionByKeysResponse();
        return TeaModel.build(map, self);
    }

    public SetMessageExtensionByKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetMessageExtensionByKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetMessageExtensionByKeysResponse setBody(SetMessageExtensionByKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public SetMessageExtensionByKeysResponseBody getBody() {
        return this.body;
    }

}
