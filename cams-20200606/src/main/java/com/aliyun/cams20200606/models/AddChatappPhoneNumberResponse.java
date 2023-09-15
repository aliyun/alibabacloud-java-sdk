// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddChatappPhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddChatappPhoneNumberResponseBody body;

    public static AddChatappPhoneNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddChatappPhoneNumberResponse self = new AddChatappPhoneNumberResponse();
        return TeaModel.build(map, self);
    }

    public AddChatappPhoneNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddChatappPhoneNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddChatappPhoneNumberResponse setBody(AddChatappPhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddChatappPhoneNumberResponseBody getBody() {
        return this.body;
    }

}
