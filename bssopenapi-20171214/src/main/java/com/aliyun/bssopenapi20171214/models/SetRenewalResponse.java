// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetRenewalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetRenewalResponse setBody(SetRenewalResponseBody body) {
        this.body = body;
        return this;
    }
    public SetRenewalResponseBody getBody() {
        return this.body;
    }

}
