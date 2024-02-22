// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMetricRuleTemplateResponseBody body;

    public static DeleteMetricRuleTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleTemplateResponse self = new DeleteMetricRuleTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRuleTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMetricRuleTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMetricRuleTemplateResponse setBody(DeleteMetricRuleTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetricRuleTemplateResponseBody getBody() {
        return this.body;
    }

}
