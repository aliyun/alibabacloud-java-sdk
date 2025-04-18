// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ModifyFullLogTtlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyFullLogTtlResponseBody body;

    public static ModifyFullLogTtlResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFullLogTtlResponse self = new ModifyFullLogTtlResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFullLogTtlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFullLogTtlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFullLogTtlResponse setBody(ModifyFullLogTtlResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFullLogTtlResponseBody getBody() {
        return this.body;
    }

}
