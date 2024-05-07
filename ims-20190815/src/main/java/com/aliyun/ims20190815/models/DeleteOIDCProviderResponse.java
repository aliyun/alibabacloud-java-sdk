// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteOIDCProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOIDCProviderResponseBody body;

    public static DeleteOIDCProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOIDCProviderResponse self = new DeleteOIDCProviderResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOIDCProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOIDCProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOIDCProviderResponse setBody(DeleteOIDCProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOIDCProviderResponseBody getBody() {
        return this.body;
    }

}
