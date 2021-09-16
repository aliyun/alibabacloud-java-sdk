// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSubscriptionMetaResponse setBody(DescribeSubscriptionMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubscriptionMetaResponseBody getBody() {
        return this.body;
    }

}
