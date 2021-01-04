// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAppListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppListResponseBody body;

    public static DescribeAppListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppListResponse self = new DescribeAppListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppListResponse setBody(DescribeAppListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppListResponseBody getBody() {
        return this.body;
    }

}
