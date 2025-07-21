// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChatappMessageResponseBody body;

    public static ListChatappMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChatappMessageResponse self = new ListChatappMessageResponse();
        return TeaModel.build(map, self);
    }

    public ListChatappMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChatappMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChatappMessageResponse setBody(ListChatappMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChatappMessageResponseBody getBody() {
        return this.body;
    }

}
