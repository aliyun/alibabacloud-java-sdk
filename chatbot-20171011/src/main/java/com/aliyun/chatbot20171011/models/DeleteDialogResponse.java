// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteDialogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteDialogResponse setBody(DeleteDialogResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDialogResponseBody getBody() {
        return this.body;
    }

}
