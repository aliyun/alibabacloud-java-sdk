// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeApiGroupDetailForConsumerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiGroupDetailForConsumerResponseBody body;

    public static DescribeApiGroupDetailForConsumerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupDetailForConsumerResponse self = new DescribeApiGroupDetailForConsumerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupDetailForConsumerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiGroupDetailForConsumerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiGroupDetailForConsumerResponse setBody(DescribeApiGroupDetailForConsumerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiGroupDetailForConsumerResponseBody getBody() {
        return this.body;
    }

}
