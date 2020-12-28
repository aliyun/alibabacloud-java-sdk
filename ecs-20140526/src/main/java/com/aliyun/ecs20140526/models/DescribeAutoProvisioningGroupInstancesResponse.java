// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAutoProvisioningGroupInstancesResponseBody body;

    public static DescribeAutoProvisioningGroupInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupInstancesResponse self = new DescribeAutoProvisioningGroupInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoProvisioningGroupInstancesResponse setBody(DescribeAutoProvisioningGroupInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoProvisioningGroupInstancesResponseBody getBody() {
        return this.body;
    }

}
