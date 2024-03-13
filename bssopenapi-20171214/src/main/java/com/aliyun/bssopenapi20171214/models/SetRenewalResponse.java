// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetRenewalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetRenewalResponseBody body;

    public static SetRenewalResponse build(java.util.Map<String, ?> map) throws Exception {
        SetRenewalResponse self = new SetRenewalResponse();
        return TeaModel.build(map, self);
    }

    public SetRenewalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetRenewalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetRenewalResponse setBody(SetRenewalResponseBody body) {
        this.body = body;
        return this;
    }
    public SetRenewalResponseBody getBody() {
        return this.body;
    }

}
