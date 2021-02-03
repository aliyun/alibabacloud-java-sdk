// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeGtmRecoveryPlanResponse setBody(DescribeGtmRecoveryPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmRecoveryPlanResponseBody getBody() {
        return this.body;
    }

}
