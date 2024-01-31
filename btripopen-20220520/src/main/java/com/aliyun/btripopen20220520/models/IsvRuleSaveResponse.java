// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IsvRuleSaveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IsvRuleSaveResponseBody body;

    public static IsvRuleSaveResponse build(java.util.Map<String, ?> map) throws Exception {
        IsvRuleSaveResponse self = new IsvRuleSaveResponse();
        return TeaModel.build(map, self);
    }

    public IsvRuleSaveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IsvRuleSaveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IsvRuleSaveResponse setBody(IsvRuleSaveResponseBody body) {
        this.body = body;
        return this;
    }
    public IsvRuleSaveResponseBody getBody() {
        return this.body;
    }

}
