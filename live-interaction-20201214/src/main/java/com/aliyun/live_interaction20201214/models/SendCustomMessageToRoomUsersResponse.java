// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SendCustomMessageToRoomUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendCustomMessageToRoomUsersResponseBody body;

    public static SendCustomMessageToRoomUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCustomMessageToRoomUsersResponse self = new SendCustomMessageToRoomUsersResponse();
        return TeaModel.build(map, self);
    }

    public SendCustomMessageToRoomUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCustomMessageToRoomUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendCustomMessageToRoomUsersResponse setBody(SendCustomMessageToRoomUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCustomMessageToRoomUsersResponseBody getBody() {
        return this.body;
    }

}
