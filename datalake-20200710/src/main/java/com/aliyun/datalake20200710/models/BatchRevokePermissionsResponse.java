// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchRevokePermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchRevokePermissionsResponseBody body;

    public static BatchRevokePermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRevokePermissionsResponse self = new BatchRevokePermissionsResponse();
        return TeaModel.build(map, self);
    }

    public BatchRevokePermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchRevokePermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchRevokePermissionsResponse setBody(BatchRevokePermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRevokePermissionsResponseBody getBody() {
        return this.body;
    }

}
