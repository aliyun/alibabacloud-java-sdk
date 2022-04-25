// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchRevokePermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchRevokePermissionsResponse setBody(BatchRevokePermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRevokePermissionsResponseBody getBody() {
        return this.body;
    }

}
