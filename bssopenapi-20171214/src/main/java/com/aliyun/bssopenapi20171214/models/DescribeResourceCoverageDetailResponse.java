// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceCoverageDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeResourceCoverageDetailResponse setBody(DescribeResourceCoverageDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceCoverageDetailResponseBody getBody() {
        return this.body;
    }

}
