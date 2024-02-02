// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDeploymentSetSupportedInstanceTypeFamilyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody body;

    public static DescribeDeploymentSetSupportedInstanceTypeFamilyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentSetSupportedInstanceTypeFamilyResponse self = new DescribeDeploymentSetSupportedInstanceTypeFamilyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyResponse setBody(DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody getBody() {
        return this.body;
    }

}
