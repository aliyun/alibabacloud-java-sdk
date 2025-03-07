// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateSessionClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSessionClusterResponseBody body;

    public static CreateSessionClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionClusterResponse self = new CreateSessionClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateSessionClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSessionClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSessionClusterResponse setBody(CreateSessionClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSessionClusterResponseBody getBody() {
        return this.body;
    }

}
