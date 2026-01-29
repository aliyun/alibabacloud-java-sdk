// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListRayClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRayClusterResponseBody body;

    public static ListRayClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRayClusterResponse self = new ListRayClusterResponse();
        return TeaModel.build(map, self);
    }

    public ListRayClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRayClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRayClusterResponse setBody(ListRayClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRayClusterResponseBody getBody() {
        return this.body;
    }

}
