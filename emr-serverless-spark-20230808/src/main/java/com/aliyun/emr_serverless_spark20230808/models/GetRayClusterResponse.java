// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetRayClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRayClusterResponseBody body;

    public static GetRayClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRayClusterResponse self = new GetRayClusterResponse();
        return TeaModel.build(map, self);
    }

    public GetRayClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRayClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRayClusterResponse setBody(GetRayClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRayClusterResponseBody getBody() {
        return this.body;
    }

}
