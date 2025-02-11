// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ExecuteSparkWarehouseBatchSQLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteSparkWarehouseBatchSQLResponseBody body;

    public static ExecuteSparkWarehouseBatchSQLResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSparkWarehouseBatchSQLResponse self = new ExecuteSparkWarehouseBatchSQLResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteSparkWarehouseBatchSQLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteSparkWarehouseBatchSQLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteSparkWarehouseBatchSQLResponse setBody(ExecuteSparkWarehouseBatchSQLResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteSparkWarehouseBatchSQLResponseBody getBody() {
        return this.body;
    }

}
