// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeApiStageDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiStageDetailResponseBody body;

    public static DescribeApiStageDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiStageDetailResponse self = new DescribeApiStageDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiStageDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiStageDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiStageDetailResponse setBody(DescribeApiStageDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiStageDetailResponseBody getBody() {
        return this.body;
    }

}
