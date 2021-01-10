// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateBuiltinFunctionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBuiltinFunctionTemplateResponseBody body;

    public static CreateBuiltinFunctionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBuiltinFunctionTemplateResponse self = new CreateBuiltinFunctionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateBuiltinFunctionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBuiltinFunctionTemplateResponse setBody(CreateBuiltinFunctionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBuiltinFunctionTemplateResponseBody getBody() {
        return this.body;
    }

}
