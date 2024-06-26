// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationPeersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrganizationPeersResponseBody body;

    public static DescribeOrganizationPeersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationPeersResponse self = new DescribeOrganizationPeersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationPeersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrganizationPeersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrganizationPeersResponse setBody(DescribeOrganizationPeersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrganizationPeersResponseBody getBody() {
        return this.body;
    }

}
