// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeGroupSimpleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGroupSimpleListResponseBody body;

    public static DescribeGroupSimpleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupSimpleListResponse self = new DescribeGroupSimpleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupSimpleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupSimpleListResponse setBody(DescribeGroupSimpleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupSimpleListResponseBody getBody() {
        return this.body;
    }

}
