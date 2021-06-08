// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineCodeRevisionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRoutineCodeRevisionResponseBody body;

    public static DescribeRoutineCodeRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineCodeRevisionResponse self = new DescribeRoutineCodeRevisionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineCodeRevisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRoutineCodeRevisionResponse setBody(DescribeRoutineCodeRevisionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRoutineCodeRevisionResponseBody getBody() {
        return this.body;
    }

}
