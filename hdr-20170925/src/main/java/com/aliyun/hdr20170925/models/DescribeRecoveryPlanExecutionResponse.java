// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPlanExecutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRecoveryPlanExecutionResponseBody body;

    public static DescribeRecoveryPlanExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoveryPlanExecutionResponse self = new DescribeRecoveryPlanExecutionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecoveryPlanExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecoveryPlanExecutionResponse setBody(DescribeRecoveryPlanExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecoveryPlanExecutionResponseBody getBody() {
        return this.body;
    }

}
