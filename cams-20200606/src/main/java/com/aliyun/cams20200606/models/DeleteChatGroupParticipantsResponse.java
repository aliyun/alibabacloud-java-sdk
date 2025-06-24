// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteChatGroupParticipantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteChatGroupParticipantsResponseBody body;

    public static DeleteChatGroupParticipantsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatGroupParticipantsResponse self = new DeleteChatGroupParticipantsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChatGroupParticipantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChatGroupParticipantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteChatGroupParticipantsResponse setBody(DeleteChatGroupParticipantsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChatGroupParticipantsResponseBody getBody() {
        return this.body;
    }

}
