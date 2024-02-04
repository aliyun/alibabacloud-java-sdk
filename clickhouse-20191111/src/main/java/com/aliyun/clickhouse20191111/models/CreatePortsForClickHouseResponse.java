// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreatePortsForClickHouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePortsForClickHouseResponseBody body;

    public static CreatePortsForClickHouseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePortsForClickHouseResponse self = new CreatePortsForClickHouseResponse();
        return TeaModel.build(map, self);
    }

    public CreatePortsForClickHouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePortsForClickHouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePortsForClickHouseResponse setBody(CreatePortsForClickHouseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePortsForClickHouseResponseBody getBody() {
        return this.body;
    }

}
