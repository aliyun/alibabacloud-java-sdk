// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeWebTechsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebTechsResponseBody body;

    public static DescribeWebTechsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebTechsResponse self = new DescribeWebTechsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebTechsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebTechsResponse setBody(DescribeWebTechsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebTechsResponseBody getBody() {
        return this.body;
    }

}
