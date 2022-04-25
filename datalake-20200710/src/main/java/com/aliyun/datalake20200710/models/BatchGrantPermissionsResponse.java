// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchGrantPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchGrantPermissionsResponse setBody(BatchGrantPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGrantPermissionsResponseBody getBody() {
        return this.body;
    }

}
