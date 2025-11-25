// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateInstanceSyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstanceSyncTaskResponseBody body;

    public static CreateInstanceSyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceSyncTaskResponse self = new CreateInstanceSyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceSyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceSyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceSyncTaskResponse setBody(CreateInstanceSyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceSyncTaskResponseBody getBody() {
        return this.body;
    }

}
