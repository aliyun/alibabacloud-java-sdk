// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateAppUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateAppUserPasswordResponseBody body;

    public static GenerateAppUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAppUserPasswordResponse self = new GenerateAppUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAppUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAppUserPasswordResponse setBody(GenerateAppUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAppUserPasswordResponseBody getBody() {
        return this.body;
    }

}
