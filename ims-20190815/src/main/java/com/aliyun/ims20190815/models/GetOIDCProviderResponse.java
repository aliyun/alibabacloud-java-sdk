// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetOIDCProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetOIDCProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOIDCProviderResponse setBody(GetOIDCProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOIDCProviderResponseBody getBody() {
        return this.body;
    }

}
