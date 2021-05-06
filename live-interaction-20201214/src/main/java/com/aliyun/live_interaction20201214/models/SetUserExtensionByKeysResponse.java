// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetUserExtensionByKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetUserExtensionByKeysResponseBody body;

    public static SetUserExtensionByKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        SetUserExtensionByKeysResponse self = new SetUserExtensionByKeysResponse();
        return TeaModel.build(map, self);
    }

    public SetUserExtensionByKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetUserExtensionByKeysResponse setBody(SetUserExtensionByKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public SetUserExtensionByKeysResponseBody getBody() {
        return this.body;
    }

}
