// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstanceMaintenanceAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceMaintenanceAttributesResponseBody body;

    public static DescribeInstanceMaintenanceAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMaintenanceAttributesResponse self = new DescribeInstanceMaintenanceAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMaintenanceAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceMaintenanceAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceMaintenanceAttributesResponse setBody(DescribeInstanceMaintenanceAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceMaintenanceAttributesResponseBody getBody() {
        return this.body;
    }

}
