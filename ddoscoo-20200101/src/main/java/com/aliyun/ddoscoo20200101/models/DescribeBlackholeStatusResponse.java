// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeBlackholeStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBlackholeStatusResponseBody body;

    public static DescribeBlackholeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlackholeStatusResponse self = new DescribeBlackholeStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlackholeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlackholeStatusResponse setBody(DescribeBlackholeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlackholeStatusResponseBody getBody() {
        return this.body;
    }

}
