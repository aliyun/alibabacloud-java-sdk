// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiResponseBody body;

    public static DescribeApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiResponse self = new DescribeApiResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiResponse setBody(DescribeApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiResponseBody getBody() {
        return this.body;
    }

}
