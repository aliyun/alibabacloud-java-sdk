// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CheckLiveMessageUsersInGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckLiveMessageUsersInGroupResponseBody body;

    public static CheckLiveMessageUsersInGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLiveMessageUsersInGroupResponse self = new CheckLiveMessageUsersInGroupResponse();
        return TeaModel.build(map, self);
    }

    public CheckLiveMessageUsersInGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLiveMessageUsersInGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckLiveMessageUsersInGroupResponse setBody(CheckLiveMessageUsersInGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLiveMessageUsersInGroupResponseBody getBody() {
        return this.body;
    }

}
