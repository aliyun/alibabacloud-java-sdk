// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCacheCustomRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebCacheCustomRuleResponseBody body;

    public static ModifyWebCacheCustomRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCacheCustomRuleResponse self = new ModifyWebCacheCustomRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebCacheCustomRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebCacheCustomRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebCacheCustomRuleResponse setBody(ModifyWebCacheCustomRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebCacheCustomRuleResponseBody getBody() {
        return this.body;
    }

}
