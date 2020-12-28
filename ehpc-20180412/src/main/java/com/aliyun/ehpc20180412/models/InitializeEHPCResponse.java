// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InitializeEHPCResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitializeEHPCResponseBody body;

    public static InitializeEHPCResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeEHPCResponse self = new InitializeEHPCResponse();
        return TeaModel.build(map, self);
    }

    public InitializeEHPCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeEHPCResponse setBody(InitializeEHPCResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeEHPCResponseBody getBody() {
        return this.body;
    }

}
