// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateCoreWordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCoreWordResponseBody body;

    public static UpdateCoreWordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCoreWordResponse self = new UpdateCoreWordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCoreWordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCoreWordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCoreWordResponse setBody(UpdateCoreWordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCoreWordResponseBody getBody() {
        return this.body;
    }

}
