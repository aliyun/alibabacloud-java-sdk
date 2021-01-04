// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeExecutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExecutionResponseBody body;

    public static DescribeExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExecutionResponse self = new DescribeExecutionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExecutionResponse setBody(DescribeExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExecutionResponseBody getBody() {
        return this.body;
    }

}
