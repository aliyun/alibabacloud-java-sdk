// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class GetMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMonitorDataResponseBody body;

    public static GetMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorDataResponse self = new GetMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public GetMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMonitorDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMonitorDataResponse setBody(GetMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMonitorDataResponseBody getBody() {
        return this.body;
    }

}
