// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceProvidersPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceProvidersPageResponseBody body;

    public static GetServiceProvidersPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceProvidersPageResponse self = new GetServiceProvidersPageResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceProvidersPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceProvidersPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceProvidersPageResponse setBody(GetServiceProvidersPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceProvidersPageResponseBody getBody() {
        return this.body;
    }

}
