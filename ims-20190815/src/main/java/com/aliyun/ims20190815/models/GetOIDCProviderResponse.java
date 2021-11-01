// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetOIDCProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOIDCProviderResponseBody body;

    public static GetOIDCProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOIDCProviderResponse self = new GetOIDCProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetOIDCProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOIDCProviderResponse setBody(GetOIDCProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOIDCProviderResponseBody getBody() {
        return this.body;
    }

}
