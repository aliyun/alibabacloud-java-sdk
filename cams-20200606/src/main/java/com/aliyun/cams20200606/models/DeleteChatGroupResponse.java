// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteChatGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteChatGroupResponseBody body;

    public static DeleteChatGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatGroupResponse self = new DeleteChatGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChatGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChatGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteChatGroupResponse setBody(DeleteChatGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChatGroupResponseBody getBody() {
        return this.body;
    }

}
