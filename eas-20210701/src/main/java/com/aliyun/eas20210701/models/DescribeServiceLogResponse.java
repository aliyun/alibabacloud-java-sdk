// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceLogResponseBody body;

    public static DescribeServiceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceLogResponse self = new DescribeServiceLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceLogResponse setBody(DescribeServiceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceLogResponseBody getBody() {
        return this.body;
    }

}
