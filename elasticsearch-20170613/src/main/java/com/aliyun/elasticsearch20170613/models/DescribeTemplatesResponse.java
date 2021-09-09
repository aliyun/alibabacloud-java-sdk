// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTemplatesResponseBody body;

    public static DescribeTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatesResponse self = new DescribeTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTemplatesResponse setBody(DescribeTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTemplatesResponseBody getBody() {
        return this.body;
    }

}
