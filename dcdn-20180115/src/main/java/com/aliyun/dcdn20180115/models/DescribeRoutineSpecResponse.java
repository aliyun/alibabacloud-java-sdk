// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRoutineSpecResponseBody body;

    public static DescribeRoutineSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineSpecResponse self = new DescribeRoutineSpecResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRoutineSpecResponse setBody(DescribeRoutineSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRoutineSpecResponseBody getBody() {
        return this.body;
    }

}
