// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeConfigGroupDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConfigGroupDetailResponseBody body;

    public static DescribeConfigGroupDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigGroupDetailResponse self = new DescribeConfigGroupDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigGroupDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigGroupDetailResponse setBody(DescribeConfigGroupDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigGroupDetailResponseBody getBody() {
        return this.body;
    }

}
