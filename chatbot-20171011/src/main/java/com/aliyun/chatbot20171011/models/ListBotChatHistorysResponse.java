// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotChatHistorysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBotChatHistorysResponseBody body;

    public static ListBotChatHistorysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBotChatHistorysResponse self = new ListBotChatHistorysResponse();
        return TeaModel.build(map, self);
    }

    public ListBotChatHistorysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBotChatHistorysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBotChatHistorysResponse setBody(ListBotChatHistorysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBotChatHistorysResponseBody getBody() {
        return this.body;
    }

}
