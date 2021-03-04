// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetResellerUserQuotaResponseBody body;

    public static SetResellerUserQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        SetResellerUserQuotaResponse self = new SetResellerUserQuotaResponse();
        return TeaModel.build(map, self);
    }

    public SetResellerUserQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetResellerUserQuotaResponse setBody(SetResellerUserQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public SetResellerUserQuotaResponseBody getBody() {
        return this.body;
    }

}
