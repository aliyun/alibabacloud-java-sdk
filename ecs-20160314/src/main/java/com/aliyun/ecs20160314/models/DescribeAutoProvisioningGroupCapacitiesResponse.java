// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupCapacitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAutoProvisioningGroupCapacitiesResponseBody body;

    public static DescribeAutoProvisioningGroupCapacitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupCapacitiesResponse self = new DescribeAutoProvisioningGroupCapacitiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupCapacitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoProvisioningGroupCapacitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoProvisioningGroupCapacitiesResponse setBody(DescribeAutoProvisioningGroupCapacitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoProvisioningGroupCapacitiesResponseBody getBody() {
        return this.body;
    }

}
