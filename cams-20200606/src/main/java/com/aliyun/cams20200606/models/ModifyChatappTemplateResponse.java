// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyChatappTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyChatappTemplateResponseBody body;

    public static ModifyChatappTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyChatappTemplateResponse self = new ModifyChatappTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyChatappTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyChatappTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyChatappTemplateResponse setBody(ModifyChatappTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyChatappTemplateResponseBody getBody() {
        return this.body;
    }

}
