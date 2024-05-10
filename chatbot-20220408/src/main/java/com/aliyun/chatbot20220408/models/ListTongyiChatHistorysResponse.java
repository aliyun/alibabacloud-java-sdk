// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListTongyiChatHistorysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTongyiChatHistorysResponseBody body;

    public static ListTongyiChatHistorysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTongyiChatHistorysResponse self = new ListTongyiChatHistorysResponse();
        return TeaModel.build(map, self);
    }

    public ListTongyiChatHistorysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTongyiChatHistorysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTongyiChatHistorysResponse setBody(ListTongyiChatHistorysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTongyiChatHistorysResponseBody getBody() {
        return this.body;
    }

}
