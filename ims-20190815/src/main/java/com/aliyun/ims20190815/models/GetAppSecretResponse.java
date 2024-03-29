// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAppSecretResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppSecretResponseBody body;

    public static GetAppSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppSecretResponse self = new GetAppSecretResponse();
        return TeaModel.build(map, self);
    }

    public GetAppSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppSecretResponse setBody(GetAppSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppSecretResponseBody getBody() {
        return this.body;
    }

}
