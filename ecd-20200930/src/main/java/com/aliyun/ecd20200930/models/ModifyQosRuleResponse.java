// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyQosRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyQosRuleResponseBody body;

    public static ModifyQosRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyQosRuleResponse self = new ModifyQosRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyQosRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyQosRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyQosRuleResponse setBody(ModifyQosRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyQosRuleResponseBody getBody() {
        return this.body;
    }

}
