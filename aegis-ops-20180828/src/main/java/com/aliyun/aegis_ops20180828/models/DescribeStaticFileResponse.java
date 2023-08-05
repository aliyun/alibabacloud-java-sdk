// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeStaticFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStaticFileResponseBody body;

    public static DescribeStaticFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStaticFileResponse self = new DescribeStaticFileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStaticFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStaticFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStaticFileResponse setBody(DescribeStaticFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStaticFileResponseBody getBody() {
        return this.body;
    }

}
