// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMetricRuleTemplateResponseBody body;

    public static CreateMetricRuleTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricRuleTemplateResponse self = new CreateMetricRuleTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateMetricRuleTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMetricRuleTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMetricRuleTemplateResponse setBody(CreateMetricRuleTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMetricRuleTemplateResponseBody getBody() {
        return this.body;
    }

}
