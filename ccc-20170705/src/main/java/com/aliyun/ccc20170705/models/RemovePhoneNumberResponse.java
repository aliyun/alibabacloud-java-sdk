// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class RemovePhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemovePhoneNumberResponseBody body;

    public static RemovePhoneNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        RemovePhoneNumberResponse self = new RemovePhoneNumberResponse();
        return TeaModel.build(map, self);
    }

    public RemovePhoneNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemovePhoneNumberResponse setBody(RemovePhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePhoneNumberResponseBody getBody() {
        return this.body;
    }

}
