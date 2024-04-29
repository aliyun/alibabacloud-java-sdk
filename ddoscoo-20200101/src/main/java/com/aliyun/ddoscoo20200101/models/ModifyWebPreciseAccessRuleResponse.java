// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebPreciseAccessRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebPreciseAccessRuleResponseBody body;

    public static ModifyWebPreciseAccessRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebPreciseAccessRuleResponse self = new ModifyWebPreciseAccessRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebPreciseAccessRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebPreciseAccessRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebPreciseAccessRuleResponse setBody(ModifyWebPreciseAccessRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebPreciseAccessRuleResponseBody getBody() {
        return this.body;
    }

}
