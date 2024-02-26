// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvicesFlatPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdvicesFlatPageResponseBody body;

    public static DescribeAdvicesFlatPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvicesFlatPageResponse self = new DescribeAdvicesFlatPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdvicesFlatPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdvicesFlatPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdvicesFlatPageResponse setBody(DescribeAdvicesFlatPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdvicesFlatPageResponseBody getBody() {
        return this.body;
    }

}
