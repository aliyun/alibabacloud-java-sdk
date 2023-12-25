// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAddonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAddonResponseBody body;

    public static DescribeAddonResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonResponse self = new DescribeAddonResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAddonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAddonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAddonResponse setBody(DescribeAddonResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAddonResponseBody getBody() {
        return this.body;
    }

}
