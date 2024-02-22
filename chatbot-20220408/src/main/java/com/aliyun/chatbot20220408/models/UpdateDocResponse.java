// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDocResponseBody body;

    public static UpdateDocResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocResponse self = new UpdateDocResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDocResponse setBody(UpdateDocResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDocResponseBody getBody() {
        return this.body;
    }

}
