// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeIpSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIpSetResponseBody body;

    public static DescribeIpSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpSetResponse self = new DescribeIpSetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpSetResponse setBody(DescribeIpSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpSetResponseBody getBody() {
        return this.body;
    }

}
