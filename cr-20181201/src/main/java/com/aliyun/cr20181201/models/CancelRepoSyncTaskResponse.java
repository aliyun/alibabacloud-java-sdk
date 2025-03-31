// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CancelRepoSyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelRepoSyncTaskResponseBody body;

    public static CancelRepoSyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRepoSyncTaskResponse self = new CancelRepoSyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelRepoSyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelRepoSyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelRepoSyncTaskResponse setBody(CancelRepoSyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelRepoSyncTaskResponseBody getBody() {
        return this.body;
    }

}
