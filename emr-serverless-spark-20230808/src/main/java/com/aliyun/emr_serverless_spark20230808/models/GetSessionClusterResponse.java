// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetSessionClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSessionClusterResponseBody body;

    public static GetSessionClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSessionClusterResponse self = new GetSessionClusterResponse();
        return TeaModel.build(map, self);
    }

    public GetSessionClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSessionClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSessionClusterResponse setBody(GetSessionClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSessionClusterResponseBody getBody() {
        return this.body;
    }

}
