// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sIngressRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateK8sIngressRuleResponseBody body;

    public static UpdateK8sIngressRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sIngressRuleResponse self = new UpdateK8sIngressRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateK8sIngressRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateK8sIngressRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateK8sIngressRuleResponse setBody(UpdateK8sIngressRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateK8sIngressRuleResponseBody getBody() {
        return this.body;
    }

}
