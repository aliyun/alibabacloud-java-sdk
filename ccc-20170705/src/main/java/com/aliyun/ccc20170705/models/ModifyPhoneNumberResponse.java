// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyPhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPhoneNumberResponseBody body;

    public static ModifyPhoneNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhoneNumberResponse self = new ModifyPhoneNumberResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPhoneNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPhoneNumberResponse setBody(ModifyPhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPhoneNumberResponseBody getBody() {
        return this.body;
    }

}
