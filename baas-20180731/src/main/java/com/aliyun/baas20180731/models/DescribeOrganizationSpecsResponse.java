// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationSpecsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrganizationSpecsResponseBody body;

    public static DescribeOrganizationSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationSpecsResponse self = new DescribeOrganizationSpecsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrganizationSpecsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrganizationSpecsResponse setBody(DescribeOrganizationSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrganizationSpecsResponseBody getBody() {
        return this.body;
    }

}
