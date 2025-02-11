// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CancelSparkWarehouseBatchSQLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelSparkWarehouseBatchSQLResponseBody body;

    public static CancelSparkWarehouseBatchSQLResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSparkWarehouseBatchSQLResponse self = new CancelSparkWarehouseBatchSQLResponse();
        return TeaModel.build(map, self);
    }

    public CancelSparkWarehouseBatchSQLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelSparkWarehouseBatchSQLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelSparkWarehouseBatchSQLResponse setBody(CancelSparkWarehouseBatchSQLResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelSparkWarehouseBatchSQLResponseBody getBody() {
        return this.body;
    }

}
