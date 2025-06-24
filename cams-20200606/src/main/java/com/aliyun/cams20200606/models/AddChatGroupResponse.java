// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddChatGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddChatGroupResponseBody body;

    public static AddChatGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddChatGroupResponse self = new AddChatGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddChatGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddChatGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddChatGroupResponse setBody(AddChatGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddChatGroupResponseBody getBody() {
        return this.body;
    }

}
