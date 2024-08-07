// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSDGResponseBody body;

    public static DescribeSDGResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDGResponse self = new DescribeSDGResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSDGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSDGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSDGResponse setBody(DescribeSDGResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSDGResponseBody getBody() {
        return this.body;
    }

}
