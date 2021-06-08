// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineCanaryEnvsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRoutineCanaryEnvsResponseBody body;

    public static DescribeRoutineCanaryEnvsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineCanaryEnvsResponse self = new DescribeRoutineCanaryEnvsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineCanaryEnvsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRoutineCanaryEnvsResponse setBody(DescribeRoutineCanaryEnvsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRoutineCanaryEnvsResponseBody getBody() {
        return this.body;
    }

}
