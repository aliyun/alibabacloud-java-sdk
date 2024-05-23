// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSDGsResponseBody body;

    public static DescribeSDGsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDGsResponse self = new DescribeSDGsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSDGsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSDGsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSDGsResponse setBody(DescribeSDGsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSDGsResponseBody getBody() {
        return this.body;
    }

}
