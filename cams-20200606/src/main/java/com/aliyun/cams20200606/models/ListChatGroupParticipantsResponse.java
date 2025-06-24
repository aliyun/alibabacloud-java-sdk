// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatGroupParticipantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChatGroupParticipantsResponseBody body;

    public static ListChatGroupParticipantsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChatGroupParticipantsResponse self = new ListChatGroupParticipantsResponse();
        return TeaModel.build(map, self);
    }

    public ListChatGroupParticipantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChatGroupParticipantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChatGroupParticipantsResponse setBody(ListChatGroupParticipantsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChatGroupParticipantsResponseBody getBody() {
        return this.body;
    }

}
