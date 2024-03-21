// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateDialogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDialogResponseBody body;

    public static CreateDialogResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDialogResponse self = new CreateDialogResponse();
        return TeaModel.build(map, self);
    }

    public CreateDialogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDialogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDialogResponse setBody(CreateDialogResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDialogResponseBody getBody() {
        return this.body;
    }

}
