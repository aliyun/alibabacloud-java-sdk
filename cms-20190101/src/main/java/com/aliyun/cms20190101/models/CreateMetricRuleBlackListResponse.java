// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleBlackListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMetricRuleBlackListResponseBody body;

    public static CreateMetricRuleBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricRuleBlackListResponse self = new CreateMetricRuleBlackListResponse();
        return TeaModel.build(map, self);
    }

    public CreateMetricRuleBlackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMetricRuleBlackListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMetricRuleBlackListResponse setBody(CreateMetricRuleBlackListResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMetricRuleBlackListResponseBody getBody() {
        return this.body;
    }

}
