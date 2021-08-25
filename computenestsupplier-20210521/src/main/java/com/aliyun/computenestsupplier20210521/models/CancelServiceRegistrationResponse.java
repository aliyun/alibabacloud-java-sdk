// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CancelServiceRegistrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelServiceRegistrationResponseBody body;

    public static CancelServiceRegistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelServiceRegistrationResponse self = new CancelServiceRegistrationResponse();
        return TeaModel.build(map, self);
    }

    public CancelServiceRegistrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelServiceRegistrationResponse setBody(CancelServiceRegistrationResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelServiceRegistrationResponseBody getBody() {
        return this.body;
    }

}
