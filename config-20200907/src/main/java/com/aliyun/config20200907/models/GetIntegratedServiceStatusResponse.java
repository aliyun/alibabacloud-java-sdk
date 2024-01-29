// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetIntegratedServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIntegratedServiceStatusResponseBody body;

    public static GetIntegratedServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIntegratedServiceStatusResponse self = new GetIntegratedServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetIntegratedServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIntegratedServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIntegratedServiceStatusResponse setBody(GetIntegratedServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIntegratedServiceStatusResponseBody getBody() {
        return this.body;
    }

}
