// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteK8sIngressRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteK8sIngressRuleResponseBody body;

    public static DeleteK8sIngressRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteK8sIngressRuleResponse self = new DeleteK8sIngressRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteK8sIngressRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteK8sIngressRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteK8sIngressRuleResponse setBody(DeleteK8sIngressRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteK8sIngressRuleResponseBody getBody() {
        return this.body;
    }

}
