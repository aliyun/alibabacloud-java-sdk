// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataDistResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataDistResultResponseBody body;

    public static DescribeDataDistResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataDistResultResponse self = new DescribeDataDistResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataDistResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataDistResultResponse setBody(DescribeDataDistResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataDistResultResponseBody getBody() {
        return this.body;
    }

}
