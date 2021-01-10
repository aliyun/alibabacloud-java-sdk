// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ReleaseBuiltinFunctionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseBuiltinFunctionTemplateResponseBody body;

    public static ReleaseBuiltinFunctionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseBuiltinFunctionTemplateResponse self = new ReleaseBuiltinFunctionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseBuiltinFunctionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseBuiltinFunctionTemplateResponse setBody(ReleaseBuiltinFunctionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseBuiltinFunctionTemplateResponseBody getBody() {
        return this.body;
    }

}
