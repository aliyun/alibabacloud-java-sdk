// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceStatusResponseBody body;

    public static GetServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceStatusResponse self = new GetServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceStatusResponse setBody(GetServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceStatusResponseBody getBody() {
        return this.body;
    }

}
