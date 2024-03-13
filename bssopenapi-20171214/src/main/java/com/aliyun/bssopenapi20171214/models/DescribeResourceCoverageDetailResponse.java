// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceCoverageDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceCoverageDetailResponseBody body;

    public static DescribeResourceCoverageDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceCoverageDetailResponse self = new DescribeResourceCoverageDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceCoverageDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceCoverageDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceCoverageDetailResponse setBody(DescribeResourceCoverageDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceCoverageDetailResponseBody getBody() {
        return this.body;
    }

}
