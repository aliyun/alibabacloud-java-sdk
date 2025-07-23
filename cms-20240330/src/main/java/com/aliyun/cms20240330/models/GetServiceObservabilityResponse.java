// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetServiceObservabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceObservabilityResponseBody body;

    public static GetServiceObservabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceObservabilityResponse self = new GetServiceObservabilityResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceObservabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceObservabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceObservabilityResponse setBody(GetServiceObservabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceObservabilityResponseBody getBody() {
        return this.body;
    }

}
