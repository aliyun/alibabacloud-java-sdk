// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHostInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHostInfoResponseBody body;

    public static ModifyHostInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostInfoResponse self = new ModifyHostInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHostInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHostInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHostInfoResponse setBody(ModifyHostInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHostInfoResponseBody getBody() {
        return this.body;
    }

}
