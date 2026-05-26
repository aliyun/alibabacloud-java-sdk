// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetSAMLServiceProviderInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSAMLServiceProviderInfoResponseBody body;

    public static GetSAMLServiceProviderInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSAMLServiceProviderInfoResponse self = new GetSAMLServiceProviderInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSAMLServiceProviderInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSAMLServiceProviderInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSAMLServiceProviderInfoResponse setBody(GetSAMLServiceProviderInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSAMLServiceProviderInfoResponseBody getBody() {
        return this.body;
    }

}
