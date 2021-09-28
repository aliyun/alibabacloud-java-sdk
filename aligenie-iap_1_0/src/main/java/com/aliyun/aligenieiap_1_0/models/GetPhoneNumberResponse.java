// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetPhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPhoneNumberResponseBody body;

    public static GetPhoneNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberResponse self = new GetPhoneNumberResponse();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhoneNumberResponse setBody(GetPhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhoneNumberResponseBody getBody() {
        return this.body;
    }

}
