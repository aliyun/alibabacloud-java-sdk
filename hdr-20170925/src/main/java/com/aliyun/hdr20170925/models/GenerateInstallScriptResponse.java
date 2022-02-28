// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class GenerateInstallScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateInstallScriptResponseBody body;

    public static GenerateInstallScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateInstallScriptResponse self = new GenerateInstallScriptResponse();
        return TeaModel.build(map, self);
    }

    public GenerateInstallScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateInstallScriptResponse setBody(GenerateInstallScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateInstallScriptResponseBody getBody() {
        return this.body;
    }

}
