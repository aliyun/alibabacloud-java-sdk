// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class AddClientIdToOIDCProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddClientIdToOIDCProviderResponseBody body;

    public static AddClientIdToOIDCProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        AddClientIdToOIDCProviderResponse self = new AddClientIdToOIDCProviderResponse();
        return TeaModel.build(map, self);
    }

    public AddClientIdToOIDCProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddClientIdToOIDCProviderResponse setBody(AddClientIdToOIDCProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public AddClientIdToOIDCProviderResponseBody getBody() {
        return this.body;
    }

}
