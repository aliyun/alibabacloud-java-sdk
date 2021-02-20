// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessLogEmptyCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebAccessLogEmptyCountResponseBody body;

    public static DescribeWebAccessLogEmptyCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessLogEmptyCountResponse self = new DescribeWebAccessLogEmptyCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessLogEmptyCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebAccessLogEmptyCountResponse setBody(DescribeWebAccessLogEmptyCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebAccessLogEmptyCountResponseBody getBody() {
        return this.body;
    }

}
