// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetVerificationInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetVerificationInfoResponseBody body;

    public static SetVerificationInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SetVerificationInfoResponse self = new SetVerificationInfoResponse();
        return TeaModel.build(map, self);
    }

    public SetVerificationInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetVerificationInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetVerificationInfoResponse setBody(SetVerificationInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SetVerificationInfoResponseBody getBody() {
        return this.body;
    }

}
