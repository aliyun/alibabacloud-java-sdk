// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateDialogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDialogResponseBody body;

    public static UpdateDialogResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDialogResponse self = new UpdateDialogResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDialogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDialogResponse setBody(UpdateDialogResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDialogResponseBody getBody() {
        return this.body;
    }

}
