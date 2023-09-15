// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class StopDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopDBInstanceResponseBody body;

    public static StopDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDBInstanceResponse self = new StopDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDBInstanceResponse setBody(StopDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDBInstanceResponseBody getBody() {
        return this.body;
    }

}
