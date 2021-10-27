// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeCanExpandInstanceDetailListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCanExpandInstanceDetailListResponseBody body;

    public static DescribeCanExpandInstanceDetailListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCanExpandInstanceDetailListResponse self = new DescribeCanExpandInstanceDetailListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCanExpandInstanceDetailListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCanExpandInstanceDetailListResponse setBody(DescribeCanExpandInstanceDetailListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCanExpandInstanceDetailListResponseBody getBody() {
        return this.body;
    }

}
