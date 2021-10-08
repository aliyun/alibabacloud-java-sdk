// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutAlertContactResponseBody body;

    public static PutAlertContactResponse build(java.util.Map<String, ?> map) throws Exception {
        PutAlertContactResponse self = new PutAlertContactResponse();
        return TeaModel.build(map, self);
    }

    public PutAlertContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutAlertContactResponse setBody(PutAlertContactResponseBody body) {
        this.body = body;
        return this;
    }
    public PutAlertContactResponseBody getBody() {
        return this.body;
    }

}
