// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteDialogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDialogResponseBody body;

    public static DeleteDialogResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDialogResponse self = new DeleteDialogResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDialogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDialogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDialogResponse setBody(DeleteDialogResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDialogResponseBody getBody() {
        return this.body;
    }

}
