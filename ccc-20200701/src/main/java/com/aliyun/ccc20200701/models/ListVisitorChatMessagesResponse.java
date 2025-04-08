// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListVisitorChatMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVisitorChatMessagesResponseBody body;

    public static ListVisitorChatMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVisitorChatMessagesResponse self = new ListVisitorChatMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListVisitorChatMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVisitorChatMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVisitorChatMessagesResponse setBody(ListVisitorChatMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVisitorChatMessagesResponseBody getBody() {
        return this.body;
    }

}
