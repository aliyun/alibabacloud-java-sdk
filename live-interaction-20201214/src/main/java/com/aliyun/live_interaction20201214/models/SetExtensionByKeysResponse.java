// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetExtensionByKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetExtensionByKeysResponseBody body;

    public static SetExtensionByKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        SetExtensionByKeysResponse self = new SetExtensionByKeysResponse();
        return TeaModel.build(map, self);
    }

    public SetExtensionByKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetExtensionByKeysResponse setBody(SetExtensionByKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public SetExtensionByKeysResponseBody getBody() {
        return this.body;
    }

}
