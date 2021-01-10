// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBBackupDumpTimesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryDBBackupDumpTimesResponse setBody(QueryDBBackupDumpTimesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDBBackupDumpTimesResponseBody getBody() {
        return this.body;
    }

}
