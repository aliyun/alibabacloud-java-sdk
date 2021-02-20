// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAreaBlockConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebAreaBlockConfigsResponseBody body;

    public static DescribeWebAreaBlockConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAreaBlockConfigsResponse self = new DescribeWebAreaBlockConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebAreaBlockConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebAreaBlockConfigsResponse setBody(DescribeWebAreaBlockConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebAreaBlockConfigsResponseBody getBody() {
        return this.body;
    }

}
