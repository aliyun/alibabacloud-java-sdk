// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationChaincodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrganizationChaincodesResponseBody body;

    public static DescribeOrganizationChaincodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationChaincodesResponse self = new DescribeOrganizationChaincodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationChaincodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrganizationChaincodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrganizationChaincodesResponse setBody(DescribeOrganizationChaincodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrganizationChaincodesResponseBody getBody() {
        return this.body;
    }

}
