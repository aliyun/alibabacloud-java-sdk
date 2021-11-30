// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeResourceDLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourceDLinkResponseBody body;

    public static DescribeResourceDLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceDLinkResponse self = new DescribeResourceDLinkResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceDLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceDLinkResponse setBody(DescribeResourceDLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceDLinkResponseBody getBody() {
        return this.body;
    }

}
