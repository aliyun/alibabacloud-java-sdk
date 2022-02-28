// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class GenerateActivateCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateActivateCodeResponseBody body;

    public static GenerateActivateCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateActivateCodeResponse self = new GenerateActivateCodeResponse();
        return TeaModel.build(map, self);
    }

    public GenerateActivateCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateActivateCodeResponse setBody(GenerateActivateCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateActivateCodeResponseBody getBody() {
        return this.body;
    }

}
