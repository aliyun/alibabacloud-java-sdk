// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeFlexibleProtectionFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlexibleProtectionFlowResponseBody body;

    public static DescribeFlexibleProtectionFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexibleProtectionFlowResponse self = new DescribeFlexibleProtectionFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlexibleProtectionFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlexibleProtectionFlowResponse setBody(DescribeFlexibleProtectionFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlexibleProtectionFlowResponseBody getBody() {
        return this.body;
    }

}
