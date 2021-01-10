// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveBuiltinFunctionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveBuiltinFunctionTemplateResponseBody body;

    public static SaveBuiltinFunctionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBuiltinFunctionTemplateResponse self = new SaveBuiltinFunctionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public SaveBuiltinFunctionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBuiltinFunctionTemplateResponse setBody(SaveBuiltinFunctionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBuiltinFunctionTemplateResponseBody getBody() {
        return this.body;
    }

}
