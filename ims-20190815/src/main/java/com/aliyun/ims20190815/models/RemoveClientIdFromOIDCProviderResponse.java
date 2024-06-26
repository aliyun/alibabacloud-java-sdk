// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RemoveClientIdFromOIDCProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RemoveClientIdFromOIDCProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveClientIdFromOIDCProviderResponse setBody(RemoveClientIdFromOIDCProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveClientIdFromOIDCProviderResponseBody getBody() {
        return this.body;
    }

}
