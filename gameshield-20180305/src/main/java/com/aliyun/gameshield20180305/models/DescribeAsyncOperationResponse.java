// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAsyncOperationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAsyncOperationResponseBody body;

    public static DescribeAsyncOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncOperationResponse self = new DescribeAsyncOperationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAsyncOperationResponse setBody(DescribeAsyncOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAsyncOperationResponseBody getBody() {
        return this.body;
    }

}
