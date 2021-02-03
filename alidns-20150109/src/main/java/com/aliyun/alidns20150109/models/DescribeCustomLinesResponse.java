// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCustomLinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustomLinesResponseBody body;

    public static DescribeCustomLinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLinesResponse self = new DescribeCustomLinesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomLinesResponse setBody(DescribeCustomLinesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomLinesResponseBody getBody() {
        return this.body;
    }

}
