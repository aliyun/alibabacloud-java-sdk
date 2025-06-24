// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddChatGroupInviteLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddChatGroupInviteLinkResponseBody body;

    public static AddChatGroupInviteLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        AddChatGroupInviteLinkResponse self = new AddChatGroupInviteLinkResponse();
        return TeaModel.build(map, self);
    }

    public AddChatGroupInviteLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddChatGroupInviteLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddChatGroupInviteLinkResponse setBody(AddChatGroupInviteLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public AddChatGroupInviteLinkResponseBody getBody() {
        return this.body;
    }

}
