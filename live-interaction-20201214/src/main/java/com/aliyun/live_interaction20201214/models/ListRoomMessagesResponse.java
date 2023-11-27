// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListRoomMessagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRoomMessagesResponseBody body;

    public static ListRoomMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoomMessagesResponse self = new ListRoomMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListRoomMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRoomMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRoomMessagesResponse setBody(ListRoomMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRoomMessagesResponseBody getBody() {
        return this.body;
    }

}
