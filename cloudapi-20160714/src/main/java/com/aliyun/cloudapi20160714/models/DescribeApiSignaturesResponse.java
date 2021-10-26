// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiSignaturesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiSignaturesResponseBody body;

    public static DescribeApiSignaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiSignaturesResponse self = new DescribeApiSignaturesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiSignaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiSignaturesResponse setBody(DescribeApiSignaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiSignaturesResponseBody getBody() {
        return this.body;
    }

}
