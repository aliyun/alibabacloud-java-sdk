// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeACLProtectTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeACLProtectTrendResponseBody body;

    public static DescribeACLProtectTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeACLProtectTrendResponse self = new DescribeACLProtectTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeACLProtectTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeACLProtectTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeACLProtectTrendResponse setBody(DescribeACLProtectTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeACLProtectTrendResponseBody getBody() {
        return this.body;
    }

}
