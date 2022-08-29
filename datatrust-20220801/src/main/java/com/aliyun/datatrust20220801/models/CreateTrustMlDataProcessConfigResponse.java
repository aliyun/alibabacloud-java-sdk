// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateTrustMlDataProcessConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTrustMlDataProcessConfigResponseBody body;

    public static CreateTrustMlDataProcessConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrustMlDataProcessConfigResponse self = new CreateTrustMlDataProcessConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrustMlDataProcessConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrustMlDataProcessConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrustMlDataProcessConfigResponse setBody(CreateTrustMlDataProcessConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrustMlDataProcessConfigResponseBody getBody() {
        return this.body;
    }

}
