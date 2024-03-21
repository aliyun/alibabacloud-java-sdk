// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccessPointResponseBody body;

    public static DescribeAccessPointResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessPointResponse self = new DescribeAccessPointResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccessPointResponse setBody(DescribeAccessPointResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessPointResponseBody getBody() {
        return this.body;
    }

}
