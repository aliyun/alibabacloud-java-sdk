// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSlowSQLLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSlowSQLLogsResponseBody body;

    public static DescribeSlowSQLLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowSQLLogsResponse self = new DescribeSlowSQLLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowSQLLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowSQLLogsResponse setBody(DescribeSlowSQLLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowSQLLogsResponseBody getBody() {
        return this.body;
    }

}
