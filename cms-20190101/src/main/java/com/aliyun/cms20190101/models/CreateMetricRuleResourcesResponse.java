// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMetricRuleResourcesResponseBody body;

    public static CreateMetricRuleResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricRuleResourcesResponse self = new CreateMetricRuleResourcesResponse();
        return TeaModel.build(map, self);
    }

    public CreateMetricRuleResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMetricRuleResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMetricRuleResourcesResponse setBody(CreateMetricRuleResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMetricRuleResourcesResponseBody getBody() {
        return this.body;
    }

}
