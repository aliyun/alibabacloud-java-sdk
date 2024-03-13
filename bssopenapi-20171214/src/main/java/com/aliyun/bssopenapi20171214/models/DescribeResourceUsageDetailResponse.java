// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceUsageDetailResponseBody body;

    public static DescribeResourceUsageDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageDetailResponse self = new DescribeResourceUsageDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceUsageDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceUsageDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceUsageDetailResponse setBody(DescribeResourceUsageDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceUsageDetailResponseBody getBody() {
        return this.body;
    }

}
