// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrafficLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTrafficLogResponseBody body;

    public static DescribeTrafficLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficLogResponse self = new DescribeTrafficLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTrafficLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTrafficLogResponse setBody(DescribeTrafficLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTrafficLogResponseBody getBody() {
        return this.body;
    }

}
