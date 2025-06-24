// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteChatGroupInviteLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteChatGroupInviteLinkResponseBody body;

    public static DeleteChatGroupInviteLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatGroupInviteLinkResponse self = new DeleteChatGroupInviteLinkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChatGroupInviteLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChatGroupInviteLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteChatGroupInviteLinkResponse setBody(DeleteChatGroupInviteLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChatGroupInviteLinkResponseBody getBody() {
        return this.body;
    }

}
