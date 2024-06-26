// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRecycleBinTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRecycleBinTablesResponseBody body;

    public static DescribeRecycleBinTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecycleBinTablesResponse self = new DescribeRecycleBinTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecycleBinTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecycleBinTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecycleBinTablesResponse setBody(DescribeRecycleBinTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecycleBinTablesResponseBody getBody() {
        return this.body;
    }

}
