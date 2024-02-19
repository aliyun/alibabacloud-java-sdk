// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLLogsResponseBody body;

    public static DescribeSQLLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogsResponse self = new DescribeSQLLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLLogsResponse setBody(DescribeSQLLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLLogsResponseBody getBody() {
        return this.body;
    }

}
