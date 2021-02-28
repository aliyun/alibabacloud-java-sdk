// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListConversationLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConversationLogsResponseBody body;

    public static ListConversationLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConversationLogsResponse self = new ListConversationLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListConversationLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConversationLogsResponse setBody(ListConversationLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConversationLogsResponseBody getBody() {
        return this.body;
    }

}
