// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchGrantPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGrantPermissionsResponseBody body;

    public static BatchGrantPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGrantPermissionsResponse self = new BatchGrantPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public BatchGrantPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGrantPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGrantPermissionsResponse setBody(BatchGrantPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGrantPermissionsResponseBody getBody() {
        return this.body;
    }

}
