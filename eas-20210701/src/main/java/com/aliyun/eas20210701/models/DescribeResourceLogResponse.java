// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeResourceLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourceLogResponseBody body;

    public static DescribeResourceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceLogResponse self = new DescribeResourceLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceLogResponse setBody(DescribeResourceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceLogResponseBody getBody() {
        return this.body;
    }

}
