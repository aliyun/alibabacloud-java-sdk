// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationChannelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrganizationChannelsResponseBody body;

    public static DescribeOrganizationChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationChannelsResponse self = new DescribeOrganizationChannelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrganizationChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrganizationChannelsResponse setBody(DescribeOrganizationChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrganizationChannelsResponseBody getBody() {
        return this.body;
    }

}
