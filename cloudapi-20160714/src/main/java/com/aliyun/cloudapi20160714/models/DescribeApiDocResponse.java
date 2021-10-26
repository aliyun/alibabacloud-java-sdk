// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiDocResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiDocResponseBody body;

    public static DescribeApiDocResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiDocResponse self = new DescribeApiDocResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiDocResponse setBody(DescribeApiDocResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiDocResponseBody getBody() {
        return this.body;
    }

}
