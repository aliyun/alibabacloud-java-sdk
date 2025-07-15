// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CheckLiveMessageUsersOnlineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckLiveMessageUsersOnlineResponseBody body;

    public static CheckLiveMessageUsersOnlineResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLiveMessageUsersOnlineResponse self = new CheckLiveMessageUsersOnlineResponse();
        return TeaModel.build(map, self);
    }

    public CheckLiveMessageUsersOnlineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLiveMessageUsersOnlineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckLiveMessageUsersOnlineResponse setBody(CheckLiveMessageUsersOnlineResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLiveMessageUsersOnlineResponseBody getBody() {
        return this.body;
    }

}
