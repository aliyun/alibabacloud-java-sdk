// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CheckCreateClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckCreateClusterResponseBody body;

    public static CheckCreateClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateClusterResponse self = new CheckCreateClusterResponse();
        return TeaModel.build(map, self);
    }

    public CheckCreateClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCreateClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCreateClusterResponse setBody(CheckCreateClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCreateClusterResponseBody getBody() {
        return this.body;
    }

}
