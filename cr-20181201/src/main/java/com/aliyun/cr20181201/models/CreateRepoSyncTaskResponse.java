// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRepoSyncTaskResponseBody body;

    public static CreateRepoSyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoSyncTaskResponse self = new CreateRepoSyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRepoSyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRepoSyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRepoSyncTaskResponse setBody(CreateRepoSyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepoSyncTaskResponseBody getBody() {
        return this.body;
    }

}
