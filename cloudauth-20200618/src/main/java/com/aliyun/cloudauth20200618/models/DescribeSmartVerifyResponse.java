// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class DescribeSmartVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSmartVerifyResponseBody body;

    public static DescribeSmartVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartVerifyResponse self = new DescribeSmartVerifyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmartVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmartVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSmartVerifyResponse setBody(DescribeSmartVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmartVerifyResponseBody getBody() {
        return this.body;
    }

}
