// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeletePerspectiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePerspectiveResponseBody body;

    public static DeletePerspectiveResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePerspectiveResponse self = new DeletePerspectiveResponse();
        return TeaModel.build(map, self);
    }

    public DeletePerspectiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePerspectiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePerspectiveResponse setBody(DeletePerspectiveResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePerspectiveResponseBody getBody() {
        return this.body;
    }

}
