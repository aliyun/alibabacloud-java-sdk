// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ElectZookeeperLeaderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ElectZookeeperLeaderResponseBody body;

    public static ElectZookeeperLeaderResponse build(java.util.Map<String, ?> map) throws Exception {
        ElectZookeeperLeaderResponse self = new ElectZookeeperLeaderResponse();
        return TeaModel.build(map, self);
    }

    public ElectZookeeperLeaderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ElectZookeeperLeaderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ElectZookeeperLeaderResponse setBody(ElectZookeeperLeaderResponseBody body) {
        this.body = body;
        return this;
    }
    public ElectZookeeperLeaderResponseBody getBody() {
        return this.body;
    }

}
