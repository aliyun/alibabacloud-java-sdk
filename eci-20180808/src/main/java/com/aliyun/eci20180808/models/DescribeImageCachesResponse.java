// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeImageCachesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImageCachesResponseBody body;

    public static DescribeImageCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCachesResponse self = new DescribeImageCachesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageCachesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageCachesResponse setBody(DescribeImageCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageCachesResponseBody getBody() {
        return this.body;
    }

}
