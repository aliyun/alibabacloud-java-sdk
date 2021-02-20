// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeHostsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHostsResponseBody body;

    public static DescribeHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostsResponse self = new DescribeHostsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHostsResponse setBody(DescribeHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHostsResponseBody getBody() {
        return this.body;
    }

}
