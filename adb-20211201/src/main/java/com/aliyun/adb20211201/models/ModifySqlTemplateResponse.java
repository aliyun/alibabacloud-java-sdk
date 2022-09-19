// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifySqlTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySqlTemplateResponseBody body;

    public static ModifySqlTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySqlTemplateResponse self = new ModifySqlTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifySqlTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySqlTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySqlTemplateResponse setBody(ModifySqlTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySqlTemplateResponseBody getBody() {
        return this.body;
    }

}
