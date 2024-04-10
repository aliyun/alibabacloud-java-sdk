// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoSyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetRepoSyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRepoSyncTaskResponse setBody(GetRepoSyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepoSyncTaskResponseBody getBody() {
        return this.body;
    }

}
