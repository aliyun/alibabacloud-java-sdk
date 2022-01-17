// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeCurrentNodeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCurrentNodeInfoResponseBody body;

    public static DescribeCurrentNodeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCurrentNodeInfoResponse self = new DescribeCurrentNodeInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCurrentNodeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCurrentNodeInfoResponse setBody(DescribeCurrentNodeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCurrentNodeInfoResponseBody getBody() {
        return this.body;
    }

}
