// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoSyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRepoSyncTaskResponseBody body;

    public static ListRepoSyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepoSyncTaskResponse self = new ListRepoSyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListRepoSyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepoSyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepoSyncTaskResponse setBody(ListRepoSyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepoSyncTaskResponseBody getBody() {
        return this.body;
    }

}
