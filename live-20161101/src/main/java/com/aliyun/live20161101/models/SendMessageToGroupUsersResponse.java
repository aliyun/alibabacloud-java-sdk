// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendMessageToGroupUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendMessageToGroupUsersResponseBody body;

    public static SendMessageToGroupUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGroupUsersResponse self = new SendMessageToGroupUsersResponse();
        return TeaModel.build(map, self);
    }

    public SendMessageToGroupUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendMessageToGroupUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendMessageToGroupUsersResponse setBody(SendMessageToGroupUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public SendMessageToGroupUsersResponseBody getBody() {
        return this.body;
    }

}
