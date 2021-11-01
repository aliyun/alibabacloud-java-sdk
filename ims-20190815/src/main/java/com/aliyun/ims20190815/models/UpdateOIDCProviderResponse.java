// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateOIDCProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOIDCProviderResponseBody body;

    public static UpdateOIDCProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOIDCProviderResponse self = new UpdateOIDCProviderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOIDCProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOIDCProviderResponse setBody(UpdateOIDCProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOIDCProviderResponseBody getBody() {
        return this.body;
    }

}
