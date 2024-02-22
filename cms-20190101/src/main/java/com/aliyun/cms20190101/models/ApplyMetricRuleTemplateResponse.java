// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ApplyMetricRuleTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyMetricRuleTemplateResponseBody body;

    public static ApplyMetricRuleTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyMetricRuleTemplateResponse self = new ApplyMetricRuleTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ApplyMetricRuleTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyMetricRuleTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyMetricRuleTemplateResponse setBody(ApplyMetricRuleTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyMetricRuleTemplateResponseBody getBody() {
        return this.body;
    }

}
