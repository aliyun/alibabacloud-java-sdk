// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrganizationMembersResponseBody body;

    public static DescribeOrganizationMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationMembersResponse self = new DescribeOrganizationMembersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrganizationMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrganizationMembersResponse setBody(DescribeOrganizationMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrganizationMembersResponseBody getBody() {
        return this.body;
    }

}
