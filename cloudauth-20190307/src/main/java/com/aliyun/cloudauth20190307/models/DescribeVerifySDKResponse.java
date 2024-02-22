// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifySDKResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVerifySDKResponseBody body;

    public static DescribeVerifySDKResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySDKResponse self = new DescribeVerifySDKResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifySDKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifySDKResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVerifySDKResponse setBody(DescribeVerifySDKResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifySDKResponseBody getBody() {
        return this.body;
    }

}
