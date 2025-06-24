// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateChatGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateChatGroupResponseBody body;

    public static UpdateChatGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateChatGroupResponse self = new UpdateChatGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateChatGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateChatGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateChatGroupResponse setBody(UpdateChatGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateChatGroupResponseBody getBody() {
        return this.body;
    }

}
