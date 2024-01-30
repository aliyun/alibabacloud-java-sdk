// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateK8sIngressRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateK8sIngressRuleResponseBody body;

    public static CreateK8sIngressRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateK8sIngressRuleResponse self = new CreateK8sIngressRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateK8sIngressRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateK8sIngressRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateK8sIngressRuleResponse setBody(CreateK8sIngressRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateK8sIngressRuleResponseBody getBody() {
        return this.body;
    }

}
