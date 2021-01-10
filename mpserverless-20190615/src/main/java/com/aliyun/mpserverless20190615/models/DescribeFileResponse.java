// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFileResponseBody body;

    public static DescribeFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileResponse self = new DescribeFileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFileResponse setBody(DescribeFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFileResponseBody getBody() {
        return this.body;
    }

}
