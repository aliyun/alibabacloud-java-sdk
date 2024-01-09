// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRecoveryPlanResponseBody body;

    public static DescribeRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoveryPlanResponse self = new DescribeRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecoveryPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecoveryPlanResponse setBody(DescribeRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
