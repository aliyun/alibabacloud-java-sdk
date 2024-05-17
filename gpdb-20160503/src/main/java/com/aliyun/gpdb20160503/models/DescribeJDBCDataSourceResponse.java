// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeJDBCDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeJDBCDataSourceResponseBody body;

    public static DescribeJDBCDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJDBCDataSourceResponse self = new DescribeJDBCDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJDBCDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJDBCDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeJDBCDataSourceResponse setBody(DescribeJDBCDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJDBCDataSourceResponseBody getBody() {
        return this.body;
    }

}
