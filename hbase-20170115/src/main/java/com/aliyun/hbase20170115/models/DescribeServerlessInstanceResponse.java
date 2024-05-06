// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeServerlessInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServerlessInstanceResponseBody body;

    public static DescribeServerlessInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerlessInstanceResponse self = new DescribeServerlessInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServerlessInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServerlessInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServerlessInstanceResponse setBody(DescribeServerlessInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServerlessInstanceResponseBody getBody() {
        return this.body;
    }

}
