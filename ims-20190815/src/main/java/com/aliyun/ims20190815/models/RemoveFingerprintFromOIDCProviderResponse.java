// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RemoveFingerprintFromOIDCProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveFingerprintFromOIDCProviderResponseBody body;

    public static RemoveFingerprintFromOIDCProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveFingerprintFromOIDCProviderResponse self = new RemoveFingerprintFromOIDCProviderResponse();
        return TeaModel.build(map, self);
    }

    public RemoveFingerprintFromOIDCProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveFingerprintFromOIDCProviderResponse setBody(RemoveFingerprintFromOIDCProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveFingerprintFromOIDCProviderResponseBody getBody() {
        return this.body;
    }

}
