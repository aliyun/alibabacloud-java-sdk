// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGtmAccessStrategyResponseBody body;

    public static DescribeGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAccessStrategyResponse self = new DescribeGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmAccessStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmAccessStrategyResponse setBody(DescribeGtmAccessStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmAccessStrategyResponseBody getBody() {
        return this.body;
    }

}
