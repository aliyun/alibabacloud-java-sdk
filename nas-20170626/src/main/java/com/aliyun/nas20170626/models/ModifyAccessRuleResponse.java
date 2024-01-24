// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAccessRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAccessRuleResponseBody body;

    public static ModifyAccessRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessRuleResponse self = new ModifyAccessRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccessRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccessRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccessRuleResponse setBody(ModifyAccessRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccessRuleResponseBody getBody() {
        return this.body;
    }

}
