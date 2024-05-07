// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateOIDCProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOIDCProviderResponseBody body;

    public static CreateOIDCProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOIDCProviderResponse self = new CreateOIDCProviderResponse();
        return TeaModel.build(map, self);
    }

    public CreateOIDCProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOIDCProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOIDCProviderResponse setBody(CreateOIDCProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOIDCProviderResponseBody getBody() {
        return this.body;
    }

}
