// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class RegistrantProfileRealNameVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegistrantProfileRealNameVerificationResponseBody body;

    public static RegistrantProfileRealNameVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        RegistrantProfileRealNameVerificationResponse self = new RegistrantProfileRealNameVerificationResponse();
        return TeaModel.build(map, self);
    }

    public RegistrantProfileRealNameVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegistrantProfileRealNameVerificationResponse setBody(RegistrantProfileRealNameVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public RegistrantProfileRealNameVerificationResponseBody getBody() {
        return this.body;
    }

}
