// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class DescribeTemplateCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTemplateCacheResponseBody body;

    public static DescribeTemplateCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateCacheResponse self = new DescribeTemplateCacheResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTemplateCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTemplateCacheResponse setBody(DescribeTemplateCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTemplateCacheResponseBody getBody() {
        return this.body;
    }

}
