// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeEventLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventLogResponseBody body;

    public static DescribeEventLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventLogResponse self = new DescribeEventLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventLogResponse setBody(DescribeEventLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventLogResponseBody getBody() {
        return this.body;
    }

}
