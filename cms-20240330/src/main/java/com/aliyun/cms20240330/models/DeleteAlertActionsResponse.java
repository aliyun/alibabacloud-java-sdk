// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAlertActionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAlertActionsResponseBody body;

    public static DeleteAlertActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertActionsResponse self = new DeleteAlertActionsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertActionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertActionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlertActionsResponse setBody(DeleteAlertActionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertActionsResponseBody getBody() {
        return this.body;
    }

}
