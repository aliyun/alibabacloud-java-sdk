// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAlertContactResponseBody body;

    public static DeleteAlertContactResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactResponse self = new DeleteAlertContactResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertContactResponse setBody(DeleteAlertContactResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertContactResponseBody getBody() {
        return this.body;
    }

}
