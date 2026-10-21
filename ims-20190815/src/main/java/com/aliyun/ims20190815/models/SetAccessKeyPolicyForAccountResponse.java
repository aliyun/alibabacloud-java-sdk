// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetAccessKeyPolicyForAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAccessKeyPolicyForAccountResponseBody body;

    public static SetAccessKeyPolicyForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAccessKeyPolicyForAccountResponse self = new SetAccessKeyPolicyForAccountResponse();
        return TeaModel.build(map, self);
    }

    public SetAccessKeyPolicyForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAccessKeyPolicyForAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAccessKeyPolicyForAccountResponse setBody(SetAccessKeyPolicyForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAccessKeyPolicyForAccountResponseBody getBody() {
        return this.body;
    }

}
