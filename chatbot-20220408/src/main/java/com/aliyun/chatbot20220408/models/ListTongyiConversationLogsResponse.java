// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListTongyiConversationLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTongyiConversationLogsResponseBody body;

    public static ListTongyiConversationLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTongyiConversationLogsResponse self = new ListTongyiConversationLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListTongyiConversationLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTongyiConversationLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTongyiConversationLogsResponse setBody(ListTongyiConversationLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTongyiConversationLogsResponseBody getBody() {
        return this.body;
    }

}
