// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateOIDCProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateOIDCProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOIDCProviderResponse setBody(UpdateOIDCProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOIDCProviderResponseBody getBody() {
        return this.body;
    }

}
