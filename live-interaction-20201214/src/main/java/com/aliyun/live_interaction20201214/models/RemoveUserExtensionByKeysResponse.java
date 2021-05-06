// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveUserExtensionByKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveUserExtensionByKeysResponseBody body;

    public static RemoveUserExtensionByKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserExtensionByKeysResponse self = new RemoveUserExtensionByKeysResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUserExtensionByKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUserExtensionByKeysResponse setBody(RemoveUserExtensionByKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUserExtensionByKeysResponseBody getBody() {
        return this.body;
    }

}
