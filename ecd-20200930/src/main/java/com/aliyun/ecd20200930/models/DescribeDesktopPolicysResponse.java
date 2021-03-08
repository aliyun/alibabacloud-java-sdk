// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopPolicysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDesktopPolicysResponseBody body;

    public static DescribeDesktopPolicysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopPolicysResponse self = new DescribeDesktopPolicysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopPolicysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDesktopPolicysResponse setBody(DescribeDesktopPolicysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDesktopPolicysResponseBody getBody() {
        return this.body;
    }

}
