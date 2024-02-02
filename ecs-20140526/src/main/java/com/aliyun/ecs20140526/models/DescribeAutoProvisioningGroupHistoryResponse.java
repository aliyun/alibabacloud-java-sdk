// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeAutoProvisioningGroupHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoProvisioningGroupHistoryResponse setBody(DescribeAutoProvisioningGroupHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoProvisioningGroupHistoryResponseBody getBody() {
        return this.body;
    }

}
