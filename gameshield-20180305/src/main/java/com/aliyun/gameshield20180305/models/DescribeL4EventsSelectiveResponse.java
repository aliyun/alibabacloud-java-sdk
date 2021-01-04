// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeL4EventsSelectiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeL4EventsSelectiveResponseBody body;

    public static DescribeL4EventsSelectiveResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeL4EventsSelectiveResponse self = new DescribeL4EventsSelectiveResponse();
        return TeaModel.build(map, self);
    }

    public DescribeL4EventsSelectiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeL4EventsSelectiveResponse setBody(DescribeL4EventsSelectiveResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeL4EventsSelectiveResponseBody getBody() {
        return this.body;
    }

}
