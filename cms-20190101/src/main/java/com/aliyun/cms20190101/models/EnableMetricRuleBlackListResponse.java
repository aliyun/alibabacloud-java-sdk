// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableMetricRuleBlackListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableMetricRuleBlackListResponseBody body;

    public static EnableMetricRuleBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMetricRuleBlackListResponse self = new EnableMetricRuleBlackListResponse();
        return TeaModel.build(map, self);
    }

    public EnableMetricRuleBlackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMetricRuleBlackListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableMetricRuleBlackListResponse setBody(EnableMetricRuleBlackListResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMetricRuleBlackListResponseBody getBody() {
        return this.body;
    }

}
