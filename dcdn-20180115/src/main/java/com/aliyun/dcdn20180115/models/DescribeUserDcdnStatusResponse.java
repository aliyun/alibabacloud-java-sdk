// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeUserDcdnStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserDcdnStatusResponseBody body;

    public static DescribeUserDcdnStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDcdnStatusResponse self = new DescribeUserDcdnStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserDcdnStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserDcdnStatusResponse setBody(DescribeUserDcdnStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserDcdnStatusResponseBody getBody() {
        return this.body;
    }

}
