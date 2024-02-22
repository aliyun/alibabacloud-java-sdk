// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMetricRuleTargetsResponseBody body;

    public static DeleteMetricRuleTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleTargetsResponse self = new DeleteMetricRuleTargetsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRuleTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMetricRuleTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMetricRuleTargetsResponse setBody(DeleteMetricRuleTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetricRuleTargetsResponseBody getBody() {
        return this.body;
    }

}
