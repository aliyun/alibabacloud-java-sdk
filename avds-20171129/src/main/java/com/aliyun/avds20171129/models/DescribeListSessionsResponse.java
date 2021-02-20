// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeListSessionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeListSessionsResponseBody body;

    public static DescribeListSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeListSessionsResponse self = new DescribeListSessionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeListSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeListSessionsResponse setBody(DescribeListSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeListSessionsResponseBody getBody() {
        return this.body;
    }

}
