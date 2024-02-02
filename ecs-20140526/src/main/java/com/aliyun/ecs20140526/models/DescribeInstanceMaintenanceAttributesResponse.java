// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceMaintenanceAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
