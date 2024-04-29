// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortMaxConnsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePortMaxConnsResponseBody body;

    public static DescribePortMaxConnsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortMaxConnsResponse self = new DescribePortMaxConnsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortMaxConnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortMaxConnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePortMaxConnsResponse setBody(DescribePortMaxConnsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortMaxConnsResponseBody getBody() {
        return this.body;
    }

}
