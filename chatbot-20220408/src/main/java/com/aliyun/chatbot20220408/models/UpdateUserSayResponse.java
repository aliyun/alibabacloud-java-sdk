// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateUserSayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserSayResponseBody body;

    public static UpdateUserSayResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserSayResponse self = new UpdateUserSayResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserSayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserSayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserSayResponse setBody(UpdateUserSayResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserSayResponseBody getBody() {
        return this.body;
    }

}
