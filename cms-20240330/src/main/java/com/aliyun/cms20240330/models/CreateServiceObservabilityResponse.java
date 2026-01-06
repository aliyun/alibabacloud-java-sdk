// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateServiceObservabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceObservabilityResponseBody body;

    public static CreateServiceObservabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceObservabilityResponse self = new CreateServiceObservabilityResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceObservabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceObservabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceObservabilityResponse setBody(CreateServiceObservabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceObservabilityResponseBody getBody() {
        return this.body;
    }

}
