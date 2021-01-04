// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAppSimpleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppSimpleListResponseBody body;

    public static DescribeAppSimpleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppSimpleListResponse self = new DescribeAppSimpleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppSimpleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppSimpleListResponse setBody(DescribeAppSimpleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppSimpleListResponseBody getBody() {
        return this.body;
    }

}
