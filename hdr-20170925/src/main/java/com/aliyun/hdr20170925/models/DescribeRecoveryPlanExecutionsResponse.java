// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPlanExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRecoveryPlanExecutionsResponseBody body;

    public static DescribeRecoveryPlanExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoveryPlanExecutionsResponse self = new DescribeRecoveryPlanExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecoveryPlanExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecoveryPlanExecutionsResponse setBody(DescribeRecoveryPlanExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecoveryPlanExecutionsResponseBody getBody() {
        return this.body;
    }

}
