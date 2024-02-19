// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDownloadSQLLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDownloadSQLLogsResponseBody body;

    public static DescribeDownloadSQLLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadSQLLogsResponse self = new DescribeDownloadSQLLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadSQLLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDownloadSQLLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDownloadSQLLogsResponse setBody(DescribeDownloadSQLLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDownloadSQLLogsResponseBody getBody() {
        return this.body;
    }

}
