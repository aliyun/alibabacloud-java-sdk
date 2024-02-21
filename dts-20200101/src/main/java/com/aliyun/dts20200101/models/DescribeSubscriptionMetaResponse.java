// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSubscriptionMetaResponseBody body;

    public static DescribeSubscriptionMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionMetaResponse self = new DescribeSubscriptionMetaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubscriptionMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSubscriptionMetaResponse setBody(DescribeSubscriptionMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubscriptionMetaResponseBody getBody() {
        return this.body;
    }

}
