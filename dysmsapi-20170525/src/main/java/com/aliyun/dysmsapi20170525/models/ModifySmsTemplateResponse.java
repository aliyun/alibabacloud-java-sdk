// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ModifySmsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySmsTemplateResponseBody body;

    public static ModifySmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySmsTemplateResponse self = new ModifySmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifySmsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySmsTemplateResponse setBody(ModifySmsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySmsTemplateResponseBody getBody() {
        return this.body;
    }

}
