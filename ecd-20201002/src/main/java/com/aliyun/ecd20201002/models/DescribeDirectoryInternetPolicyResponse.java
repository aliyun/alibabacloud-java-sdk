// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeDirectoryInternetPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDirectoryInternetPolicyResponseBody body;

    public static DescribeDirectoryInternetPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirectoryInternetPolicyResponse self = new DescribeDirectoryInternetPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDirectoryInternetPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDirectoryInternetPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDirectoryInternetPolicyResponse setBody(DescribeDirectoryInternetPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDirectoryInternetPolicyResponseBody getBody() {
        return this.body;
    }

}
