// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyAiServiceProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAiServiceProtectionResponseBody body;

    public static ModifyAiServiceProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAiServiceProtectionResponse self = new ModifyAiServiceProtectionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAiServiceProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAiServiceProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAiServiceProtectionResponse setBody(ModifyAiServiceProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAiServiceProtectionResponseBody getBody() {
        return this.body;
    }

}
