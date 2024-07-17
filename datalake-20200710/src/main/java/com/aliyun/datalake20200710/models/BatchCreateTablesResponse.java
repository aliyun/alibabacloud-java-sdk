// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchCreateTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateTablesResponseBody body;

    public static BatchCreateTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateTablesResponse self = new BatchCreateTablesResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateTablesResponse setBody(BatchCreateTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateTablesResponseBody getBody() {
        return this.body;
    }

}
