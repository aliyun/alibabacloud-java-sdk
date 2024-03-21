// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateDialogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateDialogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDialogResponse setBody(UpdateDialogResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDialogResponseBody getBody() {
        return this.body;
    }

}
