// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCCRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebCCRuleResponseBody body;

    public static ModifyWebCCRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCCRuleResponse self = new ModifyWebCCRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebCCRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebCCRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebCCRuleResponse setBody(ModifyWebCCRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebCCRuleResponseBody getBody() {
        return this.body;
    }

}
