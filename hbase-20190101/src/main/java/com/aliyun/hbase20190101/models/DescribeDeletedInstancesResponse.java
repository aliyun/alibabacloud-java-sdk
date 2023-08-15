// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeDeletedInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeletedInstancesResponseBody body;

    public static DescribeDeletedInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeletedInstancesResponse self = new DescribeDeletedInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeletedInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeletedInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeletedInstancesResponse setBody(DescribeDeletedInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeletedInstancesResponseBody getBody() {
        return this.body;
    }

}
