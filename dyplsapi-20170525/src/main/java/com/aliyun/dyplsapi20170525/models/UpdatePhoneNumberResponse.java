// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdatePhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePhoneNumberResponseBody body;

    public static UpdatePhoneNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhoneNumberResponse self = new UpdatePhoneNumberResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePhoneNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePhoneNumberResponse setBody(UpdatePhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePhoneNumberResponseBody getBody() {
        return this.body;
    }

}
