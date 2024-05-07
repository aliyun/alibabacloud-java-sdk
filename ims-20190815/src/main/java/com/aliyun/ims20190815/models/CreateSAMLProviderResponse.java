// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateSAMLProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSAMLProviderResponseBody body;

    public static CreateSAMLProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSAMLProviderResponse self = new CreateSAMLProviderResponse();
        return TeaModel.build(map, self);
    }

    public CreateSAMLProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSAMLProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSAMLProviderResponse setBody(CreateSAMLProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSAMLProviderResponseBody getBody() {
        return this.body;
    }

}
