// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeActiveSQLRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeActiveSQLRecordsResponseBody body;

    public static DescribeActiveSQLRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveSQLRecordsResponse self = new DescribeActiveSQLRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActiveSQLRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActiveSQLRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeActiveSQLRecordsResponse setBody(DescribeActiveSQLRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActiveSQLRecordsResponseBody getBody() {
        return this.body;
    }

}
