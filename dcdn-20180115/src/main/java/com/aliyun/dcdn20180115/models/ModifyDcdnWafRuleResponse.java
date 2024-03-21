// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDcdnWafRuleResponseBody body;

    public static ModifyDcdnWafRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDcdnWafRuleResponse self = new ModifyDcdnWafRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDcdnWafRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDcdnWafRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDcdnWafRuleResponse setBody(ModifyDcdnWafRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDcdnWafRuleResponseBody getBody() {
        return this.body;
    }

}
