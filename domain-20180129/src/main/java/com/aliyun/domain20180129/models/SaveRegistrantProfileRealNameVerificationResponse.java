// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveRegistrantProfileRealNameVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveRegistrantProfileRealNameVerificationResponseBody body;

    public static SaveRegistrantProfileRealNameVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveRegistrantProfileRealNameVerificationResponse self = new SaveRegistrantProfileRealNameVerificationResponse();
        return TeaModel.build(map, self);
    }

    public SaveRegistrantProfileRealNameVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveRegistrantProfileRealNameVerificationResponse setBody(SaveRegistrantProfileRealNameVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveRegistrantProfileRealNameVerificationResponseBody getBody() {
        return this.body;
    }

}
