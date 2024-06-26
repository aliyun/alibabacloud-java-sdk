// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrganizationUsersResponseBody body;

    public static DescribeOrganizationUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationUsersResponse self = new DescribeOrganizationUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrganizationUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrganizationUsersResponse setBody(DescribeOrganizationUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrganizationUsersResponseBody getBody() {
        return this.body;
    }

}
