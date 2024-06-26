// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBlockResponseBody body;

    public static DescribeBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockResponse self = new DescribeBlockResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBlockResponse setBody(DescribeBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlockResponseBody getBody() {
        return this.body;
    }

}
