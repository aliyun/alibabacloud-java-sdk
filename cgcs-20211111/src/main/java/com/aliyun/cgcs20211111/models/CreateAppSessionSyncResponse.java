// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionSyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppSessionSyncResponseBody body;

    public static CreateAppSessionSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSessionSyncResponse self = new CreateAppSessionSyncResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppSessionSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppSessionSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppSessionSyncResponse setBody(CreateAppSessionSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppSessionSyncResponseBody getBody() {
        return this.body;
    }

}
