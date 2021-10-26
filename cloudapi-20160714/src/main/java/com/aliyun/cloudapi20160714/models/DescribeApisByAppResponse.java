// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApisByAppResponseBody body;

    public static DescribeApisByAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByAppResponse self = new DescribeApisByAppResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisByAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisByAppResponse setBody(DescribeApisByAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisByAppResponseBody getBody() {
        return this.body;
    }

}
