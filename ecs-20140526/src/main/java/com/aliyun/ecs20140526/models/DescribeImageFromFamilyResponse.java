// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageFromFamilyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageFromFamilyResponseBody body;

    public static DescribeImageFromFamilyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFromFamilyResponse self = new DescribeImageFromFamilyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageFromFamilyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageFromFamilyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageFromFamilyResponse setBody(DescribeImageFromFamilyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageFromFamilyResponseBody getBody() {
        return this.body;
    }

}
