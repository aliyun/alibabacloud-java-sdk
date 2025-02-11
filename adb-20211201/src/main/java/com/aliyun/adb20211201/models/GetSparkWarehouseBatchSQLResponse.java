// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkWarehouseBatchSQLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkWarehouseBatchSQLResponseBody body;

    public static GetSparkWarehouseBatchSQLResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkWarehouseBatchSQLResponse self = new GetSparkWarehouseBatchSQLResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkWarehouseBatchSQLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkWarehouseBatchSQLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkWarehouseBatchSQLResponse setBody(GetSparkWarehouseBatchSQLResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkWarehouseBatchSQLResponseBody getBody() {
        return this.body;
    }

}
