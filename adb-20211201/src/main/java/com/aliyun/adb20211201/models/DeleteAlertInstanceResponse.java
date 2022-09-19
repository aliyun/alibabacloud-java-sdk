// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteAlertInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAlertInstanceResponseBody body;

    public static DeleteAlertInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertInstanceResponse self = new DeleteAlertInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlertInstanceResponse setBody(DeleteAlertInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertInstanceResponseBody getBody() {
        return this.body;
    }

}
