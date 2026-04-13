// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetStackDeploymentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStackDeploymentsResponseBody body;

    public static GetStackDeploymentsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackDeploymentsResponse self = new GetStackDeploymentsResponse();
        return TeaModel.build(map, self);
    }

    public GetStackDeploymentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStackDeploymentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStackDeploymentsResponse setBody(GetStackDeploymentsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStackDeploymentsResponseBody getBody() {
        return this.body;
    }

}
