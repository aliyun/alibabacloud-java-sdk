// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class ModifyTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTemplateResponseBody body;

    public static ModifyTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateResponse self = new ModifyTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTemplateResponse setBody(ModifyTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTemplateResponseBody getBody() {
        return this.body;
    }

}
