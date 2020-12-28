// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeNamespacesWithCreateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNamespacesWithCreateResponseBody body;

    public static DescribeNamespacesWithCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespacesWithCreateResponse self = new DescribeNamespacesWithCreateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNamespacesWithCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNamespacesWithCreateResponse setBody(DescribeNamespacesWithCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNamespacesWithCreateResponseBody getBody() {
        return this.body;
    }

}
