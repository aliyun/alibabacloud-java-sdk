// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationDeletableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrganizationDeletableResponseBody body;

    public static DescribeOrganizationDeletableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationDeletableResponse self = new DescribeOrganizationDeletableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationDeletableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrganizationDeletableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrganizationDeletableResponse setBody(DescribeOrganizationDeletableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrganizationDeletableResponseBody getBody() {
        return this.body;
    }

}
