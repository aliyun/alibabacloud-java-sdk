// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAppliedAdvicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppliedAdvicesResponseBody body;

    public static DescribeAppliedAdvicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppliedAdvicesResponse self = new DescribeAppliedAdvicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppliedAdvicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppliedAdvicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppliedAdvicesResponse setBody(DescribeAppliedAdvicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppliedAdvicesResponseBody getBody() {
        return this.body;
    }

}
