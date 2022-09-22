// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeImageFamiliesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImageFamiliesResponseBody body;

    public static DescribeImageFamiliesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFamiliesResponse self = new DescribeImageFamiliesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageFamiliesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageFamiliesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageFamiliesResponse setBody(DescribeImageFamiliesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageFamiliesResponseBody getBody() {
        return this.body;
    }

}
