// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class DescribeProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProjectResponseBody body;

    public static DescribeProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectResponse self = new DescribeProjectResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProjectResponse setBody(DescribeProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectResponseBody getBody() {
        return this.body;
    }

}
