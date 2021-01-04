// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAppDailySdkVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppDailySdkVersionsResponseBody body;

    public static DescribeAppDailySdkVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppDailySdkVersionsResponse self = new DescribeAppDailySdkVersionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppDailySdkVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppDailySdkVersionsResponse setBody(DescribeAppDailySdkVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppDailySdkVersionsResponseBody getBody() {
        return this.body;
    }

}
