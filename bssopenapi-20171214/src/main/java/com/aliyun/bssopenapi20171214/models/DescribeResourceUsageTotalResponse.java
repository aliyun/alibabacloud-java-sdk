// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageTotalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourceUsageTotalResponseBody body;

    public static DescribeResourceUsageTotalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageTotalResponse self = new DescribeResourceUsageTotalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceUsageTotalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceUsageTotalResponse setBody(DescribeResourceUsageTotalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceUsageTotalResponseBody getBody() {
        return this.body;
    }

}
