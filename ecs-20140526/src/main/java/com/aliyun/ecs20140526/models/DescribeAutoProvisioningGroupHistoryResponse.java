// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAutoProvisioningGroupHistoryResponseBody body;

    public static DescribeAutoProvisioningGroupHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupHistoryResponse self = new DescribeAutoProvisioningGroupHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoProvisioningGroupHistoryResponse setBody(DescribeAutoProvisioningGroupHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoProvisioningGroupHistoryResponseBody getBody() {
        return this.body;
    }

}
