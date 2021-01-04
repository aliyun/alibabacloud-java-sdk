// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeGroupListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGroupListResponseBody body;

    public static DescribeGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupListResponse self = new DescribeGroupListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupListResponse setBody(DescribeGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupListResponseBody getBody() {
        return this.body;
    }

}
