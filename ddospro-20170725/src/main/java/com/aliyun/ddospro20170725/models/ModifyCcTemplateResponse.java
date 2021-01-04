// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyCcTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCcTemplateResponseBody body;

    public static ModifyCcTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCcTemplateResponse self = new ModifyCcTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCcTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCcTemplateResponse setBody(ModifyCcTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCcTemplateResponseBody getBody() {
        return this.body;
    }

}
