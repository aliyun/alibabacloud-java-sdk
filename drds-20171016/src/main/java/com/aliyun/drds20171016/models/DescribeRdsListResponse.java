// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeRdsListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRdsListResponseBody body;

    public static DescribeRdsListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsListResponse self = new DescribeRdsListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsListResponse setBody(DescribeRdsListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsListResponseBody getBody() {
        return this.body;
    }

}
