// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ModifyServiceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyServiceInfoResponseBody body;

    public static ModifyServiceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyServiceInfoResponse self = new ModifyServiceInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyServiceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyServiceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyServiceInfoResponse setBody(ModifyServiceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyServiceInfoResponseBody getBody() {
        return this.body;
    }

}
