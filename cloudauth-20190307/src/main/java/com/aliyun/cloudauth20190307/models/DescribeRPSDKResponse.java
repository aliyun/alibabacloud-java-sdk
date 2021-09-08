// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeRPSDKResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRPSDKResponseBody body;

    public static DescribeRPSDKResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRPSDKResponse self = new DescribeRPSDKResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRPSDKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRPSDKResponse setBody(DescribeRPSDKResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRPSDKResponseBody getBody() {
        return this.body;
    }

}
