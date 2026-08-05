// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ModifyAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppInfoResponseBody body;

    public static ModifyAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInfoResponse self = new ModifyAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppInfoResponse setBody(ModifyAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppInfoResponseBody getBody() {
        return this.body;
    }

}
