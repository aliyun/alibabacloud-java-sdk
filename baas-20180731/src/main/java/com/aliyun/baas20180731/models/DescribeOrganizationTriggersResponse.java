// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationTriggersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrganizationTriggersResponseBody body;

    public static DescribeOrganizationTriggersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationTriggersResponse self = new DescribeOrganizationTriggersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationTriggersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrganizationTriggersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrganizationTriggersResponse setBody(DescribeOrganizationTriggersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrganizationTriggersResponseBody getBody() {
        return this.body;
    }

}
