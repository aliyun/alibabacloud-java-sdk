// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataDistResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataDistResultResponseBody body;

    public static DescribeDataDistResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataDistResultResponse self = new DescribeDataDistResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataDistResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataDistResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataDistResultResponse setBody(DescribeDataDistResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataDistResultResponseBody getBody() {
        return this.body;
    }

}
