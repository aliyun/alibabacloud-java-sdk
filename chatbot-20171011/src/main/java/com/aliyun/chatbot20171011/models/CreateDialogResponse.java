// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateDialogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateDialogResponse setBody(CreateDialogResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDialogResponseBody getBody() {
        return this.body;
    }

}
