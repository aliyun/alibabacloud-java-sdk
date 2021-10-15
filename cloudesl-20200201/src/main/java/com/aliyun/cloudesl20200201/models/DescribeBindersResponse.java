// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeBindersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBindersResponseBody body;

    public static DescribeBindersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBindersResponse self = new DescribeBindersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBindersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBindersResponse setBody(DescribeBindersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBindersResponseBody getBody() {
        return this.body;
    }

}
