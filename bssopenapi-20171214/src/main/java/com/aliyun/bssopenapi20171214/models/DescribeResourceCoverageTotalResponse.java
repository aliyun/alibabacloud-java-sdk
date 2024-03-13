// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceCoverageTotalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceCoverageTotalResponseBody body;

    public static DescribeResourceCoverageTotalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceCoverageTotalResponse self = new DescribeResourceCoverageTotalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceCoverageTotalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceCoverageTotalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceCoverageTotalResponse setBody(DescribeResourceCoverageTotalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceCoverageTotalResponseBody getBody() {
        return this.body;
    }

}
