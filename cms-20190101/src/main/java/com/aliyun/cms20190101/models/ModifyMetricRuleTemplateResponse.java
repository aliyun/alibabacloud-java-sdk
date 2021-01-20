// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMetricRuleTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyMetricRuleTemplateResponse setBody(ModifyMetricRuleTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMetricRuleTemplateResponseBody getBody() {
        return this.body;
    }

}
