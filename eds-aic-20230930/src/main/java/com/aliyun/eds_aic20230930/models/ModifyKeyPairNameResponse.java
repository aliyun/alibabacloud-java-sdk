// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyKeyPairNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyKeyPairNameResponseBody body;

    public static ModifyKeyPairNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyKeyPairNameResponse self = new ModifyKeyPairNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyKeyPairNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyKeyPairNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyKeyPairNameResponse setBody(ModifyKeyPairNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyKeyPairNameResponseBody getBody() {
        return this.body;
    }

}
