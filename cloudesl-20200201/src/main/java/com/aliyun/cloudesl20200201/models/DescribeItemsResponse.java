// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeItemsResponseBody body;

    public static DescribeItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeItemsResponse self = new DescribeItemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeItemsResponse setBody(DescribeItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeItemsResponseBody getBody() {
        return this.body;
    }

}
