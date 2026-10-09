// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSupabaseBackupJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSupabaseBackupJobsResponseBody body;

    public static ListSupabaseBackupJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSupabaseBackupJobsResponse self = new ListSupabaseBackupJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListSupabaseBackupJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSupabaseBackupJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSupabaseBackupJobsResponse setBody(ListSupabaseBackupJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSupabaseBackupJobsResponseBody getBody() {
        return this.body;
    }

}
