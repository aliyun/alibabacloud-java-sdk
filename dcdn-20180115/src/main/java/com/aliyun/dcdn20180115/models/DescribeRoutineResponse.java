// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRoutineResponseBody body;

    public static DescribeRoutineResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineResponse self = new DescribeRoutineResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRoutineResponse setBody(DescribeRoutineResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRoutineResponseBody getBody() {
        return this.body;
    }

}
