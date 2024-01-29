// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListUserSayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserSayResponseBody body;

    public static ListUserSayResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserSayResponse self = new ListUserSayResponse();
        return TeaModel.build(map, self);
    }

    public ListUserSayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserSayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserSayResponse setBody(ListUserSayResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserSayResponseBody getBody() {
        return this.body;
    }

}
