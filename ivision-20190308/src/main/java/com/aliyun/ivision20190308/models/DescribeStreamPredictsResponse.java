// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class DescribeStreamPredictsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStreamPredictsResponseBody body;

    public static DescribeStreamPredictsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamPredictsResponse self = new DescribeStreamPredictsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStreamPredictsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStreamPredictsResponse setBody(DescribeStreamPredictsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStreamPredictsResponseBody getBody() {
        return this.body;
    }

}
