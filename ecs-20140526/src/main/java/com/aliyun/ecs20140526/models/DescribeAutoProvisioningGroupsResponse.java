// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAutoProvisioningGroupsResponseBody body;

    public static DescribeAutoProvisioningGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupsResponse self = new DescribeAutoProvisioningGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoProvisioningGroupsResponse setBody(DescribeAutoProvisioningGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoProvisioningGroupsResponseBody getBody() {
        return this.body;
    }

}
