// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMetricRuleTargetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PutMetricRuleTargetsResponseBody body;

    public static PutMetricRuleTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        PutMetricRuleTargetsResponse self = new PutMetricRuleTargetsResponse();
        return TeaModel.build(map, self);
    }

    public PutMetricRuleTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutMetricRuleTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutMetricRuleTargetsResponse setBody(PutMetricRuleTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public PutMetricRuleTargetsResponseBody getBody() {
        return this.body;
    }

}
