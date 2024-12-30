// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeOversizeNonPartitionTableInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOversizeNonPartitionTableInfosResponseBody body;

    public static DescribeOversizeNonPartitionTableInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOversizeNonPartitionTableInfosResponse self = new DescribeOversizeNonPartitionTableInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOversizeNonPartitionTableInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOversizeNonPartitionTableInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOversizeNonPartitionTableInfosResponse setBody(DescribeOversizeNonPartitionTableInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOversizeNonPartitionTableInfosResponseBody getBody() {
        return this.body;
    }

}
