// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGtmRecoveryPlanResponseBody body;

    public static DescribeGtmRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlanResponse self = new DescribeGtmRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmRecoveryPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmRecoveryPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGtmRecoveryPlanResponse setBody(DescribeGtmRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
