// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionBatchSyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppSessionBatchSyncResponseBody body;

    public static CreateAppSessionBatchSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSessionBatchSyncResponse self = new CreateAppSessionBatchSyncResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppSessionBatchSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppSessionBatchSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppSessionBatchSyncResponse setBody(CreateAppSessionBatchSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppSessionBatchSyncResponseBody getBody() {
        return this.body;
    }

}
