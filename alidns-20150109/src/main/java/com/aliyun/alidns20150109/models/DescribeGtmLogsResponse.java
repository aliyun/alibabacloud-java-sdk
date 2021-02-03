// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGtmLogsResponseBody body;

    public static DescribeGtmLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmLogsResponse self = new DescribeGtmLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmLogsResponse setBody(DescribeGtmLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmLogsResponseBody getBody() {
        return this.body;
    }

}
