// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageSupportInstanceTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageSupportInstanceTypesResponseBody body;

    public static DescribeImageSupportInstanceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSupportInstanceTypesResponse self = new DescribeImageSupportInstanceTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageSupportInstanceTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageSupportInstanceTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageSupportInstanceTypesResponse setBody(DescribeImageSupportInstanceTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageSupportInstanceTypesResponseBody getBody() {
        return this.body;
    }

}
