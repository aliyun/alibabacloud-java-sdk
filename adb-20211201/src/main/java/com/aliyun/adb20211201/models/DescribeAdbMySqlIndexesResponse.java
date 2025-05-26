// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlIndexesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdbMySqlIndexesResponseBody body;

    public static DescribeAdbMySqlIndexesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlIndexesResponse self = new DescribeAdbMySqlIndexesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlIndexesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdbMySqlIndexesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdbMySqlIndexesResponse setBody(DescribeAdbMySqlIndexesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdbMySqlIndexesResponseBody getBody() {
        return this.body;
    }

}
