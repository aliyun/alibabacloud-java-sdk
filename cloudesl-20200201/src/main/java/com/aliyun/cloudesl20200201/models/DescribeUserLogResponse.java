// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeUserLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserLogResponseBody body;

    public static DescribeUserLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLogResponse self = new DescribeUserLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserLogResponse setBody(DescribeUserLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserLogResponseBody getBody() {
        return this.body;
    }

}
