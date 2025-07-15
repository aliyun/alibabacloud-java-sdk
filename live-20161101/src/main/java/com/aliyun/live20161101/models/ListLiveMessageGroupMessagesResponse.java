// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveMessageGroupMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLiveMessageGroupMessagesResponseBody body;

    public static ListLiveMessageGroupMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveMessageGroupMessagesResponse self = new ListLiveMessageGroupMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveMessageGroupMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveMessageGroupMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveMessageGroupMessagesResponse setBody(ListLiveMessageGroupMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveMessageGroupMessagesResponseBody getBody() {
        return this.body;
    }

}
