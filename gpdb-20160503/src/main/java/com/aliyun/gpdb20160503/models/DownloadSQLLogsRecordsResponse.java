// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DownloadSQLLogsRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadSQLLogsRecordsResponseBody body;

    public static DownloadSQLLogsRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadSQLLogsRecordsResponse self = new DownloadSQLLogsRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DownloadSQLLogsRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadSQLLogsRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadSQLLogsRecordsResponse setBody(DownloadSQLLogsRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadSQLLogsRecordsResponseBody getBody() {
        return this.body;
    }

}
