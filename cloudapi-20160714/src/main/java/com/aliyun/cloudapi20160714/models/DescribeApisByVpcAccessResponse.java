// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByVpcAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisByVpcAccessResponseBody body;

    public static DescribeApisByVpcAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByVpcAccessResponse self = new DescribeApisByVpcAccessResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisByVpcAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisByVpcAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisByVpcAccessResponse setBody(DescribeApisByVpcAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisByVpcAccessResponseBody getBody() {
        return this.body;
    }

}
