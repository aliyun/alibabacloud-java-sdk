// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBBackupDumpTimesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDBBackupDumpTimesResponseBody body;

    public static QueryDBBackupDumpTimesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDBBackupDumpTimesResponse self = new QueryDBBackupDumpTimesResponse();
        return TeaModel.build(map, self);
    }

    public QueryDBBackupDumpTimesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDBBackupDumpTimesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDBBackupDumpTimesResponse setBody(QueryDBBackupDumpTimesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDBBackupDumpTimesResponseBody getBody() {
        return this.body;
    }

}
