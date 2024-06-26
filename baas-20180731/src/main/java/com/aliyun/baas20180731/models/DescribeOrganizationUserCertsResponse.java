// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationUserCertsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrganizationUserCertsResponseBody body;

    public static DescribeOrganizationUserCertsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationUserCertsResponse self = new DescribeOrganizationUserCertsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationUserCertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrganizationUserCertsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrganizationUserCertsResponse setBody(DescribeOrganizationUserCertsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrganizationUserCertsResponseBody getBody() {
        return this.body;
    }

}
