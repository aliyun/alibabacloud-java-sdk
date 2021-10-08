// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateAlertContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAlertContactResponseBody body;

    public static CreateAlertContactResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactResponse self = new CreateAlertContactResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlertContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlertContactResponse setBody(CreateAlertContactResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlertContactResponseBody getBody() {
        return this.body;
    }

}
