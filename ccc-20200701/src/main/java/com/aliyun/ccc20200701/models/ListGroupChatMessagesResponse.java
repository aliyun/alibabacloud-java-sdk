// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListGroupChatMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGroupChatMessagesResponseBody body;

    public static ListGroupChatMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupChatMessagesResponse self = new ListGroupChatMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupChatMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupChatMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGroupChatMessagesResponse setBody(ListGroupChatMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupChatMessagesResponseBody getBody() {
        return this.body;
    }

}
