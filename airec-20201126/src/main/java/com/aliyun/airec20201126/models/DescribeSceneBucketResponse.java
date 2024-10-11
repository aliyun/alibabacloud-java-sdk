// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeSceneBucketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSceneBucketResponseBody body;

    public static DescribeSceneBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneBucketResponse self = new DescribeSceneBucketResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSceneBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSceneBucketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSceneBucketResponse setBody(DescribeSceneBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneBucketResponseBody getBody() {
        return this.body;
    }

}
