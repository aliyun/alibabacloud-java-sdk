// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class AddSecretBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSecretBlacklistResponseBody body;

    public static AddSecretBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSecretBlacklistResponse self = new AddSecretBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public AddSecretBlacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSecretBlacklistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSecretBlacklistResponse setBody(AddSecretBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSecretBlacklistResponseBody getBody() {
        return this.body;
    }

}
