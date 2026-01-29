// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class DeleteRayClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRayClusterResponseBody body;

    public static DeleteRayClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRayClusterResponse self = new DeleteRayClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRayClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRayClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRayClusterResponse setBody(DeleteRayClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRayClusterResponseBody getBody() {
        return this.body;
    }

}
