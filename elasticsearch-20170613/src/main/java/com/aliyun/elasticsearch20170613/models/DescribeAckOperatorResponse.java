// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeAckOperatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAckOperatorResponseBody body;

    public static DescribeAckOperatorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckOperatorResponse self = new DescribeAckOperatorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAckOperatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAckOperatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAckOperatorResponse setBody(DescribeAckOperatorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAckOperatorResponseBody getBody() {
        return this.body;
    }

}
