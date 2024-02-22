// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMetricRuleTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMetricRuleTemplateResponseBody body;

    public static ModifyMetricRuleTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMetricRuleTemplateResponse self = new ModifyMetricRuleTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMetricRuleTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMetricRuleTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMetricRuleTemplateResponse setBody(ModifyMetricRuleTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMetricRuleTemplateResponseBody getBody() {
        return this.body;
    }

}
