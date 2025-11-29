// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DownloadSlowSQLRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadSlowSQLRecordsResponseBody body;

    public static DownloadSlowSQLRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadSlowSQLRecordsResponse self = new DownloadSlowSQLRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DownloadSlowSQLRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadSlowSQLRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadSlowSQLRecordsResponse setBody(DownloadSlowSQLRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadSlowSQLRecordsResponseBody getBody() {
        return this.body;
    }

}
