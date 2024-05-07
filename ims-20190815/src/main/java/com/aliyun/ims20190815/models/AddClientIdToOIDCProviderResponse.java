// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class AddClientIdToOIDCProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddClientIdToOIDCProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddClientIdToOIDCProviderResponse setBody(AddClientIdToOIDCProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public AddClientIdToOIDCProviderResponseBody getBody() {
        return this.body;
    }

}
