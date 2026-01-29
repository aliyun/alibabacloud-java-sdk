// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateRayClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRayClusterResponseBody body;

    public static UpdateRayClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRayClusterResponse self = new UpdateRayClusterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRayClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRayClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRayClusterResponse setBody(UpdateRayClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRayClusterResponseBody getBody() {
        return this.body;
    }

}
