// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateRepoSyncTaskResponse setBody(CreateRepoSyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepoSyncTaskResponseBody getBody() {
        return this.body;
    }

}
