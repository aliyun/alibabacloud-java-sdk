// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrganizationResponseBody body;

    public static DescribeOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationResponse self = new DescribeOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrganizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrganizationResponse setBody(DescribeOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrganizationResponseBody getBody() {
        return this.body;
    }

}
