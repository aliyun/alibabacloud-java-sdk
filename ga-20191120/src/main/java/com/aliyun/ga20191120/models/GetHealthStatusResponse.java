// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetHealthStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHealthStatusResponseBody body;

    public static GetHealthStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHealthStatusResponse self = new GetHealthStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetHealthStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHealthStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHealthStatusResponse setBody(GetHealthStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHealthStatusResponseBody getBody() {
        return this.body;
    }

}
