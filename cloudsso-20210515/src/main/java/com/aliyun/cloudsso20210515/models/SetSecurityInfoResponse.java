// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetSecurityInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetSecurityInfoResponseBody body;

    public static SetSecurityInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityInfoResponse self = new SetSecurityInfoResponse();
        return TeaModel.build(map, self);
    }

    public SetSecurityInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSecurityInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSecurityInfoResponse setBody(SetSecurityInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSecurityInfoResponseBody getBody() {
        return this.body;
    }

}
