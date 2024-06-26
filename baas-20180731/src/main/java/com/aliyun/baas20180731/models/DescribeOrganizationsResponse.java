// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrganizationsResponseBody body;

    public static DescribeOrganizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationsResponse self = new DescribeOrganizationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrganizationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrganizationsResponse setBody(DescribeOrganizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrganizationsResponseBody getBody() {
        return this.body;
    }

}
