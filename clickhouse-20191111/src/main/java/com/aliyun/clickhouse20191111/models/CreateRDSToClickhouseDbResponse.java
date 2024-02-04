// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateRDSToClickhouseDbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRDSToClickhouseDbResponseBody body;

    public static CreateRDSToClickhouseDbResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRDSToClickhouseDbResponse self = new CreateRDSToClickhouseDbResponse();
        return TeaModel.build(map, self);
    }

    public CreateRDSToClickhouseDbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRDSToClickhouseDbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRDSToClickhouseDbResponse setBody(CreateRDSToClickhouseDbResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRDSToClickhouseDbResponseBody getBody() {
        return this.body;
    }

}
