// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class AddFingerprintToOIDCProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddFingerprintToOIDCProviderResponseBody body;

    public static AddFingerprintToOIDCProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFingerprintToOIDCProviderResponse self = new AddFingerprintToOIDCProviderResponse();
        return TeaModel.build(map, self);
    }

    public AddFingerprintToOIDCProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFingerprintToOIDCProviderResponse setBody(AddFingerprintToOIDCProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFingerprintToOIDCProviderResponseBody getBody() {
        return this.body;
    }

}
