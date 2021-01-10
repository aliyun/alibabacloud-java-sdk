// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class VerifyBuiltinFunctionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyBuiltinFunctionTemplateResponseBody body;

    public static VerifyBuiltinFunctionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyBuiltinFunctionTemplateResponse self = new VerifyBuiltinFunctionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public VerifyBuiltinFunctionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyBuiltinFunctionTemplateResponse setBody(VerifyBuiltinFunctionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyBuiltinFunctionTemplateResponseBody getBody() {
        return this.body;
    }

}
