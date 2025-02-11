// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkWarehouseBatchSQLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSparkWarehouseBatchSQLResponseBody body;

    public static ListSparkWarehouseBatchSQLResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSparkWarehouseBatchSQLResponse self = new ListSparkWarehouseBatchSQLResponse();
        return TeaModel.build(map, self);
    }

    public ListSparkWarehouseBatchSQLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSparkWarehouseBatchSQLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSparkWarehouseBatchSQLResponse setBody(ListSparkWarehouseBatchSQLResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSparkWarehouseBatchSQLResponseBody getBody() {
        return this.body;
    }

}
