// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoSyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRepoSyncTaskResponseBody body;

    public static GetRepoSyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepoSyncTaskResponse self = new GetRepoSyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetRepoSyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepoSyncTaskResponse setBody(GetRepoSyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepoSyncTaskResponseBody getBody() {
        return this.body;
    }

}
