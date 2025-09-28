// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class BatchEventMigrateInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchEventMigrateInstanceResponseBody body;

    public static BatchEventMigrateInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchEventMigrateInstanceResponse self = new BatchEventMigrateInstanceResponse();
        return TeaModel.build(map, self);
    }

    public BatchEventMigrateInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchEventMigrateInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchEventMigrateInstanceResponse setBody(BatchEventMigrateInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchEventMigrateInstanceResponseBody getBody() {
        return this.body;
    }

}
