// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListBackupJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBackupJobsResponseBody body;

    public static ListBackupJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBackupJobsResponse self = new ListBackupJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListBackupJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBackupJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBackupJobsResponse setBody(ListBackupJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBackupJobsResponseBody getBody() {
        return this.body;
    }

}
