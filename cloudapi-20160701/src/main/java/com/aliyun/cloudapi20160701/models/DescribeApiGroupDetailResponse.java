// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeApiGroupDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiGroupDetailResponseBody body;

    public static DescribeApiGroupDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupDetailResponse self = new DescribeApiGroupDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiGroupDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiGroupDetailResponse setBody(DescribeApiGroupDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiGroupDetailResponseBody getBody() {
        return this.body;
    }

}
