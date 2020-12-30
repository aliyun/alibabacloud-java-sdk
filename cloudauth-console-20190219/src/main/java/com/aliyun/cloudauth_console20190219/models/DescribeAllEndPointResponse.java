// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeAllEndPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAllEndPointResponseBody body;

    public static DescribeAllEndPointResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllEndPointResponse self = new DescribeAllEndPointResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllEndPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllEndPointResponse setBody(DescribeAllEndPointResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllEndPointResponseBody getBody() {
        return this.body;
    }

}
