// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RemoveClientIdFromOIDCProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveClientIdFromOIDCProviderResponseBody body;

    public static RemoveClientIdFromOIDCProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveClientIdFromOIDCProviderResponse self = new RemoveClientIdFromOIDCProviderResponse();
        return TeaModel.build(map, self);
    }

    public RemoveClientIdFromOIDCProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveClientIdFromOIDCProviderResponse setBody(RemoveClientIdFromOIDCProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveClientIdFromOIDCProviderResponseBody getBody() {
        return this.body;
    }

}
