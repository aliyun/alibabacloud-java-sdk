// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AddPhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddPhoneNumberResponseBody body;

    public static AddPhoneNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPhoneNumberResponse self = new AddPhoneNumberResponse();
        return TeaModel.build(map, self);
    }

    public AddPhoneNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPhoneNumberResponse setBody(AddPhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPhoneNumberResponseBody getBody() {
        return this.body;
    }

}
