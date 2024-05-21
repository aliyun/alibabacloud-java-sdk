// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListSessionClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSessionClustersResponseBody body;

    public static ListSessionClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSessionClustersResponse self = new ListSessionClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListSessionClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSessionClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSessionClustersResponse setBody(ListSessionClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSessionClustersResponseBody getBody() {
        return this.body;
    }

}
