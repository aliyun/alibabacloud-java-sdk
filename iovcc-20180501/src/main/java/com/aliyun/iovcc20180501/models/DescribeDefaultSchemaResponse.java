// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDefaultSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDefaultSchemaResponseBody body;

    public static DescribeDefaultSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultSchemaResponse self = new DescribeDefaultSchemaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefaultSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefaultSchemaResponse setBody(DescribeDefaultSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefaultSchemaResponseBody getBody() {
        return this.body;
    }

}
