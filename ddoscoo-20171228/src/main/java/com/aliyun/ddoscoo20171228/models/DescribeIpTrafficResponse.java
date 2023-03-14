// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeIpTrafficResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIpTrafficResponseBody body;

    public static DescribeIpTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpTrafficResponse self = new DescribeIpTrafficResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpTrafficResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpTrafficResponse setBody(DescribeIpTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpTrafficResponseBody getBody() {
        return this.body;
    }

}
